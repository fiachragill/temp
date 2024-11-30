import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends CALBaseListener {
    // Symbol table to keep track of variable and function declarations
    private final SymbolTable symbolTable = new SymbolTable();
    // TAC generator to create three-address code instructions
    private final TACGenerator tacGenerator = new TACGenerator();
    // Current function being analysed
    private String currentFunction = "";

    // Getter for the TAC generator
    public TACGenerator getTACGenerator() {
        return tacGenerator;
    }

    @Override
    public void enterFunction_decl(CALParser.Function_declContext ctx) {
        // Set the current function name
        currentFunction = ctx.ID().getText();
        // Enter a new scope in the symbol table
        symbolTable.enterScope();
        // Add a label for the function in the TAC
        tacGenerator.addInstruction(currentFunction + ":");
    }

    @Override
    public void exitFunction_decl(CALParser.Function_declContext ctx) {
        // Exit the current scope in the symbol table
        symbolTable.exitScope();
        // Reset the current function name
        currentFunction = "";
    }

    @Override
    public void enterMain_block(CALParser.Main_blockContext ctx) {
        // Set the current function to "main"
        currentFunction = "main";
        // Enter a new scope in the symbol table
        symbolTable.enterScope();
        // Add a label for the main block in the TAC
        tacGenerator.addInstruction(currentFunction + ":");
    }

    @Override
    public void exitMain_block(CALParser.Main_blockContext ctx) {
        // Check for any unused variables in the current scope
        symbolTable.checkForUnusedVariables();
        // Add an exit call in the TAC
        tacGenerator.addInstruction("  call _exit, 0");
        // Exit the current scope in the symbol table
        symbolTable.exitScope();
        // Reset the current function name
        currentFunction = "";
    }

    @Override
    public void enterVar_decl(CALParser.Var_declContext ctx) {
        // Get the variable name and type from the context
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        // Attempt to add the variable to the symbol table
        if (!symbolTable.addSymbol(id, type)) {
            // Report an error if the variable is already declared in the current scope
            System.err.println("ERROR: Variable '" + id + "' already declared in this scope.");
        }
    }

    @Override
    public void enterAssign_stmt(CALParser.Assign_stmtContext ctx) {
        // Get the variable name from the context
        String id = ctx.ID().getText();
        // Mark the variable as used in the symbol table
        if (!symbolTable.markAsUsed(id)) {
            // Report an error if the variable is used before declaration
            System.err.println("ERROR: Variable '" + id + "' used before declaration.");
        }
    }

    @Override
    public void enterFunc_call_stmt(CALParser.Func_call_stmtContext ctx) {
        // Get the function name and argument count from the context
        String funcName = ctx.ID(1).getText();
        int argCount = ctx.arg_list() != null ? ctx.arg_list().expr().size() : 0;
        // Lookup the expected argument count for the function in the symbol table
        String expectedArgs = symbolTable.lookup(funcName);
        if (expectedArgs == null) {
            // Report an error if the function is not declared
            System.err.println("ERROR: Function '" + funcName + "' not declared.");
        } else if (!expectedArgs.equals(String.valueOf(argCount))) {
            // Report an error if the function is called with an incorrect number of arguments
            System.err.println("ERROR: Function '" + funcName + "' called with incorrect number of arguments.");
        }
    }

    // Helper method to evaluate an expression and return its string representation
    private String evaluateExpression(CALParser.ExprContext ctx) {
        if (ctx.NUMBER() != null) {
            // Return the number as a string
            return ctx.NUMBER().getText();
        } else if (ctx.ID() != null) {
            // Return the identifier as a string
            return ctx.ID().getText();
        } else if (ctx.expr().size() == 2) {
            // Evaluate the left and right sub-expressions and combine them with the operator
            String left = evaluateExpression(ctx.expr(0));
            String right = evaluateExpression(ctx.expr(1));
            String op = ctx.getChild(1).getText();
            return left + " " + op + " " + right;
        }
        return "";
    }
}