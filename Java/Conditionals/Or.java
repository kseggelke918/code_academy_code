package Conditionals;

public class Or {
    // could write 2 different conditionals: 
    // this would have 2 statements each with the same code block - 
    // not very efficient
    if (hasAlegebraPrereq) {
        // enroll in course
    }

    if (hasGeometryPrereq) {
        // enroll in couse
    }

    // a more concise way would be: 
    if (hasAlegebraPrereq || hasGeometryPrereq) {
        // enroll in course
    }
}

// either condition must be met
// || - used between 2 boolean values and evaluates to a single boolean
// if either is true, the result is true 

true || true 
// true
true || false 
// true 
false || true 
// true 
false || false 
// false

// on some occasions, the compiler can determine the true value of 
// a logical expression by just evaluating the first boolean - this
// is known as 'short-circuited evalueation' = only works with || and &&

// || - if the first thing evaluates to true, then it stops evaulating
// and just evaluates to true 

// &&  - if the first thing evaulates false, then it stops evaluating
// and returns false