// Book.java
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }

    public void borrow() throws Exception {
        if (isBorrowed)
            throw new Exception("Book already borrowed.");
        isBorrowed = true;
    }

    public void returnBook() throws Exception {
        if (!isBorrowed)
            throw new Exception("Book was not borrowed.");
        isBorrowed = false;
    }

    public String toString() {
        return id + " - " + title + " by " + author + (isBorrowed ? " [Borrowed]" : " [Available]");
    }
}
