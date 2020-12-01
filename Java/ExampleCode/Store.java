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

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd; 
        price = newPrice; 
    }

    // main method - always have to have one
    public static void main(String[] args){
        // program tasks go here
        // main() lists the tasks to be performed by the program 
        // can create instances in the main method
        // main() runs when we execute the compiled Store.class file

        // create an instance of the Store class
        Store lemonadeStand = new Store("Lemonade");
        // call advertise method on the instance created above
        lemonadeStand.advertise();
        // now the output would print
        lemonadeStand.greetCustomer("Katie");
        lemonadeStand.increasePrice(1.5);
    }
}

// methods in the class are available to be called on any class object we create

// method scope prevents us from using variables declared in one method in another method.  
// If we want to access that information, we can send it to the method via parameters.
