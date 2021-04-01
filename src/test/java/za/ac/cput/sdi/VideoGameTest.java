/*
 * VideoGameTest.java
 * @Author Keenan Barends 219002959
 * This is a Java Test Class.
 * Date: 01 April 2021
 */

package za.ac.cput.sdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameTest {

    private VideoGame videoGame1;
    private VideoGame videoGame2;
    private VideoGame videoGame3;

    @BeforeEach
    void setUp()
    {
        videoGame1 = new VideoGame();
        videoGame2 = new VideoGame();
        videoGame3 = videoGame1;
    }

    // Object Equality
    @Test
    void testEquality()
    {
        assertEquals(videoGame1, videoGame3);
    }

    // Object Identity
    @Test
    void testIdentity()
    {
        assertSame(videoGame1, videoGame3 );
    }

    // Failure Test
    @Test
    void testFailure()
    {
        fail("The Test has failed.");
    }

    // Timeout Test
    @Timeout(1000)
    @Test
    void testTimeout()
    {
        assertEquals(videoGame1, videoGame3);
    }

    // Disable Test
    @Disabled
    @Test
    void testDisabling()
    {
        assertEquals(videoGame1.getTitle(), videoGame2.getTitle());
        System.out.println("The Test has been disabled.");

    }



}