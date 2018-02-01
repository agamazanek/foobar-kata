package com.smalaca.foobaroop;

import static java.lang.String.valueOf;

class FooBar {
    private final int value;

    FooBar(int value) {
        this.value = value;
    }

    String asString() {
        return valueOf(value);
    }
}
