package de.egga.mega_types.numbers;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositiveIntegerTest {

    @Test
    public void it_should_return_value() {
        PositiveInteger posInt = new PositiveInteger(1);
        assertThat(posInt.getValue()).isEqualTo(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_on_negative_value() {
        new PositiveInteger(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_on_zero() {
        new PositiveInteger(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_on_null() {
        new PositiveInteger(null);
    }
}