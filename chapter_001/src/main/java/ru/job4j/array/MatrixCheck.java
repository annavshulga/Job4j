package ru.job4j.array;

/**
 * Проверка равенства элементов по обеим диагоналям двухмерного массива
 * @author AShulga
 * @version 0.1
 * @since 22.02.2019
 */

public class MatrixCheck {
    public boolean mono(boolean[][] array) {
        boolean result = true;
        int length = array.length;
        for(int i = 0; i < length - 1; i++) {
            if (array[i][i] != array[i + 1][i + 1] || array[i][length - 1 - i] != array[i + 1][length - 2 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
