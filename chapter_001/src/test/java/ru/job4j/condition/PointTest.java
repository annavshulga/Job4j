package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Тест
 * Class PointTest
 * @author AShulga
 * @version 1.0
 * @since 25.01.2019
 */
public class PointTest {
    @Test
    public void when3And4Then5() {
        Point a = new Point(4, 5);
        Point b = new Point(1, 1);
        double result = a.distance(b);
        assertThat(result, closeTo(5, 0.00000000001));
    }
}
