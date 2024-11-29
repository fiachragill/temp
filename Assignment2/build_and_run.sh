#!/bin/bash

# Clean previous builds
echo "Cleaning previous builds..."
rm -rf bin/*
rm -f examples/example.ir

# Generate lexer and parser with ANTLR (allowing nested 'src' creation)
echo "Generating lexer and parser with ANTLR..."
java -jar lib/antlr-4.7.1-complete.jar -Dlanguage=Java -listener -visitor -o src src/CAL.g4

# Move generated files from nested src/src to src/ if they exist
if [ -d "src/src" ]; then
    echo "Moving generated files from nested 'src/src' to 'src/'..."
    mv src/src/* src/
    rm -rf src/src
fi

if [ -d "src/.antlr" ]; then
    mv src/.antlr/* src/
    rm -rf src/.antlr
fi

# Compile Java files
echo "Compiling Java files..."
mkdir -p bin
javac -cp "lib/antlr-4.7.1-complete.jar" -d bin src/*.java

# Run the CAL interpreter with example.cal
if [ $? -eq 0 ]; then
    echo "Running the CAL interpreter with example.cal..."
    java -cp "bin:lib/antlr-4.7.1-complete.jar" CAL examples/example.cal
    echo "Executing TAC with TACi..."
    java -jar lib/TACi.jar examples/example.ir
else
    echo "Compilation failed."
fi
