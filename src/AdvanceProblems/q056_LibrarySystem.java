//56: Create a Book class for a Library System.
/* Instance Variables: title, author, isbn.
   Static Variable: totalBooks - a counter for total number of instances.
   Instance Methods: borrowBook(), returnBook()
   Static Methods: getTotalBooks() - to get total number of books in the library */

package AdvanceProblems;

//Creating Book Class
class Book {

    static int totalBooks;

    //Instance Variables
    String isbn;
    String title;
    String author;

    boolean isBorrowed;

    //Static variable
    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    //Static Method
    static int getTotalBooks() {
        return totalBooks;
    }

    //Instance Method
    void borrowBook() {
        if (isBorrowed) {
            System.out.println(this.title + " is already Borrowed");
        } else {
            isBorrowed = true;
            System.out.println("Enjoy the Book " + this.title);
        }
    }

    //Instance Method
    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Hope you enjoyed " + this.title + ", Please leave a review");
        } else {
            System.out.println("The book " + this.title + " is already in the Library.");
        }
    }
}

public class q056_LibrarySystem {
    public static void main(String[] args) {

        Book JavaBasics = new Book("1", "Java", "James Gosling");
        Book PythonBasics = new Book("2");

        System.out.println("Total Books in Library : " + Book.getTotalBooks());

        JavaBasics.borrowBook();
        PythonBasics.borrowBook();
        JavaBasics.borrowBook();
        JavaBasics.returnBook();
        JavaBasics.returnBook();
    }
}
