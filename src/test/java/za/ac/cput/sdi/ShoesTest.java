package za.ac.cput.sdi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ShoesTest {

    //EqualityTest
    @Test
    void testShoe(){

        Shoes shoe1 = new Shoes("Nike", 7);
        Shoes shoe2 = new Shoes("Nike", 7);
        assertEquals(shoe1,shoe2);
    }

    //IdentityTest
    @Test
    void testGetSize() {

        Shoes shoe = new Shoes("Nike", 7);
        assertSame(shoe.getSize(),7);
    }

    //FailingTest
    //This one proves they arent equal
    @Test
    void testFailingShoe(){

        Shoes shoe1 = new Shoes("Nike", 7);
        Shoes shoe2 = new Shoes("Adidas", 5);
        assertNotEquals(shoe1,shoe2);
    }

    //FailingTest-2
    //This one fails
    @Test
    void testFailingShoeFail(){

        Shoes shoe1 = new Shoes("Nike", 7);
        Shoes shoe2 = new Shoes("Adidas", 5);
        assertEquals(shoe1,shoe2);
    }

    //Timeouts
    @Test
    void testTimeoutShoe(){
        assertTimeout(Duration.ofSeconds(1),()->{
            Shoes shoe1 = new Shoes("Nike", 7);
            Shoes shoe2 = new Shoes("Adidas", 5);
        });
    }

    //DisablingTest
    @Disabled("Disabled for Disable test!")
    @Test
    void testDisabledShoe(){

        Shoes shoe1 = new Shoes("Nike", 7);
        Shoes shoe2 = new Shoes("Nike", 7);
        assertEquals(shoe1,shoe2);
    }
}

