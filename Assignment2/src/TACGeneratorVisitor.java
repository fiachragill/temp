import java.util.HashMap;
import java.util.Map;

public class TACGeneratorVisitor extends CALBaseVisitor<String> {
    // Instance of TACGenerator to generate three-address code
    private final TACGenerator tacGenerator = new TACGenerator();
    // Symbol table to store variable names and their corresponding values
    private final Map<String, String> symbolTable = new HashMap<>();
    // Variable to keep track of the current function being processed
    private String currentFunction = "";

    // Getter method to retrieve the TACGenerator instance
    public TACGenerator getTACGenerator() {
        return tacGenerator;
    }

    @Override
    public String visitMain_block(CALParser.Main_blockContext ctx) {
        // Set the current function to "main"
        currentFunction = "main";
        // Add the main function label to the TAC
        tacGenerator.addInstruction(currentFunction + ":");
        // Visit the declaration list and statement list within the main block
        visit(ctx.decl_list());
        visit(ctx.stmt_list());
        // Add instruction to call the _exit function with argument 0
        tacGenerator.addInstruction("  call _exit, 0");
        // Reset the current function
        currentFunction = "";
        return null;
    }

    @Override
    public String visitWhile_stmt(CALParser.While_stmtContext ctx) {
        // Generate labels for the start and end of the while loop
        String startLabel = tacGenerator.newLabel();
        String endLabel = tacGenerator.newLabel();

        // Add the start label to the TAC
        tacGenerator.addInstruction(startLabel + ":");
        // Visit the condition of the while loop and add the conditional jump instruction
        String condition = visit(ctx.condition());
        tacGenerator.addInstruction("  ifz " + condition + " goto " + endLabel);
        // Visit the block of statements within the while loop
        visit(ctx.block());
        // Add instruction to jump back to the start of the loop
        tacGenerator.addInstruction("  goto " + startLabel);
        // Add the end label to the TAC
        tacGenerator.addInstruction(endLabel + ":");
        return null;
    }

    @Override
    public String visitAssign_stmt(CALParser.Assign_stmtContext ctx) {
        // Get the identifier and the value to be assigned
        String id = ctx.ID().getText();
        String value = visit(ctx.expr());
        // Add the assignment instruction to the TAC
        tacGenerator.addInstruction("  " + id + " = " + value);
        return null;
    }

    @Override
    public String visitFunc_call_stmt(CALParser.Func_call_stmtContext ctx) {
        // Check if the function call has a result variable
        if (ctx.ID().size() == 2) {
            String resultVar = ctx.ID(0).getText();
            String funcName = ctx.ID(1).getText();
            // Visit the argument list and add parameter instructions to the TAC
            if (ctx.arg_list() != null) {
                for (CALParser.ExprContext exprCtx : ctx.arg_list().expr()) {
                    String arg = visit(exprCtx);
                    tacGenerator.addInstruction("  param " + arg);
                }
            }
            // Add the function call instruction with the result variable
            int argCount = ctx.arg_list() != null ? ctx.arg_list().expr().size() : 0;
            tacGenerator.addInstruction("  " + resultVar + " = call " + funcName + ", " + argCount);
        } else {
            // Add the function call instruction without a result variable
            String funcName = ctx.ID(0).getText();
            tacGenerator.addInstruction("  call " + funcName + ", " + (ctx.arg_list() != null ? ctx.arg_list().expr().size() : 0));
        }
        return null;
    }

    @Override
    public String visitFunction_decl(CALParser.Function_declContext ctx) {
        // Get the function name and set it as the current function
        String functionName = ctx.ID().getText();
        currentFunction = functionName;
        // Add the function label to the TAC
        tacGenerator.addInstruction(functionName + ":");
        // Visit the declaration list and statement list within the function
        visit(ctx.decl_list());
        visit(ctx.stmt_list());
        return null;
    }

    @Override
    public String visitReturn_stmt(CALParser.Return_stmtContext ctx) {
        // Check if there is a return value
        if (ctx.expr() != null) {
            String returnValue = visit(ctx.expr());
            // Add the return instruction with the return value
            tacGenerator.addInstruction("  return " + returnValue);
        } else {
            // Add the return instruction without a return value
            tacGenerator.addInstruction("  return");
        }
        return null;
    }

    @Override
    public String visitExpr(CALParser.ExprContext ctx) {
        // Check if the expression is a number
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        } else if (ctx.ID() != null) {
            // Check if the expression is an identifier
            return ctx.ID().getText();
        } else if (ctx.expr().size() == 2) {
            // Handle binary expressions
            String left = visit(ctx.expr(0));
            String right = visit(ctx.expr(1));
            String op = ctx.getChild(1).getText();
            return left + " " + op + " " + right;
        } else if (ctx.expr().size() == 1) {
            // Handle parenthesized expressions
            return visit(ctx.expr(0));
        }
        return null;
    }
}