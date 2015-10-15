package de.egga.mega_types.texts.email;

import java.util.regex.Pattern;

public class SimpleEmailAddress extends EmailAddress {

    public static final Pattern VALIDATION_PATTERN = Pattern.compile("[^@]+\\@[^.]+[.].+");

    public SimpleEmailAddress(String value) {
        super(value);
    }

    @Override
    Pattern getValidationPattern() {
        return VALIDATION_PATTERN;
    }
}
