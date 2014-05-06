package de.weltraumschaf.katas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for {@link FizzBuzz}.
 */
public class FizzBuzzTest {

    @Test
    public void getResult_ShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResult_ShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", FizzBuzz.getResult(5));
        assertEquals("buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void getResult_ShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(15));
        assertEquals("fizzbuzz", FizzBuzz.getResult(30));
    }

    @Test
    public void getResult_ShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", FizzBuzz.getResult(1));
        assertEquals("2", FizzBuzz.getResult(2));
        assertEquals("4", FizzBuzz.getResult(4));
    }

}
