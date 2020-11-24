package Classes;

public class InstanceVariables {
    public static void main(String[] args) {

    }
}

// instance variables / instance fields refers to associated data to an object
// Instance fields are the state in our objects

// example: 
/* 

public class Car {
    // declare fields inside the class by specifying the type and name
    // the DECLARATION is within the class and the instance variable will be 
    // available for assignment inside the constructor
    String color; 

    // add in a parameter to the constructor that can be used to assign to the 
    // instance
    public Car(String carColor) {
        // instance fields available in the scope of the constructor method
        color = carColor;
    }

    public static void main(String[] args) {
        // body of main method
    }
}

*/ 

// To create a new car, need the parameter now: 
// new Car("blue");


// Fields are a type of state each instance will possess.  One instnce may have
// color=red and another may be blue, etc.
