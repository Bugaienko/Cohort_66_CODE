package lesson_41;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.06.2025
 */

public class CarSpeedComparator implements Comparator<Car> {


    @Override
    public int compare(Car c1, Car c2) {
        return c1.getMaxSpeed() - c2.getMaxSpeed();
    }

    /*
    int compare(T t1, T t2)
    t1 - t2 ->
    если первый параметр "меньше" второго -> отрицательное
    если первый параметр "больше" второго -> положительное
    если первый параметр "равен" второму -> 0

     */


}
