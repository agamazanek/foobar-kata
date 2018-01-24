package com.smalaca.foobar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {
    private static final int ZERO = 0;
    private static final String EXPECTED_ZERO = "0";
    private static final int SOME_INT = 13;
    private static final String INT_AS_STRING = "13";

    private final FooBar fooBar = new FooBar();

    @Test
    public void shouldReturnZeroWhenZeroGiven() {
        String result = fooBar.convert(ZERO);

        assertEquals(EXPECTED_ZERO, result);
    }

    @Test
    public void shouldReturnStringRepresentationOfValue() {
        String result = fooBar.convert(SOME_INT);

        assertEquals(INT_AS_STRING, result);
    }

}
