import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class CAL {
    public static void main(String[] args) throws Exception {
        // Determine input file
        String inputFile = args.length > 0 ? args[0] : "examples/example.cal";
        InputStream is = new FileInputStream(inputFile);

        // Set up ANTLR
        CharStream input = CharStreams.fromStream(is);
        CALLexer lexer = new CALLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CALParser parser = new CALParser(tokens);

        // Parse the input file
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser)); // Print the parse tree for debugging

        // Use the visitor to generate TAC
        TACGeneratorVisitor visitor = new TACGeneratorVisitor();
        visitor.visit(tree);

        // Write the generated TAC to a file
        visitor.getTACGenerator().writeToFile("examples/example.ir");
        System.out.println("TAC generated in examples/example.ir");
    }
}

