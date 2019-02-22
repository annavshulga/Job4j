package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar arrayChar = new ArrayChar("Shulga");
        boolean result = arrayChar.startWith("Shu");
        assertThat(result, is(true));
    }
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar arrayChar = new ArrayChar("Shulga");
        boolean result = arrayChar.startWith("Shy");
        assertThat(result, is(false));
    }
}
