package homeworks.hw_14;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 30.04.2025
 */

/*
Task 2

Создайте две переменные типа int.

- В первую переменную запишите случайное значение от 0 до 50.
- Во вторую переменную случайное значение от 0 до 100.
    - (опционально) Во вторую переменную случайное значение от -20 до 30.

Проверьте:

- равны ли переменные,
- не равны ли они,
- больше ли a, чем b,
- и меньше ли b, чем a.

Выведите результат на экран (в виде значения типа boolean).
 */

public class Task2 {

    public static void main(String[] args) {

        // генератор случайных чисел
        Random random = new Random();

        int rand = random.nextInt(); // какое-то число в диапазоне int -> -2,147млрд до +2,147 млрд
//        System.out.println("случайное число: " + rand);

        rand = random.nextInt(51); // Получить случайное число в диапазоне от 0 (вкл) до 51 (НЕ включительно)
//        System.out.println("nextInt(51): " + rand);

        // -30 до 80 v -50 до 50
//        System.out.println(random.nextInt(101) - 50); // 0...100 - 50 -> -50...50


        int a = random.nextInt(51);
        int b = random.nextInt(101); // случайное число от 0 до 100 включительно
        b = random.nextInt(51) - 20; // min = 0, max = 50 -> min = -20, max = 30
//        b = random.nextInt(11) - 5; // min = 0, max = 10 -> - 5 -> min = -5, max = 5

        System.out.println("a: " + a);
        System.out.println("b: " + b);



        boolean check = a == b;
        System.out.println(a + " == " + b + " -> " + check);

        check = a != b;
        System.out.println(a + " != " + b + " -> " + check);

        check = a > b;
        System.out.println(a + " > " + b + " -> " + check);

        check = b < a;
        System.out.println(b + " < " + a + " -> " + check);


    }
}
