package consultations;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.05.2025
 */

/*
Task 3 (Повышенной сложности, опционально)

Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).

Если введенное значение не является четырехзначным числом,
должно выводиться сообщение об ошибке, и программа завершает работу.

Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи четырехзначное число: ");
        String input = scanner.nextLine();

        // 1234 -> "1234"
//        hyyyy
//      123

        System.out.println(input);

        if (input.length() != 4) {
            System.out.println("Ошибка!");
            System.out.println("Программа завершает работу");
        } else {
            // Пользователь ввел строку, состоящую из 4-х символов
            // Мы можем проверить - являются ли символы в строке цифрами

            char ch0 = input.charAt(0);
            char ch1 = input.charAt(1);
            char ch2 = input.charAt(2);
            char ch3 = input.charAt(3);

//            System.out.println((int) ch0);
//            System.out.println((int) ch1);
//
//            if (ch0 >= 48 && ch0 <= 57) {
//                // подходит
//            } else {
//                // Завершение работы
//            }

            /*
             0 .. 48
            1 -> 49
            2 -> 50 -> 50 - 48 -> 1

            2011 -> 2 + 0 vs 1 + 1
             */

            System.out.println(ch0 - 48);
            System.out.println(ch1 - 48);
            System.out.println(ch2 - 48);
            System.out.println(ch3 - 48);

            // a - 96 ?= b - 96

            if (ch0  + ch1  == ch2  + ch3 ) {
                System.out.println("Число счастливое!");
            } else {
                System.out.println("Не счастливое!");
            }




        }

    }
}














