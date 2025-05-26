package lesson_28.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.05.2025
 */

// Train is-a (это / является) Bus - НЕ ВЕРНО. Наследоваться не имею права
// Train is Vehicle -> Верно
public class Train extends Vehicle{

    private int capacity;
    private int countPassengers;

    private int countWagons;
    private final int wagonCapacity;


    public Train(String model, int year, int countWagons, int wagonCapacity) {
        super(model, year);
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        // Определить вместимость = посчитать capacity
        calculateCapacity();
    }

    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        // TODO
        // Проконтролировать, что кол-во пассажиров не превышает новую вместимость

        this.countWagons = countWagons;
        calculateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }
}
