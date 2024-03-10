
// . Developing a Simple College Management System in Java
// Create a Java program for managing colleges and students. The provided classes model the 
// relationship between colleges and students.
// The College class represents a college with attributes collegeName and collegeLoc. The 
// Student class represents a student with attributes studentId, studentName, and a reference
// to a College object. Enhance the Student class by adding a constructor that assigns a student 
// ID, name, and college information. Additionally, add a method named displayStudentInfo()
// that prints the student's ID, name, and the college information in which they are enrolled.
// In the Main class, instantiate at least two College objects and at least two Student objects. 
// Enroll each student in one of the colleges. Then, display the information of all colleges and all 
// students using the appropriate methods.
// College class
class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

// Student class
class Student {
    private int studentId;
    private String studentName;
    private College college; // Reference to College object

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled in College: " + college.getCollegeName() + " (" + college.getCollegeLoc() + ")");
    }
}

// Main class
public class Q5 {
    public static void main(String[] args) {
        // Create two College objects
        College college1 = new College("ABC College", "City A");
        College college2 = new College("XYZ College", "City B");

        // Create two Student objects and enroll them in colleges
        Student student1 = new Student(101, "Alice", college1);
        Student student2 = new Student(102, "Bob", college2);

        // Display information for all colleges and students
        System.out.println("College Information:");
        System.out.println(college1.getCollegeName() + " (" + college1.getCollegeLoc() + ")");
        System.out.println(college2.getCollegeName() + " (" + college2.getCollegeLoc() + ")");
        System.out.println("\nStudent Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
