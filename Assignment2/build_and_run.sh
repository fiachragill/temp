#!/bin/bash

# Step 1: Run ANTLR to generate the lexer and parser
java -cp ./lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -o ./src ./src/CAL.g4

# Step 2: Compile the Java files
javac -cp ./lib/antlr-4.7.1-complete.jar -d bin src/*.java

# Step 3: Run the program with an example .cal file
java -cp "./lib/antlr-4.7.1-complete.jar:./bin" CAL examples/example.cal