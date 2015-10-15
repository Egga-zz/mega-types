package de.egga.mega_types.texts;

import de.egga.mega_types.Value;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
    See https://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters for ASCII printable characters.
 */
public class PrintableAsciiString extends Value<String> {

    public static final Pattern VALIDATION_PATTERN = Pattern.compile("\\W");

    public PrintableAsciiString(String value) {
        super(value);
    }

    @Override
    public void validate() {
        Matcher matcher = VALIDATION_PATTERN.matcher(getValue());
        if (matcher.matches()) {
            throw new IllegalArgumentException();
        }
    }
}
