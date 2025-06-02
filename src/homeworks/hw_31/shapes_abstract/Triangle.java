package homeworks.hw_31.shapes_abstract;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {

        if (sideA < 0 || sideB < 0 || sideC < 0) return;

        // Проверка на false. Что-то сделать, при значении false
        if (!isValidSides(sideA, sideB, sideC)) {
            // Треугольник не правильный. С такими сторонами составить невозможно
            return;
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValidSides(double a, double b, double c) {
        return a < b + c && b < a+ b && c < a + b;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double area() {
        // sqrt (p2 * (p2 - a) * (p2 - b)* (p2 -c))
        double p2 = perimeter() / 2;
        double area = Math.sqrt(p2 * (p2 - sideA) * (p2 - sideB) * (p2 - sideC));
        return area;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
