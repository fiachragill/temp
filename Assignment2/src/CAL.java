/*
Autumn 2024 CSC1098 Compiler Construction
Assignment 1: A Lexical and Syntax Analyser
By Fiachra Gill - 21444356
*/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CAL {
    public static void main(String[] args) throws Exception {
        // Input file or standard input
        String inputFile = args.length > 0 ? args[0] : null;
        InputStream stream = (inputFile != null) ? new FileInputStream(inputFile) : System.in;

        // Initialize the lexer
        CALLexer lexer = new CALLexer(CharStreams.fromStream(stream));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.out.println(inputFile + " has not parsed");
                System.exit(1); // Exit on lexing error
            }
        });

        // Initialize the token stream and parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CALParser parser = new CALParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.out.println(inputFile + " has not parsed");
                System.exit(1); // Exit on parsing error
            }
        });

        // Parse the input starting from the 'prog' rule
        ParseTree tree = parser.program();

        // Step 1: Print the Parse Tree
        System.out.println("Parse Tree:");
        System.out.println(tree.toStringTree(parser));

        // Step 2: Perform Semantic Analysis
        System.out.println("Performing Semantic Analysis...");
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
        walker.walk(semanticAnalyzer, tree);

        // Step 3: Generate Intermediate Representation (IR)
        System.out.println("Generating Intermediate Representation...");
        String irFilename = inputFile != null ? inputFile.replace(".cal", ".ir") : "output.ir";
        semanticAnalyzer.getTACGenerator().writeToFile(irFilename);

        System.out.println("Intermediate Representation saved to: " + irFilename);

        // Indicate successful parsing
        System.out.println(inputFile + " parsed successfully");
    }
}
