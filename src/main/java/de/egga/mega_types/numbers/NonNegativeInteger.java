package de.egga.mega_types.numbers;

public class NonNegativeInteger extends Number {

    public NonNegativeInteger(int value) {
        super(value);
        validate(value);
    }

    @Override
    public void validate(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }
}
