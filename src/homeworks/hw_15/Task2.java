package homeworks.hw_15;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.05.2025
 */

/*
Task 2
Попросите пользователя ввести две строки — они будут как бы «допустимыми значениями».

Затем попросите ввести третью строку.

Программа должна напечатать true, если третья строка равна хотя бы одной из первых двух,
и false — если она не совпадает ни с одной.

Пример:

Введите первую строку: `кот`
Введите вторую строку: `собака`
Введите третью строку: `кот`
Результат: `true`
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку 1: ");
        String str1 = scanner.nextLine();

        System.out.println("Введите строку 2: ");
        String str2 = scanner.nextLine();

        System.out.println("Введите строку 3: ");
        String str3 = scanner.nextLine();

        boolean isSameOne = str3.equals(str1) || str3.equals(str2);

        System.out.println(isSameOne);


    }
}
