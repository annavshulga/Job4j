package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class FindLoopTest {
    @Test
    public void whenArrayHas5Then3() {
        FindLoop findLoop = new FindLoop();
        int[] data = {1, 3, 8, 5, 10, 4};
        int result = findLoop.indexOf(data, 5);
        assertThat(result, is(3));
    }
    @Test
    public void whenArrayHasNot5ThenMinusOne() {
        FindLoop findLoop = new FindLoop();
        int[] data = {1, 3, 8, 10, 7, 4};
        int result = findLoop.indexOf(data, 5);
        assertThat(result, is(-1));
    }
}
