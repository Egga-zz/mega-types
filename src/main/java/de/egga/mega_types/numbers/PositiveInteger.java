package de.egga.mega_types.numbers;

public class PositiveInteger {

    private final int value;

    public PositiveInteger(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
    }

    public int getValue() {
        return value;
    }
}
