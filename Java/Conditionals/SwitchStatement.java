package Conditionals;

public class SwitchStatement {
    String course = "History";

    // student will be enrolled in History class by checking
    // the value contained in the parentheses, course, against each of
    // the case labels -- if the value after the case label matches
    // the value within the (), the switch block is run
    // if no matches found - the default case is run
    switch(course) {
        case "Algebra": 
        // enroll in algebra
            break;
            // break keyword is used to exit the switch statement
            // w/o break, code below the matching case label is run, 
            // including code under other case lebels which is rarely 
            // desired behavior
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