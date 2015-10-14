package de.egga.mega_types;

public abstract class Value<T> {

    private T value;

    public Value(T value) {
        this.value = value;
        assertThatValueIsNotNull();
        validate();
    }

    public abstract void validate();

    public T getValue() {
        return value;
    }

    private void assertThatValueIsNotNull() {
        if (value == null) {
            throw new IllegalArgumentException();
        }
    }
}
