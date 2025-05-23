package homeworks.hw_26;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.05.2025
 */
/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление

Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */

public class Calculator {

    public static int add(int i1, int i2) {
        return i1 + i2;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) return Integer.MAX_VALUE;
        return a / b;
    }

    public static double divide(double d1, double d2) {
        return d1 / d2;
    }

}
