package ru.job4j.array;

/**
 * Генерация двухмерного массива - таблицы умножения
 * @author AShulga
 * @version 0.1
 * @since 22.02.2019
 */

public class Matrix {
    public int[][] multiple (int size) {
        int[][] array = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}
