// Car class
class Car {
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
}

// CarTester class
// CarTester class
public class CarTester {
    public static void main(String[] args) {
        // Instantiate myCar1 with specified make and model
        Car myCar1 = new Car("Toyota", "Camry");

        // Instantiate myCar2 with default values (null)
        Car myCar2 = new Car(null, null); // Consider providing default values here

        // Print initial make and model for both cars
        System.out.println("Initial make and model for myCar1: " + myCar1.getMake() + " " + myCar1.getModel());
        System.out.println("Initial make and model for myCar2: " + myCar2.getMake() + " " + myCar2.getModel());

        // Set new values for myCar2 using setter methods
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Print updated make and model for myCar2
        System.out.println("Updated make and model for myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}

