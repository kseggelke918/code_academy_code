package ExampleCode;

public class Store {
    // instance fields
    // define variable for constructor
    String productType; 

    // constructor method 
    public Store(String product) {
        productType = product;
    }

    // regular method
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    // main method - always have to have one
    public static void main(String[] args){
        // program tasks go here
        // main() lists the tasks to be performed by the program 
        // can create instances in the main method
        // main() runs when we execute the compiled ClassSyntax.class fle

    }
}
