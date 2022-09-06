import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(5);
        book = new Book("Shadow over Innsmouth", "H.P. Lovecraft", "Horror");
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void addToBorrower() {
        library.addBook(book);
        borrower.addBook(library);
        assertEquals(1, borrower.countBooks());
    }
}
