
public class Q2 {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Q2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Create an object of Rectangle
        Q2 myRectangle = new Q2(5.0, 3.0);

        // Display attributes
        System.out.println("Rectangle Length: " + myRectangle.getLength());
        System.out.println("Rectangle Width: " + myRectangle.getWidth());

        // Calculate and display area
        double area = myRectangle.calculateArea();
        System.out.println("Rectangle Area: " + area);

        // Calculate and display perimeter
        double perimeter = myRectangle.calculatePerimeter();
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
