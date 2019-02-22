package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирование проверки на равенство всех элементов массива
 * @author AShulga
 * @version 0.1
 * @since 21.02.2019
 */

public class CheckTest {
    @Test
    public void whenArrayMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] array = {true, true, true, true};
        boolean result = check.mono(array);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] array = {false, false, false, false};
        boolean result = check.mono(array);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayNotMonoThenFalse() {
        Check check = new Check();
        boolean[] array = {false, true, false, false};
        boolean result = check.mono(array);
        assertThat(result, is(false));
    }
}
