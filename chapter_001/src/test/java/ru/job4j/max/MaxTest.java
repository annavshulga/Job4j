package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест нахождения максимального числа
 * @author AShulga
 * @version 0.1
 * @since 31.01.2019
 */
public class MaxTest {
    @Test
    public void when3And4Then4() {
        Max a = new Max();
        assertThat(a.maximumTwo(3,4), is(4));
    }
}
