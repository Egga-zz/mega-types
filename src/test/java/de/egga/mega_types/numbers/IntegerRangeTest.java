package de.egga.mega_types.numbers;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class IntegerRangeTest {

    @Test
    public void it_should_start_at_one() {
        IntegerRange range = new IntegerRange(1, 5);
        assertThat(range.next()).isEqualTo(1);
    }

    @Test
    public void it_should_end_at_five() {
        IntegerRange range = new IntegerRange(1, 5);
        assertThat(lastElementOf(range)).isEqualTo(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_if_start_greater_than_end() {
        new IntegerRange(5, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_if_start_equals_end() {
        new IntegerRange(2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_if_start_is_null() {
        new IntegerRange(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_fail_if_end_is_null() {
        new IntegerRange(2, null);
    }

    @Test
    public void it_should_iterate_over_positive_values() {
        List<Integer> expected = asList(9, 10, 11, 12, 13, 14);
        List<Integer> actual = new IntegerRange(9, 14).asList();
        assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    public void it_should_iterate_over_negative_values() {
        List<Integer> expected = asList(-367, -366, -365, -364);
        List<Integer> actual = new IntegerRange(-367, -364).asList();
        assertThat(actual).hasSameElementsAs(expected);
    }


    private Integer lastElementOf(IntegerRange range) {
        Integer current = null;
        while (range.hasNext()) {
            current = range.next();
        }
        return current;
    }
}