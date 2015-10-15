package de.egga.mega_types.numbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerRange implements Iterator<Integer>, Iterable<Integer> {

    private final Integer start;
    private final Integer end;
    private Integer current;

    public IntegerRange(Integer start, Integer end) {
        validate(start, end);
        this.start = start;
        this.end = end;
        this.current = start;
    }

    private void validate(Integer start, Integer end) {
        if (start == null) {
            throw new IllegalArgumentException();
        }
        if (end == null) {
            throw new IllegalArgumentException();
        }
        if (start >= end) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> asList() {
        List<Integer> list = new ArrayList<>();
        for (Integer number : this) {
            list.add(number);
        }
        return list;
    }

    @Override
    public boolean hasNext() {
        return current <= end;
    }

    @Override
    public Integer next() {
        return current++;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }
}
