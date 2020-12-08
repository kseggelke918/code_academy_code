public class ConditionalsAndControlFlow {
   public static void main(String[] args) {
       if(true){
           System.out.println("Hello World!");
       }

       // if keyword marks the beginning of the conditional statement
       // parentheses hold a boolean datatype (true/false)
       // the condition in parentheses can also hold variables that reference a boolean or comparisons that
       // evaluate to a boolean
       if(flip == 1) {
           // will only run if what is in () is true (in this case: if flip == 1 is true) 
           System.out.println("Heads!");
       }
   } 
}

// conditional statements allow us to be selective in which portions of our code will run

// conditional statements check a boolean condition and run a block of code depending on the condition
// THINK IF/ELSE or if-then statements
