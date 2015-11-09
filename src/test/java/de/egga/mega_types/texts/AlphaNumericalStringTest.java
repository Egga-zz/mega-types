package de.egga.mega_types.texts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class AlphaNumericalStringTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"-"}, {" "}, {"_"}, {"*"}, {"."}, {"$"}, {"+"}
        });
    }

    @Parameterized.Parameter
    public String character;

    @Test
    public void it_should_return_value() {
        AlphaNumericalString alphaNumericalString = new AlphaNumericalString("Marteria1337");
        assertThat(alphaNumericalString.getValue()).isEqualTo("Marteria1337");
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_on_special_chars() {
        new AlphaNumericalString(character);
    }
}