package com.smalaca.foobar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {
    private static final int ZERO = 0;
    private static final String EXPECTED_ZERO = "0";

    private final FooBar fooBar = new FooBar();

    @Test
    public void shouldReturnZeroWhenZeroGiven() {
        String result = fooBar.convert(ZERO);

        assertEquals(EXPECTED_ZERO, result);
    }
}
