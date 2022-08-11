package com.stackroute.loops;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberAppTests {

    private ByteArrayOutputStream outStream;
    private static final String MESSAGE = "Check the logic of your method findLargestNumber";
    private static final String INPUT_VALIDATION_MESSAGE = "Check the logic of your method inputValidator";
    private static final String PROPER_NEGATIVE_MESSAGE = "Give proper input not negative values";
    private static final String PROPER_ZERO_MESSAGE = "Give proper input not number(N) equals to zero";
    private static final String PROPER_DIGIT_MESSAGE = "Give proper input not digit greater than 9";

    @BeforeEach
    public void setUp() {
        outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));
    }

    @AfterEach
    public void tearDown() {
        outStream = null;
    }

    @Test
    public void givenSystemInputNumberAsZeroThenReturnErrorString() {
        String input = "0 4";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        LargestNumber.main(null);
        assertEquals(PROPER_ZERO_MESSAGE, outStream.toString().trim().replaceAll(".*\n", ""), INPUT_VALIDATION_MESSAGE);
    }

    @Test
    public void givenSystemInputNumberAsNegativeThenReturnErrorString() {
        String input = "-5 0";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        LargestNumber.main(null);
        assertEquals(PROPER_NEGATIVE_MESSAGE, outStream.toString().trim().replaceAll(".*\n", ""), INPUT_VALIDATION_MESSAGE);
    }

    @Test
    public void givenSystemInputDigitAsNegativeThenReturnErrorString() {
        String input = "20 -4";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        LargestNumber.main(null);
        assertEquals(PROPER_NEGATIVE_MESSAGE, outStream.toString().trim().replaceAll(".*\n", ""), INPUT_VALIDATION_MESSAGE);
    }

    @Test
    public void givenSystemInputDigitAsGreaterThenNineThenReturnErrorString() {
        String input = "44 10";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        LargestNumber.main(null);
        assertEquals(PROPER_DIGIT_MESSAGE, outStream.toString().trim().replaceAll(".*\n", ""), INPUT_VALIDATION_MESSAGE);
    }

    @Test
    public void givenSystemInputThenReturnLargestNumber() {
        String input = "124 2";
        String output = "119";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        LargestNumber.main(null);
        assertEquals(output, outStream.toString().trim().replaceAll(".*\n", ""), MESSAGE);
    }
}
