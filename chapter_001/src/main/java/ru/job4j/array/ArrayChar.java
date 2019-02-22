package ru.job4j.array;

/**
 * Проверка префикса слова
 * @author AShulga
 * @version 0.1
 * @since 22.02.2019
 */

public class ArrayChar {
    private char[] array;
    public ArrayChar(String data) {
        this.array = data.toCharArray();
    }
    public boolean startWith(String prefix) {
        char[] pref = prefix.toCharArray();
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if(this.array[i] != pref[i])
                result = false;
        }
        return result;
    }
}
