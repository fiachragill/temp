import java.util.*;

public class SymbolTable {
    private Stack<Map<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        pushScope(); // Start with the global scope
    }

    // Push a new scope onto the stack
    public void pushScope() {
        scopes.push(new HashMap<>());
    }

    // Pop the current scope from the stack
    public void popScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        } else {
            throw new IllegalStateException("No scope to pop");
        }
    }

    // Add a symbol to the current scope
    public boolean addSymbol(String name, String type) {
        Map<String, Symbol> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
            return false; // Duplicate declaration
        }
        currentScope.put(name, new Symbol(name, type));
        return true;
    }

    // Lookup a symbol in the current scope and parent scopes
    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null; // Not found
    }

    // Check if a symbol exists in any scope
    public boolean contains(String name) {
        return lookup(name) != null;
    }

    // Update usage for a variable (either read or write)
    public void updateUsage(String name, boolean isWrite) {
        Symbol symbol = lookup(name);
        if (symbol != null) {
            if (isWrite) {
                symbol.setWritten(true);
            } else {
                symbol.setRead(true);
            }
        }
    }

    // Report any variables that are declared but not used
    public List<String> getUnusedVariables() {
        List<String> unusedVars = new ArrayList<>();
        for (Map<String, Symbol> scope : scopes) {
            for (Symbol symbol : scope.values()) {
                if (!symbol.isRead() && !symbol.isWritten()) {
                    unusedVars.add(symbol.getName());
                }
            }
        }
        return unusedVars;
    }
}

// Class to represent a symbol
class Symbol {
    private String name;
    private String type;
    private boolean isRead;
    private boolean isWritten;

    public Symbol(String name, String type) {
        this.name = name;
        this.type = type;
        this.isRead = false;
        this.isWritten = false;
    }

    // Get the name of the symbol
    public String getName() {
        return name;
    }

    // Get the type of the symbol
    public String getType() {
        return type;
    }

    // Check if the symbol has been read
    public boolean isRead() {
        return isRead;
    }

    // Mark the symbol as read
    public void setRead(boolean read) {
        isRead = read;
    }

    // Check if the symbol has been written
    public boolean isWritten() {
        return isWritten;
    }

    // Mark the symbol as written
    public void setWritten(boolean written) {
        isWritten = written;
    }
}
