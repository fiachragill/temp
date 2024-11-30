import java.util.ArrayList;
import java.util.List;

public class TACGenerator {
    // List to store the generated instructions
    private final List<String> instructions = new ArrayList<>();
    // Counter to generate unique labels
    private int labelCounter = 1; // Start label sequence from 1

    // Method to add an instruction to the list
    public void addInstruction(String instruction) {
        instructions.add(instruction);
    }

    // Method to generate a new unique label
    public String newLabel() {
        return "L" + (labelCounter++);
    }

    // Method to write the instructions to a file
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