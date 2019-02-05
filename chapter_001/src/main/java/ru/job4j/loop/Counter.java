package ru.job4j.loop;

/**
 * Считает сумму четных чисел в указанном диапазоне
 * @author AShulga
 * @version 0.1
 * @since 05.02.2019
 */
public class Counter {
    public int add(int start, int finish) {
    int sum = 0;
    for(int i = start; i <= finish; i++) {
        if(i % 2 == 0) {
            sum += i;
        }
    }
    return sum;
    }
}
