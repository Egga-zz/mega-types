package de.egga.mega_types.texts.email;

import de.egga.mega_types.texts.email.EmailAddress;
import de.egga.mega_types.texts.email.SimpleEmailAddress;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleEmailAddressTest {

    String VALID_ADDRESS = "user@domain.tld";

    @Test
    public void it_should_accept_valid_email_address() {
        EmailAddress emailAddress = new SimpleEmailAddress(VALID_ADDRESS);
        assertThat(emailAddress.getValue()).isEqualTo(VALID_ADDRESS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_without_user() {
        String invalidAddress = VALID_ADDRESS.replace("user", "");
        new SimpleEmailAddress(invalidAddress);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_without_at_sign() {
        String invalidAddress = VALID_ADDRESS.replace("@", "_");
        new SimpleEmailAddress(invalidAddress);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_without_domain() {
        String invalidAddress = VALID_ADDRESS.replace("domain", "");
        new SimpleEmailAddress(invalidAddress);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_without_tld_separator() {
        String invalidAddress = VALID_ADDRESS.replace(".", "_");
        new SimpleEmailAddress(invalidAddress);
    }
    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_without_tld() {
        String invalidAddress = VALID_ADDRESS.replace("tld", "");
        new SimpleEmailAddress(invalidAddress);
    }
}