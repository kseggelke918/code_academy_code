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

       // if a conditional is brief, can omit the {}
       if (true) System.out.println("Brevity is the soul of wit");

       // can use if/else if you want more than one possible block of code to run
       if (hasPrereqs) {
           // this runs if true
           // enroll in course
       } else {
           // this runs if false
           // enroll in prereq
       }

       String course = "Theatre";

       // first condition to evaluate true will run, if none are true, else will run
       if(course.equals("Biology")) {
           // enroll in biology
       } else if (course.equals("Algebra"){
           // enroll in Algebra
       } else if (course.equals("Theatre")) {
            // enroll in theatre course
       } else {
           System.out.println("Course not found!");
       }

        int testScore = 72;
        
        if (testScore >= 90) {
        
        System.out.println("A");
        
        } else if (testScore >= 80) {
        
        System.out.println("B");
        
        } else if (testScore >= 70) {
        
        System.out.println("C");
        
        } else if (testScore >= 60) {
        
        System.out.println("D");
        
        } else {
        
        System.out.println("F");
        
        }
        // prints: C
        // The above statement has 2 conditionals that evaluate to true.  Because testScore >= 70 comes first, 
        // the first code runs -- only one block of code will ever run
   } 
}

// conditional statements allow us to be selective in which portions of our code will run

// conditional statements check a boolean condition and run a block of code depending on the condition
// THINK IF/ELSE or if-then statements
