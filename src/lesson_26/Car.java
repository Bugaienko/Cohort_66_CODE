package lesson_26;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.05.2025
 */

public class Car {

    static int totalCars;

    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;

        totalCars = totalCars + 1;
    }

    public String toString() {
        return String.format("Auto: model %s, power %d. Всего создано машин: %d", model, power, totalCars);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
