package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты на получение массива квадратов из последовательности натуральных чисел
 * @author AShulga
 * @version 0.1
 * @since 22.02.2019
 */

public class SquareTest {
    @Test
    public void whenBound5Then1491625() {
        Square square = new Square();
        int[] result = square.calculate(5);
        int[] expected = {1, 4, 9, 16, 25};
        assertThat(result, is(expected));
    }
    @Test
    public void whenBound6Then149162536() {
        Square square = new Square();
        int[] result = square.calculate(6);
        int[] expected = {1, 4, 9, 16, 25, 36};
        assertThat(result, is(expected));
    }
}
