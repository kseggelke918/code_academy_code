public class Compiling {
    public static void main(String[] args) {
    
        System.out.println("Java is a class-based language.");
        System.out.println("Java classes have a 'main' method.");
        System.out.println("Java statements end with a semicolon.")
    
        System.out.println("Programming is... fun!");
        
      } 
}

// javac Compiling.java in the terminal will throw an error and won't 
// compile b/c we are missing a ; 
// can check is a .class file was run by checking ls in the terminal

// Java is a compiled language, meaning the code we write in .java file 
// is transformed into byte code by a compiler before it's executed by the
// Java Virtual Machine on your computer.

// Compiler: program that transalates human-friendly programming
// languages into other programming languages that computers can 
// execute. 
    // * catches mistakes before computer runs our code
    // * runs a series of checks while it transforms the code - 
    // code that doesn't pass these checks won't be compiled.

// COMPILE TERMINAL COMMAND: javac Compiling.java
// A successful compilation produces a .class file: Compiling.class that 
// we can execute with TERMINAL COMMAND: java Compiling
// An unseccessful compilation produces a list of error and non .class
// file is made until the errors are corrected and the compile command is run again

// If a file compiles successfully, the javac filename.java command produces 
// a executable class: FileName.cass which means we can run this program
// from the terminal with the command: java FileName

// After successfully compiling, you end up with 2 files: 
// 1. FileName.java - the original file with the Java Syntax
// 2. FileName.class - the compiled filed with Java bytecode, ready to 
//    be executed by the Java Virtual Machine

// EXECUTE COMPILED CLASS WITH: java FileName

