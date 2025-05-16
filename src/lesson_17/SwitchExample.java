package lesson_17;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.05.2025
 */

public class SwitchExample {
    public static void main(String[] args) {

        /*
        switch - используется, когда нужно выполнить разные действия в зависимости от значения ОДНОЙ переменной.

        Это альтернатива множественным операторам if-else if,
        когда проверяется равенство одной переменной с разными значениями

        Особенно хорош, когда мы выбираем из известного и конечного количества вариантов.

         */

        int x = 11;

        if (x == 5) {
            System.out.println("Блок if. x = 5");
        } else if (x == 7) {
            System.out.println("if-else. x = 7");
        } else {
            System.out.println("else. Какое-то другое значение");
        }

        /*


         switch (выражение) {
            case значение1 :
                // Блок кода для значения1
            case значение2 :
                // Блок кода для значения2
            ...
            default:
                // Блок кода пл умолчанию (если ни одно из значений не совпало)
         }


         выражение - переменная или выражение, которое будет сравниваться с нашим набором значений
          case значение1 : - метка значения, с которой сравнивается "выражение"
          default: Блок кода по умолчанию (если ни одно из case не совпал)
          break; - прекращение выполнение кода в конструкции switch;
         */

        System.out.println("===============\n");

        x = 7;

        switch (x) {
            case 5:
                System.out.println("switch. x = 5");
                break;
            case 7:
                System.out.println("switch. x = 7");
                break;
            case 9:
                System.out.println("switch. x = 9");
                break;
            default:
                System.out.println("switch. Что-то другое");
        }


        System.out.println("\nСтрока за пределами switch");

        System.out.println("===============\n");

        // Просим пользователя ввести число от 1 до 4. В зависимости от числа - выдать разное сообщение

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4:");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            // if (x == 3 || x = 4) {какое-то общее действие для двух значений }
            case 3:
            case 4:
                System.out.println("Вы ввели три или четыре");
                break;
            default:
                System.out.println("Я таких чисел не знаю");

                System.out.println("Конец свитча");
        }

        // Java 14 or higher

        /*
        System.out.println("=======================\n");

        switch (number) {
            case 1 -> System.out.println("Switch2. Ввели один");
            case 2 -> System.out.println("Switch2. Вы ввели два");
            case 3, 4 -> System.out.println("Switch2. Вы ввели три или четыре");
            default -> System.out.println("Switch2. Я таких чисел не знаю");
        }

        System.out.println("=======================\n");

        String result = switch (number) {
            case 1 -> "Opt3. Один";
            case 2 -> "Opt3. Два";
            case 3,4 -> "Opt3. Три ли четыре";
            default -> "Default";
        };

        System.out.println("result = " + result);

         */



    }
}
