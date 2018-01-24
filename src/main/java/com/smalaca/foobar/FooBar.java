package com.smalaca.foobar;

class FooBar {
    private static final String EMPTY = "";

    String convert(int input) {
        String output = EMPTY;

        if (isPositiveMultiplicityOfThree(input)) {
            output += "Foo";
        }
        
        if (isPositiveMultiplicityOfFive(input)) {
            output += "Bar";
        }

        return isEmpty(output) ? String.valueOf(input) : output;
    }

    private boolean isEmpty(String output) {
        return EMPTY.equals(output);
    }

    private boolean isPositiveMultiplicityOfFive(int input) {
        return isPositiveMultiplicityOf(5, input);
    }

    private boolean isPositiveMultiplicityOfThree(int input) {
        return isPositiveMultiplicityOf(3, input);
    }

    private boolean isPositiveMultiplicityOf(int divider, int input) {
        return input % divider == 0 && isNotZero(input);
    }

    private boolean isNotZero(int input) {
        return input != 0;
    }
}
