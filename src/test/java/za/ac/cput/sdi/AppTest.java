package za.ac.cput.sdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Phindiwe  Bambata 217180833
 * This is program test arrays
 *
 */

public class AppTest {
    private int array1,array2;
    @BeforeEach
    void setUp() {
        int[] array1 = {2, 5, 8};
        int[] array2 = {2, 5, 8};
    }

    @Test
    void testIdentity() {
        assertSame(array1,array2);

    }

    @Test
    void testEquality() {
        assertEquals(array1, array2);

    }

    @Test
    void failTest() {
        assertNotSame(array1, array2);

    }


    @Test
    void testTimeouts(){
        assertTimeout(Duration.ofMillis(20), () -> {
            Thread.sleep(1000);
        });
    }


    @Disabled
    @Test
    void disableTest(){
        assertEquals(array1,array2);

    }
}
