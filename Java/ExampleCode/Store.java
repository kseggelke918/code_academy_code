package ExampleCode;

public class Store {
    // instance fields
    // define variable for constructor
    String productType; 
    double price;

    // constructor method 
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice; 
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

    public double getPriceWithTax(){
        double totalPrice = price + price * 0.08;
        return totalPrice; 
    }

    // main method - always have to have one
    public static void main(String[] args){
        // program tasks go here
        // main() lists the tasks to be performed by the program 
        // can create instances in the main method
        // main() runs when we execute the compiled Store.class file

        // create an instance of the Store class
        Store lemonadeStand = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        // call advertise method on the instance created above
        lemonadeStand.advertise();
        // now the output would print
        lemonadeStand.greetCustomer("Katie");
        lemonadeStand.increasePrice(1.5);

        // call the getPriceWithTax() method on the object with () after the method name
        // because the method has a return value, the lemonadePrice variable will be equal to that value
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);

        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }
}

// methods in the class are available to be called on any class object we create

// method scope prevents us from using variables declared in one method in another method.  
// If we want to access that information, we can send it to the method via parameters.
