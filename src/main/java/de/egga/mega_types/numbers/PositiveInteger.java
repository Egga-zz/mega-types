package de.egga.mega_types.numbers;

public class PositiveInteger extends Number{

    public PositiveInteger(Integer value) {
        super(value);
        validate(value);
    }

    public void validate(Integer value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
    }
}
