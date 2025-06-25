package homeworks.hw_47;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.06.2025
 */

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране

Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список,
оставив только чётные числа, затем каждое число умножить на 2, и собрать результат в новый список
 */

public class TasksAll {

    public static void main(String[] args) {

//        task1(List.of(1, 35, 17, 18, 204, 504, 302, 1009, 8, 10));
//        task2(List.of("String", "Hello", "Java", "World", "LongString"));
//        task2(List.of());

        List<Integer> integers = task3(List.of(9, 17, 18, 33, 32, 22, 75, 4, 101, 203, 52, 303));

        System.out.println(integers);

    }

    private static List<Integer> task3(List<Integer> integers) {

        return integers.stream()
                .filter(e -> e % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 2)
                .collect(Collectors.toList());
    }

    private static void task2(List<String> strings) {
        Optional<String> optionalString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));

        System.out.println(optionalString);

        if (optionalString.isPresent()) {
            System.out.println("min length string: " + optionalString.get());
        } else {
            System.out.println("Строки в списке не найдены");
        }

        System.out.println(optionalString.orElse("Что-то пошло не так"));

        optionalString.ifPresent(string -> System.out.println("if present: " + string));

        optionalString.ifPresentOrElse(str -> System.out.println("ifPresentElse: " + str),
                () -> System.out.println("IfPresentElse: строк ене найдено"));
    }

    public static void task1(List<Integer> integers) {
        integers.stream()
                .filter(i -> i > 10)
//                .sorted((i1, i2) -> i1 % 10 - i2 % 10)
//                .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
//                .sorted(Comparator.comparing(i -> i % 10))
//                .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder()))
                .sorted(Comparator.comparingInt(i -> i % 10))
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();


    }


}













