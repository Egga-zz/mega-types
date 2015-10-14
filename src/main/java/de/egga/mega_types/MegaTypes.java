package de.egga.mega_types;

import de.egga.mega_types.numbers.NonNegativeInteger;
import de.egga.mega_types.numbers.PositiveInteger;
import de.egga.mega_types.texts.EmailAddress;
import de.egga.mega_types.texts.SimpleEmailAddress;

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
}
