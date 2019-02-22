package ru.job4j.array;

/**
 * Получение массива квадратов из последовательности натуральных чисе
 * @author AShulga
 * @version 0.1
 * @since 21.02.2019
 */
public class Square {
    /**
     * Массив из возведенных в квадрат натуральных чисел заданной длины
     * @param bound Длина массива - максимальное натуральное число
     * @return массив возведенных в квадрат натуральных чисел
     */
    public int[] calculate(int bound) {
        int[] array = new int[bound];
        for(int i = 0; i < array.length; i++)
            array[i] = (int) Math.pow((i + 1), 2);
        return array;
    }
}
