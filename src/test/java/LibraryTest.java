import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Book book1;
    private Library library;
    private Borrower borrower;

    @Before
    public void before() {
        book = new Book("Shadow Over Innsmouth", "H.P. LoveCraft", "Horror");
        book1 = new Book("lmfao", "poggers", "Horror");
        library = new Library(5);
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookTest() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void overCapacity() {
        Library library1 = new Library(0);
        library1.addBook(book);
        assertEquals(0, library1.countBooks());
    }

    @Test
    public void underCapacity() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.countBooks());
    }

    @Test
    public void oneGenre() {
        library.addBook(book);
        assertEquals(1, library.genreCount("Horror"));
    }

    @Test
    public void twoGenre() {
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.genreCount("Horror"));
    }



}
