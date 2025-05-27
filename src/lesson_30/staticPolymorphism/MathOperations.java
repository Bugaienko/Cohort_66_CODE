package lesson_30.staticPolymorphism;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

/*
В Java проявляется в двух основных формах:

- Статический (компиляционный) полиморфизм - реализуется он с помощью перегрузки методов (Method Overloading)

 */

public class MathOperations {

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(MathOperations.sum(1, 3));

        System.out.println(MathOperations.sum(1.6, 2.5));

    }

}
