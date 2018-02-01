package com.smalaca.foobaroop;

import static java.lang.String.valueOf;

class FooBar {
    private final int value;

    FooBar(int value) {
        this.value = value;
    }

    String asString() {
        if (value == 0) {
            return valueAsString();
        }

        if (value % 3 == 0) {
            return "Foo";
        }

        if (value % 5 == 0) {
            return "Bar";
        }

        return valueAsString();
    }

    private String valueAsString() {
        return valueOf(value);
    }
}
