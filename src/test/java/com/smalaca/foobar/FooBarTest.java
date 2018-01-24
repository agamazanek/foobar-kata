package com.smalaca.foobar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {
    private static final int ZERO = 0;
    private static final String EXPECTED_ZERO = "0";
    private static final int SOME_INT = 13;
    private static final String INT_AS_STRING = "13";
    private static final int SOME_MULTIPLICITY_OF_THREE = 9;
    private static final String FOO = "Foo";
    private static final int SOME_MULTIPLICITY_OF_FIVE = 25;
    private static final String BAR = "Bar";
    private static final int SOME_MULTIPLICITY_OF_FIFTEEN = 30;
    private static final String FOOBAR = "FooBar";

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

    @Test
    public void shouldReturnFooWhenIntDividableByThreeGiven() {
        String result = fooBar.convert(SOME_MULTIPLICITY_OF_THREE);

        assertEquals(FOO, result);
    }

    @Test
    public void shouldReturnBarWhenIntDividableByFiveGiven() {
        String result = fooBar.convert(SOME_MULTIPLICITY_OF_FIVE);

        assertEquals(BAR, result);
    }

    @Test
    public void shouldReturnFooBarWhenIntDividableByFifteenGiven() {
        String result = fooBar.convert(SOME_MULTIPLICITY_OF_FIFTEEN);

        assertEquals(FOOBAR, result);
    }
}
