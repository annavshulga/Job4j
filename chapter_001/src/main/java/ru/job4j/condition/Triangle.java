package ru.job4j.condition;

/**
 * Площадь треугольника по точкам
 * @author AShlga
 * @version 0.1
 * @since 01.02.2019
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle (Point x, Point y, Point z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }
    /**
     * Расчет полупериметра треугольника
     * @param x Длина первой стороны треугольника.
     * @param y Длина второй стороны треугольника.
     * @param z Длина третьей стороны треугольника.
     * @return Полупериметр треугольника
     */
    public double halfPerimeter(double x, double y, double z) {
        return (x + y + z) / 2;
    }
    /**
     * Признак существования треугольника
     * @param x Длина первой стороны треугольника.
     * @param y Длина второй стороны треугольника.
     * @param z Длина третьей стороны треугольника
     * @return Существует True или нет False.
     */
    public boolean exist(double x, double y, double z) {
        return ((x + y) > z) && ((y + z) > x) && ((x + z)) > y;
    }
    /**
     * Расчет площади треугольника по полученным точкам     *
     * @return Площадь треугольника, если он существует.
     */
    public double area () {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        double p = this.halfPerimeter(ab,bc,ac);
        double result = -1;
        if(this.exist(ab,bc,ac))
            result = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        return result;
    }
}
