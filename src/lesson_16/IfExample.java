package lesson_16;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.05.2025
 */

public class IfExample {
    public static void main(String[] args) {

        // Условный оператор if позволяет выборочно выполнять отдельные части программы (блоки кода)
        // Часто называют оператором принятия решений или операторы ветвления

        /*
        условие - что-то, возвращающее тип boolean (true / false)
        оператор - в том числе оператор блок {}

        if (условие) оператор;

        if (условие) оператор;
        else оператор; // В том числе это может быть {}


        if (условие1) {
            // Код при условие1 выдало true
        } else if (условие2) {
            // Код при условие2 выдало true
        } else {
            // Код выполнится, если ВСЕ условия выдали false (= ни одно не выдало true)
        }

         */

        int age;

        // Запросить у пользователя возраст
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        age = scanner.nextInt();
        scanner.nextLine();

        if (age >= 18) System.out.println("Вы совершеннолетний");
        else System.out.println("Вам меньше 18!");

        System.out.println("Продолжение программы");

        System.out.println("======== Option 2 ==========");

        if (age >= 18) {
            // Код, который выполнится, если условие даст true
            System.out.println("Оператор блок");
            System.out.println("Условие выдало true");
            // Конец кода, который выполнится, если условие даст true
        } else {
            // Блок кода else - выполняется когда условие выдаст false
            System.out.println("Блок else");
            System.out.println("Условие выдало false");
            // Конец блока else
        }

        System.out.println("Продолжение программы #2");

        System.out.println("======================== \n");

        // Допустим в школе 100 бальная система оценок.

        Random random = new Random();

        int score = random.nextInt(101); // получить случайное число в диапазоне от 0 до 100 включительно

        System.out.println("Оценка: " + score);


        if (score >= 90) {
            // 90...100
            System.out.println("Супер!");
        } else if (score >= 75) {
            // 75 ... 89
            System.out.println("Хорошо!");
        } else if (score >= 50) {
            // 50 ... 74
            System.out.println("Удовлетворительно...");
        } else {
            // Блок выполнится, когда ВСЕ условия выдали false
            System.out.println("Плохо!");
        }

        System.out.println("Конец if с оценками");

        System.out.println("================== min ============= \n");

        // Нахождение min из нескольких чисел
        int v1 = random.nextInt(51); // случайное число от 0 до 50
        int v2 = random.nextInt(51); // случайное число от 0 до 50
        int v3 = random.nextInt(51); // случайное число от 0 до 50

//        System.out.printf("Шаблон %s, %f", "string", 2.0);


        String string = String.format("%d | %d | %d", v1, v2, v3);
        System.out.println(string);

        int min = v1;

        if (v2 < min) {
            // переписать min
            min = v2;
        }
        if (v3 < min) min = v3;

        System.out.println("min: " + min);

        System.out.println("=================================\n");

        String result = (score >= 90) ? "Отлично" : (score >= 75) ? "Хорошо" : (score >= 50) ? "Удовлетворительно" : "Плохо!";


        System.out.println("result: " + result);


    }
}
