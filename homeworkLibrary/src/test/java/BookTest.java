import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        book1 = new Book("Harry Potter and the Goblet of Fire");
        book2 = new Book("Wolf in White Van");
        book3 = new Book("To Kill a Mockingbird");
        book4 = new Book("1984");
    }

    @Test
    public void bookHasName(){
        assertEquals("1984", book4.getBookName());
    }

}
