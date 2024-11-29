import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends CALBaseListener {
    private final TACGenerator tacGenerator = new TACGenerator();
    private final Map<String, String> symbolTable = new HashMap<>();
    private String currentFunction = "";

    public TACGenerator getTACGenerator() {
        return tacGenerator;
    }

    @Override
    public void enterFunction_decl(CALParser.Function_declContext ctx) {
        currentFunction = ctx.ID().getText();
        System.out.println("DEBUG: Entering function: " + currentFunction);
        tacGenerator.addInstruction(currentFunction + ":");
    }

    @Override
    public void exitFunction_decl(CALParser.Function_declContext ctx) {
        System.out.println("DEBUG: Exiting function: " + currentFunction);
        currentFunction = "";
    }

    @Override
    public void enterMain_block(CALParser.Main_blockContext ctx) {
        currentFunction = "main";
        System.out.println("DEBUG: Entering main block");
        tacGenerator.addInstruction(currentFunction + ":");
    }

    @Override
    public void exitMain_block(CALParser.Main_blockContext ctx) {
        System.out.println("DEBUG: Exiting main block");
        tacGenerator.addInstruction("  call _exit, 0");
        currentFunction = "";
    }

    @Override
    public void enterVar_decl(CALParser.Var_declContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        System.out.println("DEBUG: Declaring variable: " + id + " of type " + type);
        symbolTable.put(id, type);
    }

    @Override
    public void enterAssign_stmt(CALParser.Assign_stmtContext ctx) {
        String id = ctx.ID().getText();
        String value = evaluateExpression(ctx.expr());
        System.out.println("DEBUG: Assigning " + value + " to " + id);
        tacGenerator.addInstruction("  " + id + " = " + value);
    }

    @Override
    public void enterFunc_call_stmt(CALParser.Func_call_stmtContext ctx) {
        String resultVar = ctx.ID(0).getText();
        String funcName = ctx.ID(1).getText();
        int argCount = ctx.arg_list() != null ? ctx.arg_list().expr().size() : 0;

        System.out.println("DEBUG: Function call: " + funcName + " with " + argCount + " arguments");
        if (ctx.arg_list() != null) {
            for (CALParser.ExprContext exprCtx : ctx.arg_list().expr()) {
                String arg = evaluateExpression(exprCtx);
                System.out.println("DEBUG: Passing argument: " + arg);
                tacGenerator.addInstruction("  param " + arg);
            }
        }
        tacGenerator.addInstruction("  " + resultVar + " = call " + funcName + ", " + argCount);
    }

    @Override
    public void enterStmt_list(CALParser.Stmt_listContext ctx) {
        System.out.println("DEBUG: Traversing statement list in function: " + currentFunction);
        for (var stmt : ctx.stmt()) {
            System.out.println("DEBUG: Found statement: " + stmt.getText());
        }
    }

    @Override
    public void enterReturn_stmt(CALParser.Return_stmtContext ctx) {
        String value = evaluateExpression(ctx.expr());
        System.out.println("DEBUG: Processing RETURN statement with value: " + value + " in function: " + currentFunction);
        tacGenerator.addInstruction("  return " + value);
    }

    private String evaluateExpression(CALParser.ExprContext ctx) {
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        } else if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.expr().size() == 1) {
            return evaluateExpression(ctx.expr(0));
        } else if (ctx.expr().size() == 2) {
            String left = evaluateExpression(ctx.expr(0));
            String right = evaluateExpression(ctx.expr(1));
            String op = ctx.getChild(1).getText();
            return left + " " + op + " " + right;
        }
        return "";
    }
}
