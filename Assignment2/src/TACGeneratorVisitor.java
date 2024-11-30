import java.util.HashMap;
import java.util.Map;

public class TACGeneratorVisitor extends CALBaseVisitor<String> {
    private final TACGenerator tacGenerator = new TACGenerator();
    private final Map<String, String> symbolTable = new HashMap<>();
    private String currentFunction = "";

    public TACGenerator getTACGenerator() {
        return tacGenerator;
    }

    @Override
    public String visitMain_block(CALParser.Main_blockContext ctx) {
        currentFunction = "main";
        tacGenerator.addInstruction(currentFunction + ":");
        visit(ctx.decl_list());
        visit(ctx.stmt_list());
        tacGenerator.addInstruction("  call _exit, 0");
        currentFunction = "";
        return null;
    }

    @Override
    public String visitWhile_stmt(CALParser.While_stmtContext ctx) {
        String startLabel = tacGenerator.newLabel();
        String endLabel = tacGenerator.newLabel();

        tacGenerator.addInstruction(startLabel + ":");
        String condition = visit(ctx.condition());
        tacGenerator.addInstruction("  ifz " + condition + " goto " + endLabel);
        visit(ctx.block());
        tacGenerator.addInstruction("  goto " + startLabel);
        tacGenerator.addInstruction(endLabel + ":");
        return null;
    }

    @Override
    public String visitAssign_stmt(CALParser.Assign_stmtContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.expr());
        tacGenerator.addInstruction("  " + id + " = " + value);
        return null;
    }

    @Override
    public String visitFunc_call_stmt(CALParser.Func_call_stmtContext ctx) {
        if (ctx.ID().size() == 2) {
            String resultVar = ctx.ID(0).getText();
            String funcName = ctx.ID(1).getText();
            if (ctx.arg_list() != null) {
                for (CALParser.ExprContext exprCtx : ctx.arg_list().expr()) {
                    String arg = visit(exprCtx);
                    tacGenerator.addInstruction("  param " + arg);
                }
            }
            int argCount = ctx.arg_list() != null ? ctx.arg_list().expr().size() : 0;
            tacGenerator.addInstruction("  " + resultVar + " = call " + funcName + ", " + argCount);
        } else {
            String funcName = ctx.ID(0).getText();
            tacGenerator.addInstruction("  call " + funcName + ", " + (ctx.arg_list() != null ? ctx.arg_list().expr().size() : 0));
        }
        return null;
    }

    @Override
    public String visitFunction_decl(CALParser.Function_declContext ctx) {
        String functionName = ctx.ID().getText();
        currentFunction = functionName;
        tacGenerator.addInstruction(functionName + ":");
        visit(ctx.decl_list());
        visit(ctx.stmt_list());
        return null;
    }

    @Override
    public String visitReturn_stmt(CALParser.Return_stmtContext ctx) {
        if (ctx.expr() != null) {
            String returnValue = visit(ctx.expr());
            tacGenerator.addInstruction("  return " + returnValue);
        } else {
            tacGenerator.addInstruction("  return");
        }
        return null;
    }

    @Override
    public String visitExpr(CALParser.ExprContext ctx) {
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        } else if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.expr().size() == 2) {
            String left = visit(ctx.expr(0));
            String right = visit(ctx.expr(1));
            String op = ctx.getChild(1).getText();
            return left + " " + op + " " + right;
        } else if (ctx.expr().size() == 1) {
            // For parenthesized expressions
            return visit(ctx.expr(0));
        }
        return null;
    }
}
