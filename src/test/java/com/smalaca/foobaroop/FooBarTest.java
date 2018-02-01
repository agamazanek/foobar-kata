package com.smalaca.foobaroop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {
    private static final int ZERO = 0;
    private static final String EXPECTED_ZERO = "0";

    @Test
    public void shouldReturnZeroWhenZeroGiven() {
        FooBar fooBar = new FooBar(ZERO);

        String result = fooBar.asString();

        assertEquals(EXPECTED_ZERO, result);
    }
}
