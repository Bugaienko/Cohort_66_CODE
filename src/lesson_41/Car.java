package lesson_41;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.06.2025
 */

// Comparable - это интерфейс, который должен реализовать класс, для того,
// чтобы можно было сравнивать объект этого класса с другим объектом этого же класса

public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // метод сравнивает текущий объект (this) с другим объектом того же класса (Car)
    @Override
    public int compareTo(Car car) {
        return this.year - car.year;
    }

    /*
    this vs car - кто больше
    this - car
    this < car -> вернет отрицательное
    this > car -> вернет положительное
    this = car -> вернет 0

     */

}
