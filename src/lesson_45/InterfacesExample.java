package lesson_45;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.06.2025
 */

public class InterfacesExample {

    public static void main(String[] args) {

        // Stream API.
        // Функциональные интерфейсы Function, Predicate, Consumer

        // Consumer<T> - выполняет операцию над объектом типа T. Не возвращает никакого результата
        // void accept(T t)

        Consumer<String> example = new Consumer<String>() {

            @Override
            public void accept(String string) {
                System.out.println(string.toUpperCase() + "!!!");
            }
        };

        Consumer<String> printConsumer = str -> System.out.println(str.toUpperCase() + "!!!");
        printConsumer.accept("Hello World");


        // Predicate<T> - Проверка объекта на соответствие условию (тестирование)
        // boolean test(T t) - абстрактный метод

        Predicate<String> examplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        Predicate<String> isShort = str -> str.length() < 3;
        boolean result = isShort.test("Java");
        System.out.println("isShort.test(\"Java\"): " + result);
        System.out.println("isShort.test(\"JS\"): " + isShort.test("JS"));

        System.out.println("==================\n");
        List<Integer> list = new ArrayList<>(
                List.of(-1, 3, 4, 0, 34, -45, 11, 45, 10, -24)
        );

        // Список всех отрицательных элементов
        List<Integer> res = filterListByPredicate(list, i -> i < 0);
        System.out.println("filterListByPredicate(list, i -> i < 0): " + res);

        // Список всех четных чисел, которые больше 5
        res = filterListByPredicate(list, i -> i > 5 && i % 2 ==0);
        System.out.println("filterListByPredicate(list, i -> i > 5 && i % 2 ==0): " + res);

        // Список всех нечетных чисел
        res = filterListByPredicate(list, number -> number % 2 != 0 );
        System.out.println("filterListByPredicate(list, number -> number % 2 != 0 ): " + res);

        System.out.println("\n================ Function ===========");

        // Function<T, R> - выполняет операцию над объектом типа T, возвращает результат типа R
        // R apply (T t)

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        Function<String, Integer> function = string ->  string.length();

        int len = function.apply("Hello, World!");
        System.out.println("function.apply(\"Hello, World!\"): " + len);

//        Function<String, String> toUpper = str -> str.toUpperCase();
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println(toUpper.apply("Hello, World!"));


    }

    public static List<Integer> filterListByPredicate(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : list) {
           if (predicate.test(value)) {
               // predicate вернул true - значение прошло проверку = подходит
               result.add(value);
           }
        }

        return result;
    }


}
