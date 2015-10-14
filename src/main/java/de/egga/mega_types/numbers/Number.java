package de.egga.mega_types.numbers;

public abstract class Number {

    private Integer value;

    public Number(Integer value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    abstract void validate(Integer value);

    public int getValue() {
        return value;
    }
}
