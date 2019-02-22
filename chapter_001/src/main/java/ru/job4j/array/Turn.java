package ru.job4j.array;

/**
 * Перестановка элементов массива
 * @author AShulga
 * @version 0.1
 * @since 21.02.2019
 */

public class Turn {
    /**
     * Переворот массива задом напёред
     * @param array Исходный массив
     * @return Перевенутый задом наперёд массив
     */
    public int[] back(int[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        return array;
    }
}
