package de.egga.mega_types.numbers;

public class NonNegativeInteger {

    private int value;

    public static void validate(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }

    public NonNegativeInteger(int value) {
        validate(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
