package de.egga.mega_types.numbers.phone;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

import static com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;

public class PhoneNumber {

    private static PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

    private String value;

    public PhoneNumber(String value) {
        Phonenumber.PhoneNumber parsed = parse(value);
        validate(parsed);
        String normalized = format(parsed);

        this.value = normalized;
    }

    public String getValue() {
        return value;
    }


    private Phonenumber.PhoneNumber parse(String value) {
        try {
            return phoneUtil.parse(value, "DE");
        } catch (NumberParseException e) {
            throw new IllegalArgumentException();
        }
    }

    private void validate(Phonenumber.PhoneNumber parsedNumber) {
        if (isInvalid(parsedNumber)) {
            throw new IllegalArgumentException();
        }
    }

    private String format(Phonenumber.PhoneNumber parsedNumber) {
        return phoneUtil.format(parsedNumber, INTERNATIONAL);
    }

    private boolean isInvalid(Phonenumber.PhoneNumber parsedNumber) {
        return !phoneUtil.isValidNumber(parsedNumber);
    }
}
