package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класса Factorial
 * @author AShulga
 * @version 0.1
 * @since 06.02.2019
 */
public class FactorialTest {
    //5!=120
    @Test
    public void whenCalc5Then120() {
        Factorial fact = new Factorial();
        assertThat(fact.calc(5), is(120));
    }
    //0!=1
    @Test
    public void whenCalc0Then1() {
        Factorial fact = new Factorial();
        assertThat(fact.calc(0), is(1));
    }
    //(-5)! не существует
    @Test
    public void whenCalcNegThenNeg() {
        Factorial fact = new Factorial();
        assertThat(fact.calc(-5), is(-1));
    }
}
