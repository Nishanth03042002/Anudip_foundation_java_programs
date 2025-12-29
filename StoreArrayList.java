import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;
    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    @Override
    public String toString() {
        return "Book [bookId=" + bookId +
               ", bookName=" + bookName +
               ", authorName=" + authorName + "]";
    }
}

public class StoreArrayList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "let us c", "Yashavant P Kanetkar"));
        books.add(new Book(102, "head first java", "Kathy Sierra"));
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
