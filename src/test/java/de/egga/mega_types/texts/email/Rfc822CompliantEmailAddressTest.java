package de.egga.mega_types.texts.email;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Rfc822CompliantEmailAddressTest {


    @Test
    public void it_should_validate_white_space() {
        String string = "\"Fred Bloggs\"@example.com";
        EmailAddress emailAddress = new Rfc822CompliantEmailAddress(string);
        assertThat(emailAddress.getValue()).isEqualTo(string);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_without_domain() {
        String string = "user@.invalid.com";
        new Rfc822CompliantEmailAddress(string);
    }

    @Test
    public void it_should_validate_optional_name() {
        String string = "Chuck Norris <gmail@chucknorris.com>";
        EmailAddress emailAddress = new Rfc822CompliantEmailAddress(string);
        assertThat(emailAddress.getValue()).isEqualTo(string);
    }

    @Test
    public void it_should_validate_special_chars() {
        String string = "webmaster@müller.de";
        EmailAddress emailAddress = new Rfc822CompliantEmailAddress(string);
        assertThat(emailAddress.getValue()).isEqualTo(string);
    }

    @Test
    public void it_should_return_value() {
        String string = "matteo@78.47.122.114";
        EmailAddress emailAddress = new Rfc822CompliantEmailAddress(string);
        assertThat(emailAddress.getValue()).isEqualTo(string);
    }
}