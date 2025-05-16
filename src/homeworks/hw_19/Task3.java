package homeworks.hw_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.05.2025
 */

/*
Task 3
Написать метод, принимающий на вход целое число.

Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)

2^3 = 2 * 2 * 2 = 8
2 ^ -3 =
 */

public class Task3 {
    public static void main(String[] args) {

        powTwo(3);
        powTwo(1);
        powTwo(0);
        powTwo(-2);
        powTwo(-7);

    } // Methods

    // отрицательная степень?
    // степень равная 0 = выдает ли 1? +
    // степень 1

    public static void powTwo(int x) {

        boolean isPositive = x >= 0;

        if (x < 0) x *= -1; // меняем знак числа для отрицательных значений.

        int result = 1;
        // x = 2 . 0 < 2 + ; 1 < 2 +; 2 < 2 -!
//        for (int i = 0; i < x; i++) {
        // x = 2; 1 <= 2 +; 2 <= 2 +; 3 <= 2 - !
        for (int i = 1; i <=x; i++) {
            result *= 2;
        }

        if (isPositive) {
            System.out.printf("2 ^ %d = %d\n", x, result);
            System.out.println(result);
        } else {
            System.out.println("Степень отрицательная");
            System.out.printf("2 ^ -%d = %.6f\n", x, 1.0 / result);
        }
    }

} // class
