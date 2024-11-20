import java.util.*;
import java.io.*;

public class TACGenerator {
    private List<String> instructions = new ArrayList<>();
    private int tempCounter = 0;
    private int labelCounter = 0;

    // Generate a new temporary variable
    public String newTemp() {
        return "t" + tempCounter++;
    }

    // Generate a new label
    public String newLabel() {
        return "L" + labelCounter++;
    }

    // Add an instruction to the list
    public void addInstruction(String instruction) {
        instructions.add(instruction);
    }

    // Optimize the list of instructions by removing unnecessary labels and jumps
    public void optimize() {
        Set<String> usedLabels = new HashSet<>();
        List<String> optimizedInstructions = new ArrayList<>();

        // First pass: Identify used labels (from 'if' and 'goto' statements)
        for (String instruction : instructions) {
            if (instruction.startsWith("if ") || instruction.startsWith("goto ")) {
                String label = instruction.split("goto ")[1].split(" ")[0];
                usedLabels.add(label);
            } else if (instruction.endsWith(":")) {
                usedLabels.add(instruction.replace(":", ""));
            }
        }

        // Second pass: Remove unnecessary labels and instructions
        for (int i = 0; i < instructions.size(); i++) {
            String instruction = instructions.get(i);

            // Skip labels that are not used
            if (instruction.endsWith(":") && !usedLabels.contains(instruction.replace(":", ""))) {
                continue;
            }

            // Skip redundant jumps to the next instruction (e.g., 'goto L0' followed by 'L0:')
            if (instruction.startsWith("goto ") && i + 1 < instructions.size()) {
                String targetLabel = instruction.split("goto ")[1];
                if (instructions.get(i + 1).equals(targetLabel + ":")) {
                    continue;
                }
            }

            // Add the instruction to the optimized list
            optimizedInstructions.add(instruction);
        }

        // Update instructions with the optimized version
        instructions = optimizedInstructions;
    }

    // Write the optimized instructions to a file
    public void writeToFile(String filename) throws IOException {
        optimize(); // Apply optimizations before writing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String instruction : instructions) {
                writer.write(instruction);
                writer.newLine();
            }
        }
    }
}
