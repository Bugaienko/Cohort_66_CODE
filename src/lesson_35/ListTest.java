package lesson_35;

import lists.MyArrayList;
import lists.MyList;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.06.2025
 */

public class ListTest {

    public static void main(String[] args) {

        MyList<Integer> integers = new MyArrayList<>();

        System.out.println(integers);

        integers.add(100);

        integers.addAll(120, 250, 1000, -100, -200, 0, -400, 500, 999);

        integers.add(555);

        System.out.println(integers);

        System.out.println("size: " + integers.size());

        int index = integers.indexOf(1000);
        System.out.println("indexOf(1000): " + index);

        index = integers.indexOf(50);
        System.out.println("indexOf(50): " + index);

        System.out.println("contains(50): " + integers.contains(50));

        index = integers.lastIndexOf(null);
        System.out.println("lastIndexOf(null): " + index);

        integers.add(null);
        System.out.println(integers);

        System.out.println("equals(null): " + "Str".equals(null));
        String s = null;
        // null-безопасное сравнение
        System.out.println("Objects: " + Objects.equals(null, "Str"));
//        System.out.println(s.equals("Str"));


        // NPE из-за добавления null в качестве значения
        index = integers.lastIndexOf(100000);
        System.out.println("lastIndexOf(100000): " + index);

        System.out.println("======================\n");

        System.out.println("get(100): " + integers.get(100));
        System.out.println("get(5): " + integers.get(5));

        System.out.println(integers);

        // Хочу удалить элемент зо значение 0
        System.out.println("remove(0): " + integers.remove(Integer.valueOf(0)));
        System.out.println(integers);

        // Удалить по индексу
        System.out.println("remove(0): " + integers.remove(0));
        System.out.println(integers);

        System.out.println("===================\n");

        Integer[] array = integers.toArray();
        System.out.println("toArray: " + Arrays.toString(array));

        MyList<String> strings = new MyArrayList<>();
        System.out.println(strings);

        String[] stringArray = strings.toArray();

        System.out.println(Arrays.toString(stringArray));


    }
}
