package ExampleCode;

public class Car {
    String color; 

    // constructor
    public Car(String carColor){
        color = carColor;
    }
    // method with station as a parameter used in the method
    public void startRadio(String station) {
        System.out.println("Turning on the radio to " + station + "!");
        System.out.println("Enjoy!");
    }

    // main method - where the program tasks live
    public static void main(String[] args){
        Car myCar = new Car("red");
        myCar.startRadio("Mediation Station");
    }
}
