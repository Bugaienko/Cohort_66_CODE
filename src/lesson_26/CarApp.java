package lesson_26;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.05.2025
 */

public class CarApp {
    public static void main(String[] args) {


        System.out.println("static field: " + Car.totalCars);


        Car bmw = new Car("BMW", 200);

        System.out.println(bmw.toString());

        System.out.println("static totalCars = " + Car.totalCars);

        Car vw = new Car("VW", 300);

        System.out.println(vw.toString());
        System.out.println("static totalCars = " + Car.totalCars);

        System.out.println(bmw.toString());

        // Я могу обратиться к статике от имени конкретного объекта.
        // НО это плохая практика. Так делать не рекомендуется!
//        System.out.println("vw.totalCars = " + vw.totalCars);

        // Нам следует обращаться к статике от имени класса

        // Модификатор статик применим только к полям или методам класса
//        static int x;

        System.out.println("==============\n");

        int sum = MathUtil.sumIntegers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sum = " + sum);

        System.out.println(Arrays.toString(new int[]{1, 3, 5}));


    }
}
