import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Library library) {
        this.books.add(library.removeBook());
    }
}
