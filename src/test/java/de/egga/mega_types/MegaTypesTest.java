package de.egga.mega_types;

import de.egga.mega_types.numbers.PositiveInteger;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MegaTypesTest {

    @Test
    public void pos_int_should_return_positive_integer() {
        PositiveInteger posInt = MegaTypes.posInt(1);
        assertThat(posInt).isInstanceOf(PositiveInteger.class);
    }

    @Test
    public void positive_integer_should_return_positive_integer() {
        PositiveInteger posInt = MegaTypes.positiveInteger(1);
        assertThat(posInt).isInstanceOf(PositiveInteger.class);
    }
}