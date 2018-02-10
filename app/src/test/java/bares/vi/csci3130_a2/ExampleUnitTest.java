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
        assertTrue((valid.validate("passWorD")>=1));

        //test not long enough
        assertTrue((valid.validate("Notlong")>=1));

        //test require digit
        assertTrue((valid.validate("Nodigita")>=1));

        //test upper and lower case
        assertTrue((valid.validate("nolowupp1")>=1));

        //test special character
        assertTrue((valid.validate("NospecialC1")>=1));

        //test password working
        assertTrue((valid.validate("123456789")==0));


    }
}