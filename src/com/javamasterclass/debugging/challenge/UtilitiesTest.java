package com.javamasterclass.debugging.challenge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utils;

    @Before
    public void setUp() throws Exception {
        utils = new Utilities();
    }


    @Test
    public void everyNthChar() {
        char[] output = utils.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
        char[] output2 = utils.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
        assertNull("Did not get null return when argument passed was null", utils.removePairs(null));
        assertEquals("A", utils.removePairs("A"));
        assertEquals("", utils.removePairs(""));
    }

    @Test
    public void converter() {
        assertEquals(300, utils.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {
        utils.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() {
        assertNull(utils.nullIfOddLength("odd"));
        assertNotNull(utils.nullIfOddLength("even"));
    }

    @After
    public void tearDown() throws Exception {
    }
}