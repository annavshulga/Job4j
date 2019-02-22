package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест пузырьковой сортировки целых массива целых чисел
 * @author Ashulga
 * @version 0.1
 * @since 22.02.2019
 */
public class BubbleSortTest {
    @Test
    public void when146384Then134468() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 4, 6, 3, 8, 4};
        int[] result = bubbleSort.sort(array);
        int[] expected = {1, 3, 4, 4, 6, 8};
        assertThat(result, is(expected));
    }
    @Test
    public void when6777812399935Then1233567778999() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {6, 7, 7, 7, 8, 1, 2, 3, 9, 9, 9, 3, 5};
        int[] result = bubbleSort.sort(array);
        int[] expected = {1, 2, 3, 3, 5, 6, 7, 7, 7, 8, 9, 9, 9};
        assertThat(result, is(expected));
    }
}
