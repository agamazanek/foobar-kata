package com.smalaca.foobaroop;


import static java.lang.String.valueOf;

class FooBar {
    private final int value;

    FooBar(int value) {
        this.value = value;
    }

    String asString() {
        String result = "";

        if (value != 0) {
            if (isValueDividableBy(3)) {
                result += "Foo";
            }

            if (isValueDividableBy(5)) {
                result += "Bar";
            }
        }

        return result.isEmpty() ? valueAsString() : result;
    }

    private boolean isValueDividableBy(int divider) {
        return value % divider == 0;
    }

    private String valueAsString() {
        return valueOf(value);
    }
}
