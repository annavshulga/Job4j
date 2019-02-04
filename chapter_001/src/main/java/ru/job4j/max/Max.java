package ru.job4j.max;

/**
 * Нахождение максимума
 * @author AShulga
 * version 0.1
 * since 31.01.2019
 */
public class Max {
/**
 * Maximum of two numbers
 * @param first Первое число.
 * @param second Второе число.
 * @return максимальное из двух чисел
 */
    public int maximumTwo(int first, int second) {
        return first > second ? first : second;
    }
    /**
     * Maximum of three numbers
     * @param x Первео число
     * @param y Второе число
     * @param z Третье число
     * @return Максимальное из трёх чисел
     */
    public int maximumThree(int x, int y, int z) {
        return this.maximumTwo(this.maximumTwo(x, y), z);
    }
}
