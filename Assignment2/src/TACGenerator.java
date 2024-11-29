import java.util.ArrayList;
import java.util.List;

public class TACGenerator {
    private final List<String> instructions = new ArrayList<>();
    private int labelCounter = 1; // Start label sequence from 1

    public void addInstruction(String instruction) {
        instructions.add(instruction);
    }

    public String newLabel() {
        return "L" + (labelCounter++);
    }

    public void writeToFile(String filename) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(filename)) {
            for (String instruction : instructions) {
                writer.println(instruction);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
