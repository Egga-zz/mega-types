package de.egga.mega_types;

public abstract class Value<T> {

    private T value;

    public Value(T value) {
        this.value = value;
        assertThatValueIsNotNull();
        validate(value);
    }

    private void assertThatValueIsNotNull() {
        if (value == null) {
            throw new IllegalArgumentException();
        }
    }

    public abstract void validate(T value);

    public T getValue() {
        return value;
    }
}
