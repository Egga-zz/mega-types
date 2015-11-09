package de.egga.mega_types.texts;

import de.egga.mega_types.Value;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AlphaNumericalString extends Value<String> {

    public static final Pattern VALIDATION_PATTERN = Pattern.compile("^[a-zA-Z0-9]*$");

    public AlphaNumericalString(String value) {
        super(value);
    }

    @Override
    public void validate() {
        Matcher matcher = VALIDATION_PATTERN.matcher(getValue());
        if (!matcher.matches()) {
            throw new IllegalArgumentException();
        }
    }
}
