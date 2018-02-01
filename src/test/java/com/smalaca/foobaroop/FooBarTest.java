package com.smalaca.foobaroop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {
    private static final int ZERO = 0;
    private static final String EXPECTED_ZERO = "0";
    private static final int SOME_INT = 13;
    private static final String INT_AS_STRING = "13";

    @Test
    public void shouldReturnZeroWhenZeroGiven() {
        FooBar fooBar = new FooBar(ZERO);

        String result = fooBar.asString();

        assertEquals(EXPECTED_ZERO, result);
    }

    @Test
    public void shouldReturnStringRepresentationOfValue() {
        FooBar fooBar = new FooBar(SOME_INT);

        String result = fooBar.asString();

        assertEquals(INT_AS_STRING, result);
    }
}
