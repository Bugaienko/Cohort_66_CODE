package lesson_41;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.06.2025
 */

public class ComparatorApp {

    public static void main(String[] args) {


        // Сравнение объектов для определения какой объект меньше / больше
        // сравнение на равенство ==, и также метод equals()

        //

        int[] ints = new int[]{9, 5, 3, 4, 2, 0};
        // Отсортировать объекты в порядке возрастания

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, Integer.MIN_VALUE);
        cars[5] = new Car("Ferrari", 2021, 250);

        printCars(cars);

        Arrays.sort(cars);

        printCars(cars);

        // Интерфейсы
        // Comparable (сравнимый) - естественный порядок сортировки - встроенный механизм сравнения
        // Comparator - внешний механизм сравнения. Класс, реализующий интерфейс Comparator - отдельный объект
        // с помощью Comparator можно создать множество различных критериев сортировки для одного и того же типа объектов

        // Объект, который умеет сравнивать две машины
        CarSpeedComparator speedComparator = new CarSpeedComparator();

        System.out.println("Speed Comparator: ");
        Arrays.sort(cars, speedComparator);
        printCars(cars);

        System.out.println("Model Comparator: ");
        Arrays.sort(cars, new CarModelComparator());

        printCars(cars);

        // параметр метода типа интерфейс (Comparator).
        // Типизация будет ждать объект класса, реализовавшего интерфейс Comparator типа
//        Arrays.sort(cars, new WrongComparator());

        String[] strings = new String[]{"apple", "Banana", "Java", "car"};

        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        // Анонимные классы - это классы, которые не имеют имени.
        // Класс, который используется для создания объекта на лету,
        // без явного объявления нового класса

        // часто используются, когда необходим одноразовый объект и
        // нет необходимости создавать отдельный именованный класс

        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car c1, Car c2) {
                return c1.getModel().compareTo(c2.getModel());
            }
        });

        printCars(cars);
        System.out.println("Reverse Comparator: ");

        // Отсортировать машины по году выпуска в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            // 4, 1, 10
            // прямой -> 1, 4, 10
            // обратный -> 10, 4, 1
            // a < b -> a - b -> отрицательное. a < b -> a признать больше чем b
            // -1 * (a - b) -> -a + b -> b - a
            // a - b -> инверсия b - a

            @Override
            public int compare(Car c1, Car c2) {
                return c2.getYear() - c1.getYear();
            }
        });

        printCars(cars);

        System.out.println("Mix comparator");
        // Сравнить машины по году выпуска в порядке возрастания,
        // если год выпуска совпадет, тогда такие машины сравнить по модели в порядке убывания

        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();

                if (yearCompare != 0) {
                    // годы выпуска не равны
                    return yearCompare;
                }

                // годы машин равны (yearCompare = 0)
                // другая логика сравнения для таких машин
                // обратный порядок по модели
                return c2.getModel().compareTo(c1.getModel());
            }
        });

        printCars(cars);

        System.out.println("========= Lambda expression ============");

        /*
        Функциональный интерфейс - особый тип интерфейса, который имеет РОВНО ОДИН абстрактный метод.
        (абстрактный - метод, который нужно реализовывать)

        Интерфейс Comparator - функциональный интерфейс

        Лямбда-выражения - этл способ краткой записи реализации ФУНКЦИОНАЛЬНОГО интерфейса.
        Позволяют предоставить реализацию единственного метода в компактной форме.

        Синтаксис
        (параметры метода) -> {реализация метода}


         */

        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car c1, Car c2) {
                return c2.getYear() - c1.getYear();
            }
        });

//        () -> {}
//        (c1, c2) -> вычисляемое значение

        // По году в обратном порядке и использованием лямбда-выражений

        Arrays.sort(cars, (c1, c2) -> {
            return c2.getYear() - c1.getYear();
        });

        printCars(cars);

        Arrays.sort(cars, (c1, c2) -> c2.getYear() - c1.getYear());

        printCars(cars);

        //  Отсортировать машины по максимальной скорости в порядке убывания.
        // Если скорость совпадает - отсортировать по году - естественный порядок - от младшей к старшей

        Comparator<Car> carComparator = (c1, c2) -> {
            System.out.println(c1.getMaxSpeed() + " | " +  c2.getMaxSpeed());
//            int speedCompare = c1.getMaxSpeed() - c2.getMaxSpeed();
            int speedCompare = Integer.compare(c1.getMaxSpeed(), c2.getMaxSpeed());
            System.out.println("c1 - c2: " + speedCompare);


            if (speedCompare == 0) {
                return Integer.compare(c1.getYear(), c2.getYear());
//                return c1.getYear() - c2.getYear();
            }

            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        printCars(cars);














    }

    private static void printCars(Car[] cars) {
        System.out.println("========================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("========================\n");
    }
}















