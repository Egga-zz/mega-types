package de.egga.mega_types;

import de.egga.mega_types.numbers.NonNegativeInteger;
import de.egga.mega_types.numbers.PositiveInteger;
import de.egga.mega_types.texts.EmailAddress;
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


}