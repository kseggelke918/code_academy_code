package Classes;

public class Constructors {
    public Constructors() {
        // this is the constructor method - named the same name as 
        // the class / shares a name with the class
        // contains instructions for creating a Car instance
    }

    public static void main(String[] args) {
        // program tasks go here

        // invoke an instance of the class by calling/invoking it in main()
        Constructors example = new Constructors();
        // another example that may look clearer: 
        /* 
        As with other variable declarations, specify the type (Car), and
        name: ferrari.
        Variables that reference an instance have a type of class name
        Invoke the constructor method: Car() using the keyword 'new'
        to indicate creating a new instance
        Car ferrari = new Car();
        */
    }
    
}

// when printing out an instance you'll receive something like: Store@6dafd8jk
// Store refers to the class and the @6dafd8jk refers to the location in the 
// computer's memory

//create objects (instances of a class) using a constructor method.  The
// constructor is defined within the class
