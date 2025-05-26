package homeworks.hw_28.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.05.2025
 */

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        setColor("red");
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        double area =  width * height;
        System.out.println("Area: " + area);
        return area;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
