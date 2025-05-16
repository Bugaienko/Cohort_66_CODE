package lesson_18;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.05.2025
 */

public class ForExample {
    public static void main(String[] args) {

        /*
        for (<Блок инициализации> ; <Блок проверок / условие выхода> ; <Блок изменений>) {
            // Тело цикла
        }
         */

        // Вывести все числа от 0 до 10
        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();
        System.out.println("j после цикла: " + j);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
//            System.out.println("Hello!");
        }

        System.out.println();
        // System.out.println("Я не вижу локальную переменную i: " + i);

        // Для цикла for ни один из блоков не является обязательным
        // Запустится бесконечный цикл
        /*
        for ( ; ; ) {
            System.out.println("Hello, World!");
        }
         */

        int k = 5;
        // Здесь какие-то другие строчки кода
        for (k = 0; k >= 0; k = k + 100_000) {
            System.out.print(k + ", ");
        }

        System.out.println();
        System.out.println("Состояние переменной k: " + k);

        System.out.println("==================\n");
        // В блоке инициализации может быть переменная любого типа
        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        System.out.println("========================\n");

        // Мы можем инициализировать и изменять любое кол-во переменных в блоках инициализации и / или изменений
        int m = 14;
        for (int a = 0, f = 1; m >= 0 && f < 10; m--, a = ++a + m, f++) {
            System.out.println(m + " : " + a + " : " + f);
        }

        System.out.println("==================\n");

        // Создать массив целых чисел случайной длины от 5 до 15.
        // Заполнить массив случайными значениями от -50 до + 60 включительно

        Random random = new Random();

//        int length = random.nextInt(11) + 5;

        int[] digits = new int[random.nextInt(11) + 5];

        System.out.print("[");
        for (int i = 0; i < digits.length; i++) {
            digits[i] = random.nextInt(111) - 50; // x - 50 = 60; x = 110
            System.out.print(digits[i] + ", ");
        }

        System.out.println("]");

    }
}
