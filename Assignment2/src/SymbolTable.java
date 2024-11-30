import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    // Stack to manage scopes, each scope is a map of variable names to their types
    private final Stack<Map<String, String>> scopes = new Stack<>();

    // Constructor to initialise the symbol table with a global scope
    public SymbolTable() {
        enterScope(); // Start with a global scope
    }

    // Method to enter a new scope
    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    // Method to exit the current scope
    public void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        } else {
            throw new IllegalStateException("No scope to exit");
        }
    }

    // Method to add a symbol to the current scope
    public boolean addSymbol(String name, String type) {
        Map<String, String> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
            return false; // Duplicate declaration in the same scope
        }
        currentScope.put(name, type);
        return true;
    }

    // Method to lookup a symbol in the current and enclosing scopes
    public String lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, String> scope = scopes.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null; // Not found
    }

    // Method to mark a symbol as used
    public boolean markAsUsed(String name) {
        for (Map<String, String> scope : scopes) {
            if (scope.containsKey(name)) {
                scope.put(name, "used");
                return true;
            }
        }
        return false;
    }

    // Method to check for unused variables in all scopes
    public void checkForUnusedVariables() {
        for (Map<String, String> scope : scopes) {
            for (Map.Entry<String, String> entry : scope.entrySet()) {
                if (!"used".equals(entry.getValue())) {
                    System.err.println("WARNING: Variable '" + entry.getKey() + "' declared but never used.");
                }
            }
        }
    }
}