package lesson_35;

import homeworks.hw_32.task2_1.PaymentSystem;
import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.06.2025
 */

public class IteratorExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String current = iterator.next();
//            System.out.println(current);
//        }

        // Цикл for each

        /*
        for (Тип переменная : коллекция) {
            // тело цикла
        }
         */

        System.out.println("===================\n");

        for (String current : list) {
            System.out.println(current);
        }

        System.out.println("===================\n");

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            System.out.println(current);
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int x : array) {
            System.out.print(x * 2 + ", ");
        }
    }
}
