import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library mylibrary;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before(){
        mylibrary = new Library(5);
        book1 = new Book("Harry Potter and the Goblet of Fire");
        book2 = new Book("Wolf in White Van");
        book3 = new Book("To Kill a Mockingbird");
        book4 = new Book("1984");
        book5 = new Book("The Very Hungry Caterpillar");
    }

    @Test
    public void canCountandAddBooks(){
        mylibrary.addBook(book1);
        assertEquals(1, mylibrary.bookCount());
    }

    @Test
    public void testIsThereCapacityHasRoom(){
        mylibrary.addBook(book1);
        mylibrary.addBook(book2);
        mylibrary.addBook(book3);
        assertEquals(true, mylibrary.isThereCapacity());
    }

    @Test
    public void testIsThereCapacityIsFull(){
        mylibrary.addBook(book1);
        mylibrary.addBook(book2);
        mylibrary.addBook(book3);
        mylibrary.addBook(book4);
        mylibrary.addBook(book5);
        assertEquals(false, mylibrary.isThereCapacity());
    }
}
