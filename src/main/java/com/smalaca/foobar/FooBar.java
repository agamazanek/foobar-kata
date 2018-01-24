package com.smalaca.foobar;

class FooBar {
    String convert(int input) {
        if (isPositiveMultiplicityOfThree(input)) {
            return "Foo";
        }
        
        if (isPositiveMultiplicityOfFive(input)) {
            return "Bar";
        }

        return String.valueOf(input);
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
