package de.egga.mega_types.texts;

import de.egga.mega_types.Value;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class EmailAddress extends Value<String>{

    public EmailAddress(String value) {
        super(value);
    }

    abstract Pattern getValidationPattern();

    public void validate() {
        Matcher matcher = getValidationPattern().matcher(getValue());
        if (!matcher.matches()) {
            throw new IllegalArgumentException();
        }
    }
}
