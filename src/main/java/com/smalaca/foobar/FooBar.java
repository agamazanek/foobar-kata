package com.smalaca.foobar;

class FooBar {
    String convert(int input) {
        if (isPositiveMultiplicityOfThree(input)) {
            return "Foo";
        }

        return String.valueOf(input);
    }

    private boolean isPositiveMultiplicityOfThree(int input) {
        return input % 3 == 0 && isNotZero(input);
    }

    private boolean isNotZero(int input) {
        return input != 0;
    }
}
