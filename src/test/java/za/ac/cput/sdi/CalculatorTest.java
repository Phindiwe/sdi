package za.ac.cput.sdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    int y;
    int x;
    int z;
    @BeforeEach
    void setUp() {
         y = x;
    }
    //Identity test
    @Test
    public void testIdentity(){
        assertSame(x,y);
    }
    //Equality test
    @Test
    public void testEquality(){
        assertEquals(x,y);
    }
    //failing Test
    @Test
    public void failingTest(){
        assertNotSame(x,y);
    }
    //Disabled Test
    @Test
    @Disabled
    public void disablingTest(){
        assertNotSame(y,z);
    }
    // testTimeout
    @Test
    public void testTimeout(){ assertTimeout (Duration.ofMillis(20),() -> {
               Thread.sleep(5000);

        System.out.println("I got here");
    });
    }

}