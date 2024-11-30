import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends CALBaseListener {
    private final SymbolTable symbolTable = new SymbolTable();
    private final TACGenerator tacGenerator = new TACGenerator();
    private String currentFunction = "";

    public TACGenerator getTACGenerator() {
        return tacGenerator;
    }

    @Override
    public void enterFunction_decl(CALParser.Function_declContext ctx) {
        currentFunction = ctx.ID().getText();
        symbolTable.enterScope();
        tacGenerator.addInstruction(currentFunction + ":");
    }

    @Override
    public void exitFunction_decl(CALParser.Function_declContext ctx) {
        symbolTable.exitScope();
        currentFunction = "";
    }

    @Override
    public void enterMain_block(CALParser.Main_blockContext ctx) {
        currentFunction = "main";
        symbolTable.enterScope();
        tacGenerator.addInstruction(currentFunction + ":");
    }

    @Override
    public void exitMain_block(CALParser.Main_blockContext ctx) {
        symbolTable.checkForUnusedVariables();
        tacGenerator.addInstruction("  call _exit, 0");
        symbolTable.exitScope();
        currentFunction = "";
    }

    @Override
    public void enterVar_decl(CALParser.Var_declContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        if (!symbolTable.addSymbol(id, type)) {
            System.err.println("ERROR: Variable '" + id + "' already declared in this scope.");
        }
    }

    @Override
    public void enterAssign_stmt(CALParser.Assign_stmtContext ctx) {
        String id = ctx.ID().getText();
        if (!symbolTable.markAsUsed(id)) {
            System.err.println("ERROR: Variable '" + id + "' used before declaration.");
        }
    }

    @Override
    public void enterFunc_call_stmt(CALParser.Func_call_stmtContext ctx) {
        String funcName = ctx.ID(1).getText();
        int argCount = ctx.arg_list() != null ? ctx.arg_list().expr().size() : 0;
        String expectedArgs = symbolTable.lookup(funcName);
        if (expectedArgs == null) {
            System.err.println("ERROR: Function '" + funcName + "' not declared.");
        } else if (!expectedArgs.equals(String.valueOf(argCount))) {
            System.err.println("ERROR: Function '" + funcName + "' called with incorrect number of arguments.");
        }
    }

    private String evaluateExpression(CALParser.ExprContext ctx) {
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        } else if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.expr().size() == 2) {
            String left = evaluateExpression(ctx.expr(0));
            String right = evaluateExpression(ctx.expr(1));
            String op = ctx.getChild(1).getText();
            return left + " " + op + " " + right;
        }
        return "";
    }
}
