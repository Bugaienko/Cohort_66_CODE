package homeworks.hw_42;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.06.2025
 */

/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3));
        List<Integer> integers2 = new ArrayList<>(List.of(3, 4, 4, 5, 6, 7, 5, 8));

        List<Integer> result = intersection(integers, integers2);
        System.out.println(result);

        System.out.println("начальный список: " + integers);

    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
       List<T> result = new ArrayList<>(list1);
       result.retainAll(list2);
       return result;
    }
}
