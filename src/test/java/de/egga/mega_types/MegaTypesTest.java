package de.egga.mega_types;

import de.egga.mega_types.numbers.NonNegativeInteger;
import de.egga.mega_types.numbers.PositiveInteger;
import de.egga.mega_types.texts.email.EmailAddress;
import de.egga.mega_types.texts.NonEmptyString;
import de.egga.mega_types.texts.PrintableAsciiString;
import de.egga.mega_types.texts.email.Rfc822CompliantEmailAddress;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MegaTypesTest {

    @Test
    public void positive_integer_should_return_proper_type() {
        assertThat(MegaTypes.positiveInteger(1)).isInstanceOf(PositiveInteger.class);
    }

    @Test
    public void pos_int_should_return_proper_type() {
        assertThat(MegaTypes.posInt(1)).isInstanceOf(PositiveInteger.class);
    }

    @Test
    public void non_negative_integer_should_return_proper_type() {
        assertThat(MegaTypes.nonNegativeInteger(1)).isInstanceOf(NonNegativeInteger.class);
    }

    @Test
    public void non_neg_int_should_return_proper_type() {
        assertThat(MegaTypes.nonNegInt(1)).isInstanceOf(NonNegativeInteger.class);
    }

    @Test
    public void simple_email_address_should_return_proper_type() {
        assertThat(MegaTypes.simpleEmailAdress("types@egga.de")).isInstanceOf(EmailAddress.class);
    }

    @Test
    public void rfc_compliant_email_address_should_return_proper_type() {
        assertThat(MegaTypes.rfc822CompliantEmailAddress("types@egga.de")).isInstanceOf(Rfc822CompliantEmailAddress.class);
    }

    @Test
    public void non_empty_string_should_return_proper_type() {
        assertThat(MegaTypes.nonEmptyString("egga")).isInstanceOf(NonEmptyString.class);
    }

    @Test
    public void printable_ascii_string_should_return_proper_type() {
        assertThat(MegaTypes.printableAsciiString("egga")).isInstanceOf(PrintableAsciiString.class);
    }
}