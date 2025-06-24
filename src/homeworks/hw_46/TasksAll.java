package homeworks.hw_46;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.06.2025
 */
/*

Task 1.
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка,
которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API

Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Task 3
Дан список Person с полями name, age, city.

Используйте Stream API для фильтрации людей,

которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"

 */

public class TasksAll {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(15, 33, 8, 140, 200, 55, 44, 74, 12, 4);

        System.out.println(filterList(numbers));

        List<String> strings = List.of("test", "Abba", "arrow", "Java", "A");

        System.out.println(filterStringsList(strings));

    }

    public static List<String> filterStringsList(List<String> strings) {
        return  strings.stream()
//                .filter(s -> s.charAt(0) == 'A')
//                .filter(s -> s.substring(0, 1).equals("A"))
//                .filter(s -> s.substring(0, 1).equalsIgnoreCase("A"))
//                .filter(s -> s.toUpperCase().startsWith("A")) // проверяет, начинается ли строка на строку "А"
//                .filter(s -> s.endsWith("va")) // проверяет, заканчивается ли строка на строку "a"

                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
    }


    public static List<Integer> filterList(List<Integer> list) {
        return  list.stream()
                .filter(i -> i > 10 && i < 100)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

    }
}
