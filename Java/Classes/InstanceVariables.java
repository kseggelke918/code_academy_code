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
    boolean isRunning; 
    int velocity;

    // add in a parameter to the constructor that can be used to assign to the 
    // instance
    public Car(String carColor, boolean carRunning, int milesPerHour) {
        // instance fields available in the scope of the constructor method
        // don't need to specify data type b/c we already did on line 19
        color = carColor;
        isRunning = carRunning; 
        velocity = milesPerHour;
    }

    public static void main(String[] args) {
        // body of main method
        Car ferrari = new Car("red", true, 27);
        Car renault = new Car("blue", falce, 70);

        System.out.println(renault.isRunning);
        // false 
        System.out.println(ferrari.velocity);
        // 27 
    }
}

*/ 

// To create a new car, need the parameter now: 

// Car ferrari = new Car("red")
// object ferrari holds the state of color as an instance field references the value "red"
// access the value of the field using dot notation: ferrari.color; 

// The type of the value given to the invocation must match the type delcared
// in the parameter


// Fields are a type of state each instance will possess.  One instnce may have
// color=red and another may be blue, etc.
