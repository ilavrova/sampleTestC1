
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTest {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testdivTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("25 / 5 must be 5", 5, calc.div (25, 5));
    }

    @Test
    public void testAddTwoNegativValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testAddNegativandPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 + 5 must be -5", -5, calc.add(-10, 5));
    }

    @Test
    public void testsubPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("20 - 5 must be 15", 15, calc.sub(20, 5));
    }

    @Test
    public void testmultPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("5 * 5 must be 25", 25, calc.mult(5, 5));
    }

    @Test
    public void testdivPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("25 / 5 must be 5", 5, calc.div(25, 5));
    }



    @Test
    public void testAddTwoNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));

    }

    @Test
    public void testSqrtValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals("Sqrt from 25 must be 5", 5, calc.Sqrt(25), 0) ;

    }

    @Test
    public void testSqrValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("Sqr 6 must be 36", 36, calc.sqr(6));

    }
    //TODO
    //add new 5 tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
