package com.smalaca.foobaroop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {
    private static final int ZERO = 0;
    private static final String EXPECTED_ZERO = "0";
    private static final int SOME_INT = 13;
    private static final String INT_AS_STRING = "13";
    private static final int SOME_MULTIPLICITY_OF_THREE = 12;
    private static final String FOO = "Foo";
    private static final int SOME_MULTIPLICITY_OF_FIVE = 25;
    private static final String BAR = "Bar";
    private static final int SOME_MULTIPLICITY_OF_FIFTEEN = 45;
    private static final String FOOBAR = "FooBar";

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

    @Test
    public void shouldReturnFooWhenIntDividableByThreeGiven() {
        FooBar fooBar = new FooBar(SOME_MULTIPLICITY_OF_THREE);

        String result = fooBar.asString();

        assertEquals(FOO, result);
    }

    @Test
    public void shouldReturnBarWhenIntDividableByFiveGiven() {
        FooBar fooBar = new FooBar(SOME_MULTIPLICITY_OF_FIVE);

        String result = fooBar.asString();

        assertEquals(BAR, result);
    }

    @Test
    public void shouldReturnFooBarWhenIntDividableByFifteenGiven() {
        FooBar fooBar = new FooBar(SOME_MULTIPLICITY_OF_FIFTEEN);

        String result = fooBar.asString();

        assertEquals(FOOBAR, result);
    }
}
