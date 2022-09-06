import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genres;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genres = new HashMap<>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.capacityCheck()) {
            this.books.add(book);
            if (this.genres.containsKey(book.getGenre())) {
                this.genres.put(book.getGenre(), this.genres.get(book.getGenre()) + 1);
            } else {
                this.genres.put(book.getGenre(), 1);
            }
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }

    public boolean capacityCheck() {
        if (this.countBooks() < this.capacity) {
            return true;
        } else {
            return false;
        }
    }

    public int genreCount(String genre) {return this.genres.get(genre);}

}
