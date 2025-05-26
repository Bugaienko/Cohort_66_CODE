package lesson_28.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.05.2025
 */

public class Vehicle {

    protected String model; // все наследники будут иметь прямой доступ к полю protected
    private int year; // наследники прямого доступа не имеют. Только через геттеры/сеттеры, если они есть

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
//
//    public Vehicle() {
//
//    }

    public void start() {
        System.out.println(model + " is started.");
    }

    public void stop() {
        System.out.println(model + " is stopped.");
    }

    public String toString() {
        return model + ", year of manufacture: " + year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
