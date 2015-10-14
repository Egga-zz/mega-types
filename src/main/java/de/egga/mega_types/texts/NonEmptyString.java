package de.egga.mega_types.texts;

import de.egga.mega_types.Value;

public class NonEmptyString extends Value<String> {

    public NonEmptyString(String value) {
        super(value);
    }

    @Override
    public void validate() {
        if (getValue().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}
