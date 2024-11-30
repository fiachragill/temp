import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private final Stack<Map<String, String>> scopes = new Stack<>();

    public SymbolTable() {
        enterScope(); // Start with a global scope
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        } else {
            throw new IllegalStateException("No scope to exit");
        }
    }

    public boolean addSymbol(String name, String type) {
        Map<String, String> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
            return false; // Duplicate declaration in the same scope
        }
        currentScope.put(name, type);
        return true;
    }

    public String lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, String> scope = scopes.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null; // Not found
    }

    public boolean markAsUsed(String name) {
        for (Map<String, String> scope : scopes) {
            if (scope.containsKey(name)) {
                scope.put(name, "used");
                return true;
            }
        }
        return false;
    }

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
