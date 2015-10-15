package de.egga.mega_types;

import de.egga.mega_types.numbers.NonNegativeInteger;
import de.egga.mega_types.numbers.PositiveInteger;
import de.egga.mega_types.texts.*;
import de.egga.mega_types.texts.email.EmailAddress;
import de.egga.mega_types.texts.email.Rfc822CompliantEmailAddress;
import de.egga.mega_types.texts.email.SimpleEmailAddress;

public class MegaTypes {

    public static PositiveInteger positiveInteger(int value) {
        return new PositiveInteger(value);
    }

    public static PositiveInteger posInt(int value) {
        return positiveInteger(value);
    }

    public static NonNegativeInteger nonNegativeInteger(int value) {
        return new NonNegativeInteger(value);
    }

    public static NonNegativeInteger nonNegInt(int value) {
        return nonNegativeInteger(value);
    }


    public static EmailAddress simpleEmailAdress(String value) {
        return new SimpleEmailAddress(value);
    }

    public static EmailAddress rfc822CompliantEmailAddress(String value) {
        return new Rfc822CompliantEmailAddress(value);
    }

    public static NonEmptyString nonEmptyString(String value) {
        return new NonEmptyString(value);
    }

    public static PrintableAsciiString printableAsciiString(String value) {
        return new PrintableAsciiString(value);
    }
}
