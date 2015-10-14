package de.egga.mega_types.texts;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonEmptyStringTest {

    @Test
    public void it_should_return_value() {
        String value = "some text";
        NonEmptyString nonEmptyString = new NonEmptyString(value);
        assertThat(nonEmptyString.getValue()).isEqualTo(value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_on_empty_string() {
        new NonEmptyString("");
    }
}