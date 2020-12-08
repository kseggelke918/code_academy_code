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

       // create a variable with a boolean data type
       boolean isValidPassword = true; 

       // use the variable assigned above in the conditional
       if (isValidPassword) {
           System.out.println("Password Accepted!");
       }

       int numberOfItemsInCart = 9; 

       // if numberOfItemsInCart is > 12, then the code in the {} will execute, otherwise, nothing will happen
       if (numberOfItemsInCart > 12){
           System.out.println("Express checkout not available");
       }
   } 
}

// conditional statements allow us to be selective in which portions of our code will run

// conditional statements check a boolean condition and run a block of code depending on the condition
// THINK IF/ELSE or if-then statements
