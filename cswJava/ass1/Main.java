//Q4
// Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class 
// defines private fields model and price, alongside setter methods for each attribute. 
// Additionally, it overrides the toString() method to return a string representation of the laptop's 
// model and price. In the Main class, create an instance of Laptop, setting its model using the 
// setter method. Then, print the laptop object using the toString() method. Describe the 
// functionality of the toString() method in the Laptop class and explain how it is utilized in the 
// Main class.
class Laptop {
    private String model;
    private double price;

    // Constructor (optional)
    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Laptop Model: " + model + ", Price: $" + price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Laptop
        Laptop myLaptop = new Laptop("Dell XPS 13", 999.99);

        // Print the laptop object using toString()
        System.out.println(myLaptop);
    }
}

