package ru.job4j.condition;

/**
 * Расстояние между точками по зааднным координатам
 * @author AShulga (annavalentinshul@mail.ru)
 * @version 1.0;
 * @since 24.01.2019
 */

public class Point {
    private int x;
    private int y;
    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
    public double distance(Point z) {
        return Math.sqrt(Math.pow((z.x - this.x), 2) + Math.pow((z.y - this.y), 2));
    }
    public static void main(String[] args) {
        Point c = new Point(3, 5);
        Point d = new Point(1, 7);
        double result = c.distance(d);
        System.out.println("Расстояние между точками А и В: " + result);
    }
}
