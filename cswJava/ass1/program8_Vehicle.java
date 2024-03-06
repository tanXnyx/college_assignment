
// Write a Java program that illustrates the concepts of interfaces, method overriding, and 
// method overloading. Begin by defining an interface named Vehicle with two abstract methods: 
// accelerate() and brake(). Then, create two classes, Car and Bicycle, both of which implement 
// the Vehicle interface. In the Car class, override the accelerate() and brake() methods to print 
// appropriate messages indicating the acceleration and braking actions for a car. Similarly, in the 
// Bicycle class, override the same methods to display messages specific to a bicycle's 
// acceleration and braking. Additionally, implement method overloading in both classes by 
// providing multiple versions of the accelerate() method, each accepting different parameters 
// such as speed and duration. Finally, create a Main class to instantiate objects of both Car and 
// Bicycle classes, test their overridden methods, and demonstrate method overloading by 
// invoking different versions of the accelerate() method
// Define the Vehicle interface
// Define the Vehicle interface
// Vehicle interface
// Define the Vehicle interface with accelerate() and brake() methods
// Define the Vehicle interface with accelerate() and brake() methods
// Define the Vehicle interface with accelerate() and brake() methods
interface Vehicle{
	abstract void accelerate();
	abstract void brake();
	
}
class car1 implements Vehicle{
	public void accelerate() {
		System.out.println("Car is accelerating..");
	}
	public void brake() {
		System.out.println("Car brakes..");
	
	}
	//method overloading
	public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
	
}
class Bicycle implements Vehicle{
	public void accelerate() {
		System.out.println("Bicycle is accelerating..");
	}
	public void brake() {
		System.out.println("Bicycle brakes..");
	}
	public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
}
public class program8_Vehicle {
	public static void main(String[] args) {
        // Instantiate Car object
        car1 c1 = new car1();
        System.out.println("Car:");
        c1.accelerate();
        c1.brake();
        c1.accelerate(60);
        c1.accelerate(80, 10);

        System.out.println();

        // Instantiate Bicycle object
        Bicycle b1 = new Bicycle();
        System.out.println("Bicycle:");
        b1.accelerate();
        b1.brake();
        b1.accelerate(20);
        b1.accelerate(30,5);
 }

}
