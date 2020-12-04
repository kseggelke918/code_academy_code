package ExampleCode;

public class Car {
    String color; 

    // constructor
    public Car(String carColor){
        color = carColor;
    }

    // 'int' is used instead of 'void' b/c int gives the datatype that should be returned in this method
    
    public int numberOfTires() {
        int tires = 4; 
        return tires;
        // this method will return 4
    }
    // method with station as a parameter used in the method
    // using 'void' in the method name means that this method won't have a return value
    public void startRadio(String station) {
        System.out.println("Turning on the radio to " + station + "!");
        System.out.println("Enjoy!");
    }

    // main method - where the program tasks live
    public static void main(String[] args){
        Car myCar = new Car("red");
        // since numberOfTire() returns 4, the value 4 is now saved to the variable numTires
        int numTires = myCar.numberOfTires();
        System.out.println(numTires); 
        // would print 4
        myCar.startRadio("Mediation Station");

        System.out.println(myCar);

    }

    // this method will make the commant System.out.println(myCar) as "This is a _color_ car!" Which tells us
    // about the object myCar
    public String toString() {
        return "This is a " + color + " car!";
     }
}
