package de.egga.mega_types.numbers;

import de.egga.mega_types.Value;

public class PositiveInteger extends Value<Integer> {

    public PositiveInteger(Integer value) {
        super(value);
    }

    public void validate() {
        if (getValue() < 1) {
            throw new IllegalArgumentException();
        }
    }
}
