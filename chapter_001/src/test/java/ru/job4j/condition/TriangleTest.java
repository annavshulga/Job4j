package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * Тест методов класса Triangle
 * @author AShulga
 * @version 0.1
 * @since 01.02.2019
 */
public class TriangleTest {
    //Проверка вычисления площади треугольника - метода area
    @Test
    public void whenAreaSetThreePointThenTriangleArea() {
        Point a = new Point(3, 0);
        Point b = new Point(0, 4);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area(), closeTo(6, 0.1));
    }
}
