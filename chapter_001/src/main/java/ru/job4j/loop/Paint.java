package ru.job4j.loop;

/**
 * Рисуем пирамиду по заданной высоте
 * @author AShulga
 * @version 0.1
 * @since 11.02.2019
 */
public class Paint {
    /**
     * Рисуем пирамиду
     * @param h Высота пирамиды
     * @return Строка с символами пирамиды
     */
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

    /**
     * Рисуем правый теругольник в квадратике
     * @param h Высота треугольника (квадратика)
     * @return Строка с символами треугольника
     */
    public String rightTrgl(int h) {
        StringBuilder screen = new StringBuilder();
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= h; j++) {
                if(j >= h - i + 1) screen.append("^");
                else screen.append(" ");
            }
            screen.append(System.getProperty("line.separator"));
        }
        return screen.toString();
    }

    /**
     * Рисуем левый треугольник в квадратике
     * @param h Высота треугольника (квадратика)
     * @return Строка с символами треугольника
     */
    public String leftTrgl(int h) {
        StringBuilder screen = new StringBuilder();
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= h; j++) {
                if(j <= i) screen.append("^");
                else screen.append(" ");
            }
            screen.append(System.getProperty("line.separator"));
        }
        return screen.toString();
    }
}
