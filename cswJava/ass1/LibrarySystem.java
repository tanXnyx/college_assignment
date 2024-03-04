
// Library System Assignment:
// Task: Develop a Java program for a library system incorporating encapsulation, abstraction, 
// and inheritance.
// i. LibraryResource Class:
//  - Abstract class with private attributes for title and author.
//  - Constructor, getters, setters, and an abstract method displayDetails().
// ii. Book Class:
//  - Subclass of LibraryResource with additional attribute pageCount.
//  - Constructor, getters, setters, and displayDetails() method override.
// iii. Magazine Class:
//  - Subclass of LibraryResource with additional attribute issueDate.
//  - Constructor, getters, setters, and displayDetails() method override.
// iv. DVD Class:
//  - Subclass of LibraryResource with additional attribute duration.
//  - Constructor, getters, setters, and displayDetails() method override.
// v. LibrarySystem Class (Main):
//  - Instantiate various library resources (e.g., Book, Magazine, DVD).
//  - Call displayDetails() for each instance to show resource information.
// LibraryResource.java (Abstract class)
abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
    }
}

class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + issueDate);
    }
}

class DVD extends LibraryResource {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration (minutes): " + duration);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create instances of Book, Magazine, and DVD
        Book book = new Book("Java Programming", "John Doe", 300);
        Magazine magazine = new Magazine("Tech Trends", "Jane Smith", "March 2024");
        DVD dvd = new DVD("Movie Night", "Director X", 120);

        // Display resource details
        System.out.println("Library Resources:");
        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        dvd.displayDetails();
    }
}
