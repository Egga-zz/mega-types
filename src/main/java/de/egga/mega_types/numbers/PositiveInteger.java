package de.egga.mega_types.numbers;

public class PositiveInteger {

    public static void validate(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
    }

    private final int value;

    public PositiveInteger(int value) {
        validate(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
