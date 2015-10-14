package de.egga.mega_types.numbers;

public abstract class Number {

    private int value;

    public Number(int value) {
        this.value = value;
    }

    abstract void validate(int value);

    public int getValue() {
        return value;
    }
}
