package homeworks.hw_29.components;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

// Создайте базовый класс Component с полями brand (бренд) и model (модель).

public class Component {
    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return "Component: " + brand + " - " + model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
