package ru.job4j.calculator;
import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Class FitTest.
 * @author AShulga
 * version 1.0
 * since 22.01.2019
 */

public class FitTest {
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double result = fit.manWeight(180D);
        assertThat(result, closeTo(92.0, 0.1));
    }
    @Test
    public void womanWeight() {
       Fit fit = new Fit();
       double result = fit.womanWeight(170D);
       assertThat(result, closeTo(69.0, 0.1));
    }
}
