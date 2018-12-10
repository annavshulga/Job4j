package ru.job4j.calculate;
//импорт классов из библиотек hamcrest и junit для реализации кода теста
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/*
 *Test
 *Class CalculateTest
 *@author Shulga (annavalentinshul@mail.ru)
 *@version $Id$
 *@since 0.1
 */
public class CalculateTest {
	/**
	 *Test метода echo
	 */
@Test	 
	public void whenTakeNameThenEchoPlusName() {
		//входне значение: параметру name задаем значение Shulga		
		String input = "Shulga";
		//ожидаемое значение
		String expect = "Echo: Shulga";
		//создаем новый объект
		Calculate calc = new Calculate();
		//выполняем метод echo с параметром input, записываем в переменную rusult
		String result = calc.echo(input);
		//сравниваем значения result и expect
		assertThat(result, is(expect));
	}
}	
		
		
	