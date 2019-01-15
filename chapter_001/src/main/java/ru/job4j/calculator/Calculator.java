package ru.job4j.calculator;
/**
 *Калькулятор
 *@author AShulga (annavalentinshul@mail.ru)
 */
public class Calculator {
	/**Поле - результат операции
	 */
 	 private double result;
	/**Операция сложения
	 * @param first первое слагаемое
	 * @param second второе слагаемое
	 */
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**Операция вычитания
	 * @param first уменьшаемое
	 * @param second вычитаемое
	 */
    public void subtract(double first, double second) {
		this.result = first - second;
	}
	/**Операция умножения
	 * @param first первый множитель
	 * @param second второй множитель
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**Операция деления
	 * @param first делимое
	 * @param second делитель
	 */
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**Возвращаем значение поля result
	 */
	public double getResult() {
		return this.result;
	}
}


