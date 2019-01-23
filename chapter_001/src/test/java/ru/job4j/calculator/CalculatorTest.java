package ru.job4j.calculator;
// импорт классов из библиотек hamcrest и junit для реализации кода теста
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
 * Test
 * Class CalculatorTest
 * @author AShulga
 * version 1.0
 * since 15.01.2019
 */

public class CalculatorTest {
    /**
     * Тест метода Операция сложения
     */
    @Test
    public void whenAddOnePlusOneWhenTwo() {
        //Создаем новый объект класса Калькулятора
        Calculator calc = new Calculator();
        //Выполняем метод Операция сложения
        calc.add(1D, 1D);
        //Записываем результат операции сложения - вызываем метод, возвращающий значение результата сложения
        double result = calc.getResult();
        //Записываем правильное значение операции
        double expected = 2D;
        //Сравниваем полученный результат операции и правильное значение
        assertThat(result, is(expected));
    }
    /**
     * Тест метода операции вычитания
     */
    @Test
    public void whenSubtractThreeMinusOneThenTwo() {
        //Создаем новый объект класса Калькулятора
        Calculator calc = new Calculator();
        //Выполняем метод операции вычитания
        calc.subtract(3D, 1D);
        //Записываем результат операции вычитания - вызываем метод, возвращающий значение результата вычитания
        double result = calc.getResult();
        //Записываем правильное значение операции
        double expected = 2D;
        //Сравниваем полученный результат и правильное значение
        assertThat(result, is(expected));
    }
    /**
     * Тест метода операции умножения
     */
    @Test
    public void whenMultipleTwoMultThreeThenSix() {
        //Создаем новый объект класса Калькулятора
        Calculator calc = new Calculator();
        //Выполняем метод операции умножения
        calc.multiple(2D, 3D);
        //Записываем результат операции умножения - вызываем метод, возвращающий результат умножения
        double result = calc.getResult();
        //Записываем правильное значение операции
        double expected = 6D;
        //Сравниваем полученный результат и правильное значение
        assertThat(result, is(expected));
    }
    /**
     * Тест метода опреации деления
     */
    @Test
    public void whenDivSixDivideTwoThenThree() {
        //Создаем новый объект класса Калькулятора
        Calculator calc = new Calculator();
        //Выполняем метод операции деления
        calc.div(6D, 2D);
        //Записываем результат операции деления - вызываем метод, возвращающий результат деления
        double result = calc.getResult();
        //Записываем правильное значение операции
        double expected = 3D;
        //Сравниваем полученный результат и правильное значение
        assertThat(result, is(expected));
    }
}