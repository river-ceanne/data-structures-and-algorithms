package code.challenges;

import org.junit.Test;

import static code.challenges.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void testMultiBracketValidationOne() {
        assertFalse(multiBracketValidation("{{}]]"));
    }

    @Test
    public void testMultiBracketValidationTwo() {
        assertFalse(multiBracketValidation("]]]]"));
    }

    @Test
    public void testMultiBracketValidationThree() {
        assertTrue(multiBracketValidation("{}{}{}"));
    }

    @Test
    public void testMultiBracketValidationFour() {
        assertTrue(multiBracketValidation("[{}{}()]"));
    }

    @Test
    public void testMultiBracketValidationFiveWorded() {
        assertTrue(multiBracketValidation("[{Bubbles}Orchids(2)]"));
    }

    @Test
    public void testMultiBracketValidationSixWorded() {
        assertFalse(multiBracketValidation("[{Bubbles}Orchids(2)]{"));
    }

    @Test
    public void testMultiBracketValidationSeven() {
        assertTrue(multiBracketValidation("[({([])})]"));
    }
}