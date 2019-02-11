package ru.job4j.loop;

/**
 * Рисуем пирамиду по заданной высоте
 * @author AShulga
 * @version 0.1
 * @since 11.02.2019
 */
public class Paint {
    public String pyramid(int h) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for(int i = 1; i <= h; i++) {
            for (int j = 1; j <= 2 * h - 1; j++) {
                if(j >= h - (i - 1) && (j <= h + (i - 1))) screen.append("^");
                else screen.append(" ");
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
