package homeworks.hw_17;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.05.2025
 */

/*
Task 3
Используйте цикл while для решения задачи:

Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 */

public class Task3 {
    public static void main(String[] args) {


        int i = 1;
        // Счетчик подходящих чисел
        int count = 0;

        while (i <= 100 && count < 7) {

            if (i % 5 == 0) {
                System.out.print(i + ", ");
                // число прошло проверку, значит подходит, значит увеличиваем счетчик
                count++;
            }
            i++;

        }
        System.out.println();

        System.out.println("Найдено чисел: " + count);


    }
}
