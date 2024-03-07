
// Student class representing a student
// EnrollmentSystem.java (Interface defining contracts)

interface EnrollmentSystem {
    void enrollStudent(Student1 student, Course course);
    void dropStudent(Student1 student, Course course);
    void displayEnrollmentDetails();
}

// Student1.java
class Student1 {
    private String studentId;
    private String studentName;

    public Student1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course.java
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment.java
class Enrollment implements EnrollmentSystem {
    private Student1[] students;
    private Course[] courses;
    private int size;

    public Enrollment(int capacity) {
        students = new Student1[capacity];
        courses = new Course[capacity];
        size = 0;
    }

    @Override
    public void enrollStudent(Student1 student, Course course) {
        students[size] = student;
        courses[size] = course;
        size++;
        System.out.println("Student " + student.getStudentName() + " enrolled in course " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student1 student, Course course) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student) && courses[i].equals(course)) {
                System.out.println("Student " + student.getStudentName() + " dropped from course " + course.getCourseName());
                // Shift elements to fill the gap
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                    courses[j] = courses[j + 1];
                }
                students[size - 1] = null;
                courses[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Student " + student.getStudentName() + " is not enrolled in course " + course.getCourseName());
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < size; i++) {
            System.out.println("Student: " + students[i].getStudentName() + ", Course: " + courses[i].getCourseName());
        }
    }
}

// Main.java
public class program9_Enrollment {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment(10); // Assuming capacity of 10

        // Create students
        Student1 student1 = new Student1("S001", "John Doe");
        Student1 student2 = new Student1("S002", "Jane Smith");

        // Create courses
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");

        // Enroll students in courses
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        // Display enrollment details
        enrollmentSystem.displayEnrollmentDetails();

        // Drop student from a course
        enrollmentSystem.dropStudent(student1, course1);

        // Display updated enrollment details
        enrollmentSystem.displayEnrollmentDetails();
 }
}