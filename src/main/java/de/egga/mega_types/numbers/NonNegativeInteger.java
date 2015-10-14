package de.egga.mega_types.numbers;

import de.egga.mega_types.Value;

public class NonNegativeInteger extends Value<Integer> {

    public NonNegativeInteger(Integer value) {
        super(value);
    }

    @Override
    public void validate() {
        if (getValue() < 0) {
            throw new IllegalArgumentException();
        }
    }
}
