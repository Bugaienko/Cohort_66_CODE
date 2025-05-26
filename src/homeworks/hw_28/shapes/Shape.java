package homeworks.hw_28.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.05.2025
 */

public class Shape {
    protected String name;
    private String color;

    public Shape(String name) {
        this.name = name;
        this.color = "black";
    }

    public void displayInfo() {
        System.out.println("Shape: " + name + ", color: " + color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
