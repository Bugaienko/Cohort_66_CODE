package homeworks.hw_16;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.05.2025
 */

/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.

Выведите все 4 числа на экран.

Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.

 */

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int v1 = random.nextInt(101);
        int v2 = random.nextInt(101);
        int v3 = random.nextInt(101);
        int v4 = random.nextInt(101);

        System.out.println(String.format("%d | %d | %d | %d", v1, v2, v3, v4));

        // 5, 15, 20, 11

        int max = v1;

        if (v2 > max) {
            max = v2;
        }
        if (v3 > max) max = v3;
        if (v4 > max) max = v4;

        System.out.println("Максимальное значение: " + max);





    }
}
