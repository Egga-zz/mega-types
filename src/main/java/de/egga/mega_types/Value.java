package de.egga.mega_types;

public abstract class Value<T> {

    private T value;

    public Value(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    public abstract void validate(T value);

    public T getValue() {
        return value;
    }
}
