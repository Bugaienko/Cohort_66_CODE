package homeworks.hw_31.shapes_abstract;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            return;
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // Pi * r * r
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // Длина окружности
        // 2 * PI * r
        return 2 * Math.PI * radius;
    }
}
