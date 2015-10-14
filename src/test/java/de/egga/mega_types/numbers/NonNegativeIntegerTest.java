package de.egga.mega_types.numbers;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonNegativeIntegerTest {

    @Test
    public void it_should_return_value() {
        NonNegativeInteger number = new NonNegativeInteger(2);
        assertThat(number.getValue()).isEqualTo(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_on_negative_number() {
         new NonNegativeInteger(-2);
    }

    @Test
    public void it_should_not_fail_on_zero() {
         new NonNegativeInteger(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_on_null() {
         new NonNegativeInteger(null);
    }
}