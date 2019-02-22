package ru.job4j.array;

/**
 * Пузырьковая сортировка массива целых чисел
 * @author AShulga
 * @version 0.1
 * @since 22.02.2019
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
