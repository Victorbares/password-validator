package bares.vi.csci3130_a2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void validateworking() throws Exception {
        Validator valid = new Validator();

        // Test password word
        assertTrue((valid.validate("passWorD")>1));

        //test not long enough
        assertTrue((valid.validate("Notlong")>1));

        //test password working
        assertTrue((valid.validate("123456789")==1));


    }
}