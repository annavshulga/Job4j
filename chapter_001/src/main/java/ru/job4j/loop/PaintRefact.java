package ru.job4j.loop;
import java.util.function.BiPredicate;

/**
 * Рефакторинг кода на примере методов, рисующих пирамиду и два треугольника
 * @author AShugla
 * @version 1.0
 * @since 13.02.2019
 */
public class PaintRefact {
      private String loopBy(int h, int w, BiPredicate <Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= w; j++) {
                if(predict.test(i, j)) screen.append("^");
                else screen.append(" ");
            }
            screen.append(System.getProperty("line.separator"));
        }
        return screen.toString();
    }
    /**
    * Пирамидка
    * @param h Высота пирамиды
    * @return Строка из символов - изображения пирамидки
    */
    public String pyramid(int h) {
        return this.loopBy(h, 2*h - 1, (i, j) -> j <= h + i - 1 && j >= h - i +1);
    }

    /**
     * Правый треугольник
     * @param h Высота треугольника
     * @return Строка из символов - изображение треугольника
     */
    public String rightTrgl(int h) {
        return this.loopBy(h, h, (i, j) -> j >= h - i + 1);
    }

    /**
     * Левый треугольник
     * @param h Высота треугольника
     * @return Строка из символов - изображение треугольника
     */
    public String leftTrgl(int h) {
        return this.loopBy(h, h, (i, j) -> j <= i);
    }
}
