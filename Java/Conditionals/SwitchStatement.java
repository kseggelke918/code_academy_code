package Conditionals;

public class SwitchStatement {
    String course = "History";
    
    switch(course) {
        case "Algebra": 
        // enroll in algebra
            break;
        case "Biology": 
            // enroll in biology
            break; 
        case "History": 
            // enroll in history
            break;
        case "Theatre": 
            // enroll in theater
            break; 
        default: 
            System.out.println("Course not found");
    }
}

// alternative to chaining if/else statements
// this conditional will check a given value against any number of 
// conditions and run the code block where there is a match