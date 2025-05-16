package lesson_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.04.2025
 */

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // Сложения "+"
        result = 15 + 6;
        System.out.println("result: " + result);

        // 1. Сначала происходит вычисление результата справа от знака присвоения
        // 2. Результат вычисления присваивается в переменную слева от знака равно

        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        // Вычитания "-"
        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        // Умножение "*"
        result = var1 * var2;
        System.out.println("var1 * var = " + result);

        // Целочисленное деление "/" (между двумя целыми числами) | аналог // в Python
        // 20 / 7 -> 2.85... или 2 целые и 6 в остатке - дробная часть отбрасывается
        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

        // Взятие остатка от деления "%"
        result = var1 % var2;
        System.out.println("var1 % var2 = " + result);

        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        System.out.println("\n==================\n");

        double doubleVar1 = 20.0; // Все числа, записанные в коде с точкой, воспринимаются компилятором
        // как число в формате double
        double doubleVar2 = 7.0d; // явно указано, что число записано в формате double

        // Знак операции "/" между двумя вещественными (дробными) числами - операция "обычного" деления
        // Результат не отбрасывает дробную часть
        double doubleResult = doubleVar1 / doubleVar2;
        System.out.println("doubleRes = " + doubleResult);



    }
}
