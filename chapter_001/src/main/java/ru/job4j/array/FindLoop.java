package ru.job4j.array;

/**
 * Поиск элемента в массиве
 * @author AShulga
 * @version 0.1
 * @since 21.02.2019
 */
public class FindLoop {
    /**
     * Поиск значения в массиве и вывод его индекса, если значение найдено
     * @param data массив целых чисел
     * @param el целое число для поиска
     * @return индекс элемента, равного числу поиска, или -1 в случае отсутствия
     */
    public int indexOf(int[] data, int el) {
        int result = -1;
        for(int i = 0; i < data.length; i++)
            if(data[i] == el) {
                result = i;
                break;
            }
        return result;
    }
}
