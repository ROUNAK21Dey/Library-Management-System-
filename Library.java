// Library.java
import java.util.*;

public class Library {
    private HashMap<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        books.values().forEach(System.out::println);
    }

    public void borrowBook(String bookId) {
        try {
            Book book = books.get(bookId);
            if (book == null) {
                System.out.println("Book not found.");
                return;
            }
            book.borrow();
            System.out.println("Book borrowed successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void returnBook(String bookId) {
        try {
            Book book = books.get(bookId);
            if (book == null) {
                System.out.println("Book not found.");
                return;
            }
            book.returnBook();
            System.out.println("Book returned successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
