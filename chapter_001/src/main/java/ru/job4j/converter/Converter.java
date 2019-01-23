package ru.job4j.converter;

/**
 * Конвертер валюты.
 * @author AShulga
 */
public class Converter {
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return доллары.
     */
    public double rubToDol(double value){
        return value / 66.47;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли.
     */
    public double dolToRub(double value) {
        return value * 66.47;
    }
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return евро.
     */
    public double rubToEuro(double value) {
        return value / 75.52;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public double euroToRub(double value) {
        return value * 75.52;
    }
}
