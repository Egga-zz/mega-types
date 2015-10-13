package de.egga.mega_types;

import de.egga.mega_types.numbers.PositiveInteger;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MegaTypesTest {

    @Test
    public void itName() {
        PositiveInteger posInt = MegaTypes.posInt(1);
        assertThat(posInt).isInstanceOf(PositiveInteger.class);
    }
}