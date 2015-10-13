package de.egga.mega_types;

import de.egga.mega_types.numbers.PositiveInteger;

public class MegaTypes {

    public static PositiveInteger posInt(int value) {
        return positiveInteger(value);
    }

    public static PositiveInteger positiveInteger(int value) {
        return new PositiveInteger(value);
    }
}
