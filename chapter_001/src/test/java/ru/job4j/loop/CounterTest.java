package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест Counter
 * @author AShlga
 * @version 0.1
 * @since 05.02.2019
 */
public class CounterTest {
    @Test
    public void whenAddEvenNumberFrom1To10Then30() {
        Counter counter = new Counter();
        assertThat(counter.add(1, 10), is(30));
    }
}
