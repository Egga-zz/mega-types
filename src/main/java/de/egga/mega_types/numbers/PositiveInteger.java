package de.egga.mega_types.numbers;

import de.egga.mega_types.Value;

public class PositiveInteger extends Value<Integer> {

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
