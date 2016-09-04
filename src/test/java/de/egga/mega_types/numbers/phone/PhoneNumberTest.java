package de.egga.mega_types.numbers.phone;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class PhoneNumberTest {

    private static final String INTERNATIONAL_PREFIX_WITH_ZEROES = "0049";
    private static final String INTERNATIONAL_PREFIX_WITH_PLUS = "+49";
    private static final String MOBILE_NUMBER_WITHOUT_PREFIX = "1701234567";
    private static final String MOBILE_NUMBER_WITH_PREFIX = "01701234567";

    @Test
    public void it_should_recognize_country_code_with_plus() {
        PhoneNumber phoneNumber = new PhoneNumber(INTERNATIONAL_PREFIX_WITH_PLUS + MOBILE_NUMBER_WITHOUT_PREFIX);
        assertThat(phoneNumber.getValue()).startsWith("+49");
    }

    @Test
    public void it_should_recognize_country_code_with_zeroes() {
        PhoneNumber phoneNumber = new PhoneNumber(INTERNATIONAL_PREFIX_WITH_ZEROES + MOBILE_NUMBER_WITHOUT_PREFIX);
        assertThat(phoneNumber.getValue()).startsWith("+49");
    }

    @Test
    public void it_should_add_country_code_if_none_given() {
        PhoneNumber phoneNumber = new PhoneNumber(MOBILE_NUMBER_WITHOUT_PREFIX);
        assertThat(phoneNumber.getValue()).startsWith("+49");
    }

    @Test
    public void it_should_add_german_prefix_if_leading_zero() {
        PhoneNumber phoneNumber = new PhoneNumber(MOBILE_NUMBER_WITH_PREFIX);
        assertThat(phoneNumber.getValue()).startsWith("+49");
    }
}
