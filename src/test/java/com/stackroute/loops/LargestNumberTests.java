package com.stackroute.loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;


public class LargestNumberTests {
    private LargestNumber largestNumber;

    private static final String MESSAGE = "Check the logic of your method findLargestNumber";

    @BeforeEach
    public void setUp() {
        largestNumber = new LargestNumber();
    }

    @AfterEach
    public void tearDown() {
        largestNumber = null;
    }


    @Test
    public void givenPositiveNumberAndDigitThenReturnLargestNumber() {
        assertEquals(119, largestNumber.findLargestNumber(123, 2), MESSAGE);
        assertEquals(4499, largestNumber.findLargestNumber(4582, 5), MESSAGE);
        assertEquals(98499, largestNumber.findLargestNumber(98512, 5), MESSAGE);
        assertEquals(547999, largestNumber.findLargestNumber(548624, 8), MESSAGE);
        assertEquals(199999, largestNumber.findLargestNumber(234523, 2), MESSAGE);
        assertEquals(699999, largestNumber.findLargestNumber(701021, 0), MESSAGE);
    }

    @Test
    public void givenPositiveNumberAndDigitNotInNumberThenReturnLargestNumber() {
        assertEquals(1000, largestNumber.findLargestNumber(1000, 2), MESSAGE);
        assertEquals(4444, largestNumber.findLargestNumber(4444, 3), MESSAGE);
    }

    @Test
    public void givenPositiveNumberOneAndDigitOneThenReturnMinusOne() {
        assertEquals(-1, largestNumber.findLargestNumber(1, 1), MESSAGE);
    }
}
