package lesson_42.comparators;

import lesson_41.Car;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.06.2025
 */

public class ComparatorPart2 {

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
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, 250);

        printCars(cars);

        /*
        Интерфейс Comparator содержит различные статические и дефолтные, облегчающие создание комплексных компараторов

        comparing - позволяет сортировать объекты по ключу
        Функция-ключ - это способ вытащить из объекта то значение, по которому мы хотим сравнивать два объекта.
        Функция-ключ - это геттер или лямбда, которая вытащит значение для сравнения.

        comparingInt, comparingLong, comparingDouble - специализированные версии для сравнения примитивов,
        чтобы избежать лишней авто-упаковки

        .reversed() - меняет компаратор на противоположный порядок

        Второй параметр метода comparing:
        Comparator.naturalOrder() - определяет естественный порядок сортировки
        Comparator.reverseOrder() - определяет обратный порядок сортировки
        Comparator.nullFirst() - значение null будет признано как наименьшее (т.е. они будут располагаться слева)
        Comparator.nullLast() - значение null будет признано как наибольшие

        .thenComparing() - Если comparing выдал одинаковые ключи, то будет использован дополнительный уровень сортировки
        аналогичен по синтаксису методу comparing



        Ссылка на метод - сокращенная запись лямбды
        car -> car.getModel() => Car::getModel

         */

        // Отсортировать машины по модели в естественном порядке
//        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
//        Arrays.sort(cars, byModel);

        printCars(cars);

        // Ссылка на метод - это сокращенная запись лямбды
//        byModel = Comparator.comparing(Car::getModel);
//        Arrays.sort(cars, byModel);

        Comparator<Car> byYear = Comparator.comparingInt(Car::getYear);
        Arrays.sort(cars, byYear);

        byYear = Comparator.comparing(Car::getYear, Comparator.reverseOrder());
        Arrays.sort(cars, byYear);

        Comparator<Car> reversed = Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)).reversed();
        Arrays.sort(cars, reversed);

        printCars(cars);

        // Отсортировать по модели/ Если модели равны, то отсортировать по убыванию года выпуска
        Arrays.sort(cars, Comparator
                .comparing(Car::getModel)
                .thenComparing(Car::getYear, Comparator.reverseOrder())
        );

        printCars(cars);

        // Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке.

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));
        printCars(cars);

        // Отсортировать машины по году в обратном, если год равен - отсортировать по модели в прямом
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(car -> car.getModel()));
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















