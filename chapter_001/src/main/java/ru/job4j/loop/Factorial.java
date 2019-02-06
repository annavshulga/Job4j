package ru.job4j.loop;

/**
 * Класс Factorial
 * @author AShulga
 * @version 0.1
 * @since 06.02.2019
 */
public class Factorial {
    /**
     * Метод calc вычисляет факториал числа
     * @param n Целое положительное число.
     * @return Вычисленный факториал
     */
    public int calc(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        if(n < 0) f = -1;
        return f;
    }
}
