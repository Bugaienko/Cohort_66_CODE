package homeworks.hw_18;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.05.2025
 */

/*
Task 3 * (Опционально)
Дан массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:
{ "One", "Two", "Twenty" } ->
 */

public class Task3 {

    public static void main(String[] args) {

        String[] strings = { "One", "Two", "Twenty" };

        String maxLength = strings[0];

        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];

            if (current.length() > maxLength.length()) {
                maxLength = current;
            }
        }

        System.out.println("Самая длинная строка: " + maxLength);

        for (int i = 0; i < maxLength.length(); i++) {
//            char current = maxLength.charAt(i);
//            System.out.println(current);
            System.out.println(maxLength.charAt(i));
        }






    }
}
