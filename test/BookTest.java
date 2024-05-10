import Library.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
   public void getTitle() {
        Book myBook = new Book("Half of a yellow sun", "Chimamanda", "1234");
        String title = myBook.getTitle();
        assertEquals("Title", title);
    }

    @Test
    public void getAuthor() {
        Book myBook = new Book("Purple Hibiscus", "Adichie", "3241");
        String author = myBook.getAuthor();
        assertEquals("Author", author);
    }

    @Test
    public void getIsbn() {
        Book myBook = new Book("Native son", "Richard Wright", "8967");
        String isbn = myBook.getIsbn();
        assertEquals("Isbn", isbn);
    }

}