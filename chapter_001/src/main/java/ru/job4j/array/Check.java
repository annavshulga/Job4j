package ru.job4j.array;

/**
 * Проверка на равенство всех элементов массива
 * @author AShulga
 * @version 0.1
 * @since 21.02.2019
 */

public class Check {
    /**
     * Проверка на равенство всех элементов массива типа boolean
     * @param array Исходный массив элементов типа boolean
     * @return true - если все элементы равны; false - если есть неравные элементы
     */
    public boolean mono(boolean[] array) {
        boolean result = true;
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
