package homeworks.hw_27;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.05.2025
 */
/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу

Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */

public class Calculator_27 {

    public static final double PI = 3.1415;

    public static double circlePerimeter(double radius) {
        // 2 * Pi * r -
//        return  2 * PI * radius;
        if (radius < 0) return 0;
        return 2 * Math.PI * radius;
    }

    public static double circleArea(double radius) {
        // Pi * r ^ 2 = PI * r * r
        if (radius < 0) return 0;
        return PI * radius * radius;
    }

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
