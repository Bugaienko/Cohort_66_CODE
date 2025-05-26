package homeworks.hw_28.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.05.2025
 */

public class Circle extends Shape{
    private double radius;
    public static final double PI = 3.1415926;

    public Circle(String name, double radius) {
        super(name);
        setColor("yellow");
        this.radius = radius;
    }

    public double calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
