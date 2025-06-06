package lesson_34;

import lists.MyArrayList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.06.2025
 */

public class ListTest {

    public static void main(String[] args) {


        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(10);

        System.out.println(list);

        list.addAll(120, 250, 1000, -100, -200, 0);

        System.out.println(list);

        Integer value = list.get(0);
        System.out.println("value: " + value);

        MyArrayList<String> strings = new MyArrayList<>();

        strings.add("Hello");
        strings.addAll("Java", "Test", "Python");

        System.out.println(strings);
    }
}
