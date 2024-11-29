import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, String> symbols = new HashMap<>();

    public boolean addSymbol(String name, String type) {
        if (symbols.containsKey(name)) {
            return false;
        }
        symbols.put(name, type);
        return true;
    }

    public String lookup(String name) {
        return symbols.get(name);
    }
}
