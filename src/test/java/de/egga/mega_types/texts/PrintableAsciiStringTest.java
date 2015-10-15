package de.egga.mega_types.texts;

import org.junit.Test;

public class PrintableAsciiStringTest {

    @Test
    public void it_should_validate_lower_case_letters() {
        new PrintableAsciiString("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void it_should_validate_upper_case_letters() {
        new PrintableAsciiString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    @Test
    public void it_should_validate_numbers() {
        new PrintableAsciiString("0123456789");
    }

    @Test
    public void it_should_validate_printable_special_characters() {
        new PrintableAsciiString("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
    }
}