package homeworks.hw_15;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.05.2025
 */

/*
Task1
Попросите пользователя ввести строку (предположительно "пароль") дважды.

Сравните введенные строки и напечатайте true, если строки совпадают, и false в противном случае.

Пример:

Введите пароль: `java123`
Повторите пароль: `java123`
Результат: `true`

 */

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.println("Введите пароль еще раз: ");
        String passwordAgain = scanner.nextLine();

        boolean isSame = password.equals(passwordAgain);

        System.out.println(isSame);

    }
}



















