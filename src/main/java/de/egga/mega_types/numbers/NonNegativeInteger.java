package de.egga.mega_types.numbers;

public class NonNegativeInteger extends Number {

    public NonNegativeInteger(Integer value) {
        super(value);
        validate(value);
    }

    @Override
    public void validate(Integer value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }
}
