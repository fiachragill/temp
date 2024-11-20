import java.util.*;

public class SemanticAnalyzer extends CALBaseListener {
    private SymbolTable symbolTable = new SymbolTable();
    private TACGenerator tacGenerator = new TACGenerator();
    private int labelCounter = 0;

    private String newLabel() {
        return "L" + (labelCounter++);
    }

    @Override
    public void enterProgram(CALParser.ProgramContext ctx) {
        System.out.println("Entering program...");
    }

    @Override
    public void exitProgram(CALParser.ProgramContext ctx) {
        System.out.println("Exiting program...");
        tacGenerator.addInstruction("// End of program");
        tacGenerator.optimize(); // Optimize before generating the final output
    }

    @Override
    public void enterConst_decl(CALParser.Const_declContext ctx) {
        String name = ctx.ID().getText();
        String expr = ctx.expr().getText();

        if (!symbolTable.addSymbol(name, "const")) {
            System.err.println("Semantic Error: Duplicate constant '" + name + "' declared.");
        } else {
            String temp = tacGenerator.newTemp();
            tacGenerator.addInstruction(temp + " = " + expr);
            tacGenerator.addInstruction(name + " = " + temp);
        }
    }

    @Override
    public void enterVar_decl(CALParser.Var_declContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.type().getText();

        if (!symbolTable.addSymbol(name, type)) {
            System.err.println("Semantic Error: Duplicate variable '" + name + "' declared.");
        } else {
            tacGenerator.addInstruction("declare " + name + " : " + type);
        }
    }

    @Override
    public void enterAssign(CALParser.AssignContext ctx) {
        String name = ctx.ID().getText();
        String expr = ctx.expr().getText();

        if (!symbolTable.contains(name)) {
            System.err.println("Semantic Error: Variable '" + name + "' is not declared.");
        } else {
            String temp = tacGenerator.newTemp();
            tacGenerator.addInstruction(temp + " = " + expr);
            tacGenerator.addInstruction(name + " = " + temp);
        }
    }

    @Override
    public void enterStatement(CALParser.StatementContext ctx) {
        if (ctx.While() != null) {
            handleWhileStatement(ctx);
        } else if (ctx.If() != null) {
            handleIfStatement(ctx);
        } else if (ctx.Skip() != null) {
            tacGenerator.addInstruction("// skip");
        }
    }

    private void handleWhileStatement(CALParser.StatementContext ctx) {
        String startLabel = newLabel();
        String conditionLabel = newLabel();
        String endLabel = newLabel();

        tacGenerator.addInstruction(startLabel + ":");
        String temp = tacGenerator.newTemp();
        tacGenerator.addInstruction(temp + " = " + ctx.condition().getText());
        tacGenerator.addInstruction("if " + temp + " goto " + conditionLabel);
        tacGenerator.addInstruction("goto " + endLabel);

        tacGenerator.addInstruction(conditionLabel + ":");
        for (CALParser.Statement_blockContext block : ctx.statement_block()) {
            handleStatementBlock(block);
        }
        tacGenerator.addInstruction("goto " + startLabel);
        tacGenerator.addInstruction(endLabel + ":");
    }

    private void handleIfStatement(CALParser.StatementContext ctx) {
        String conditionTemp = tacGenerator.newTemp();
        String trueLabel = newLabel();
        String falseLabel = newLabel();
        String endLabel = newLabel();

        tacGenerator.addInstruction(conditionTemp + " = " + ctx.condition().getText());
        tacGenerator.addInstruction("if " + conditionTemp + " goto " + trueLabel);
        tacGenerator.addInstruction("goto " + falseLabel);

        tacGenerator.addInstruction(trueLabel + ":");
        if (!ctx.statement_block().isEmpty()) {
            handleStatementBlock(ctx.statement_block(0));
        }
        tacGenerator.addInstruction("goto " + endLabel);

        tacGenerator.addInstruction(falseLabel + ":");
        if (ctx.statement_block().size() > 1) {
            handleStatementBlock(ctx.statement_block(1));
        }
        tacGenerator.addInstruction(endLabel + ":");
    }

    private void handleStatementBlock(CALParser.Statement_blockContext ctx) {
        if (ctx != null) {
            for (CALParser.StatementContext stmtCtx : ctx.statement()) {
                enterStatement(stmtCtx);
            }
        }
    }

    public TACGenerator getTACGenerator() {
        return tacGenerator;
    }
}
