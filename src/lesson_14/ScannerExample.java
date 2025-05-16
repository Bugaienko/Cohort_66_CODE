package lesson_14;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 29.04.2025
 */

public class ScannerExample {

    public static void main(String[] args) {

        // Обращаемся к стандартному потоку вывода
        System.out.println("Печатаем данные в консоль");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: "); // Печатаем приглашение
        // Читаем строку из консоли
        String name = scanner.nextLine(); // Результат работы метода - строка (String) со всеми символами, которые ввел пользователь

        // Прочитать целое число
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt(); // Прочитать одно число типа int
        scanner.nextLine(); // Скушать остаток строки, если она есть

        // Прочитать число с запятой
        System.out.println("Введите ваш рост в метрах: ");
        double height = scanner.nextDouble(); // Прочитать из консоли число с запятой (типа double)
        scanner.nextLine();


        System.out.println("Привет, " + name + "!"); // Приветствуем пользователя
        System.out.println("age: " + age);
        System.out.println("через год тебе будет: " + (age + 1));
        System.out.println("height: " + height);


    }
}
