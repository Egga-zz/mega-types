package de.egga.mega_types.texts;

import java.util.regex.Pattern;

public class SimpleEmailAddress implements EmailAddress {

    public static final Pattern VALIDATION_PATTERN = Pattern.compile("[^@]+\\@[^.]+[.].+");

    public static void validate(String value) {
        if (!VALIDATION_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException();
        }
    }

    private final String value;

    public SimpleEmailAddress(String value) {
        validate(value);
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
