package lesson_14;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 29.04.2025
 */

public class ScannerLocale {
    public static void main(String[] args) {

        // Locale - локаль

        System.out.println(Locale.getDefault());

        String data = "3.14 Java 42,7";
        Scanner sc = new Scanner(data);

        // Установить локаль с точкой как разделитель дробей (например, США)
        sc.useLocale(Locale.US);
        // Locale.US - дробная часть отделяется точкой (.)
        // Locale.GERMANY - дробная часть отделяется точкой (,)

        System.out.println(sc.nextDouble());
        System.out.println(sc.next()); // читает только ОДИН токен, возвращает строку (String)

        sc.useLocale(Locale.GERMANY);
        System.out.println(sc.nextDouble());


    }
}
