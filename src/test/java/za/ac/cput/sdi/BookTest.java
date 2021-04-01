package za.ac.cput.sdi;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book1, book2, book3;

    @BeforeEach
    void setUp() {
        book1 = new Book();
        book2 = new Book();
        book3 = book1;
    }


    @Test
    void testObjectIdentity(){
        assertSame(book1, book3);
    }

    @Test
    void testObjectEquality(){
        assertEquals(book1, book3);
    }

    @Test
    void failingTest() {
        assertSame(book1, book3);
        fail("Test has successfully failed");
    }

    @Disabled
    @Test
    void testThatWillBeSkipped(){
        assertEquals(book1, book2);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void failsAfter10MillisecondsOfExTime() {
        assertNotEquals(book1, book2);
        assertNotSame(book1, book2);

    }

}