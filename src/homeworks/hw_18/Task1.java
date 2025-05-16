package homeworks.hw_18;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.05.2025
 */

/*
Task 1

Создать массив целых чисел произвольной длины от 5 до 15.
Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5 + random.nextInt(11)];

        /*
        Перебираю элементы массива и:
            1. Заполнить ячейки случайными значениями
            2. Вывести значения элементов массива
         */

        // цикл перебирающий индексы массива
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {

            // 1.
            array[i] = -50 +  random.nextInt(101); // [-50..50]

            // 2.
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));

            // Если элемент (индекс) не является максимальным / последним
//            if (i != array.length - 1 ) {
//                System.out.print(", ");
//            } else {
//                // максимальный индекс
//                System.out.println("]");
//            }
        }

        /*
        Запускаю перебор элементов в цикле:
            1. Найти минимум
            2. Найти максимум
            3. Среднее арифметическое - сумма значений, деленная на их кол-во
         */

        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) max = array[i];

            sum += array[i];
        }



        System.out.println("минимальное значение: " + min);
        System.out.println("максимальное значение: " + max);
        System.out.println("сумма: " + sum);
        System.out.println("average: " + sum / (double) array.length);




    }
}

















