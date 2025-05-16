package homeworks.hw_15;


import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.05.2025
 */

/*
Task 3
Создайте две переменные a и b, в каждую сохраните случайное число от 0 до 10 с помощью Random.

Программа должна напечатать true, если результат деления a / b больше 2.

Дополнительно: если b == 0, программа не должна выполнять деление.
В этом случае результат должен быть false.

Пример:
a = 9, b = 3 → результат: `true`
a = 5, b = 0 → результат: `false`
 */

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(11);
        int b = random.nextInt(11);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // 5 -> true && ?
        // 0 -> false && ? -> false
        boolean result = b != 0 && a / b > 2;

        // b != 0 -> 545445 != 0 -> true. Подавляющее большинство значений b - будет давать true
        // b != 0 -> 0 != 0 -> false. Только при значении 0 (значение пори котором я НЕ хочу считать правую часть)

        System.out.println(result);

    }
}
