package Conditionals;

public class And {
    // can nest 2 conditionals: 
    if (tuitionPaid) {
        if (hasPrerequisite) {
            // enroll student
        }
    }
    // the above will do the job, but we can be more concise:
    if (tuitionPaid && hasPrerequisite) {
        // enroll student
    }
}

// when more than one condition must be met
// && is used between two boolean values and evaluates to a single 
// boolean value

true && true 
// true 
false && true 
// false 
true && false 
// false 
false && false 
// false 