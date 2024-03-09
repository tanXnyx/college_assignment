
class Q3 {
    private double x;
    private double y;

    // Parameterized constructor to initialize x and y
    public Q3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor to create a new Point with the same attribute values
    public Q3(Q3 other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        // Create a Point object using the parameterized constructor
        Q3 p1 = new Q3(3.0, 4.0);

        // Create a new Point object using the copy constructor
        Q3 p2 = new Q3(p1);

        // Modify p1's attributes
        p1.setX(5.0);
        p1.setY(6.0);

        // Display attribute values for both points
        System.out.println("Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point p2 (copied from p1): (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
