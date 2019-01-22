package ru.job4j.converter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест.
 * class ConverterTest
 * @author AShulga
 * @version 1.0
 * @since 22.01.2019
 */
public class ConverterTest {
     @Test
    public void when6647RubToDolThen1() {
         Converter conv = new Converter();
         double result = conv.rubToDol(66.47D);
         assertThat(result, is(1D));
     }
     @Test
    public void when1DolToRubThen6647() {
         Converter conv = new Converter();
         double result = conv.dolToRub(1D);
         assertThat(result, is(66.47D));
     }
     @Test
    public void when7552RubToEuroThen1() {
         Converter conv = new Converter();
         double result = conv.rubToEuro(75.52D);
         assertThat(result, is(1D));
     }
     @Test
    public void when1EuroToRubThen7552() {
         Converter conv = new Converter();
         double result = conv.euroToRub(1D);
         assertThat(result, is(75.52D));
     }
}
