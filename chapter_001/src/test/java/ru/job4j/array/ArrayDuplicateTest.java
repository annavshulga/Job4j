package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenArrayDuplicate() {
        ArrayDuplicate arDup = new ArrayDuplicate();
        String[] data = {"a", "b", "c", "a", "c", "f", "a", "a", "b", "j", "i", "a", "a", "b", "b"};
        String[] result = arDup.remove(data);
        String[] expected = {"a", "b", "c", "f", "j", "i"};
        assertThat(result, is(expected));
    }
}
