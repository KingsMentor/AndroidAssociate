package xyz.belvi.localunittest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(2, 3, 4), 9);
        assertTrue("value1 is not greater than value2", calculator.greaterThan(5, 30));
    }
}