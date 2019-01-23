package ru.job4j.calculator;

/**
 * Рачет идеального веса
 * @author AShulga
 */
public class Fit {
    /**
     * Идеальный вес для мужчины.
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double manWeight(double height) {
        return 1.15 * (height - 100D);
    }
    /**
     * Идельальный рост женщины.
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double womanWeight(double height) {
        return 1.15 * (height - 110D);
    }
}
