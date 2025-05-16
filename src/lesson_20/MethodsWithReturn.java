package lesson_20;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.05.2025
 */

public class MethodsWithReturn {

    /*
    Возвращаемое значение - это результат, который метод отправляет обратно вызывающему метод коду,
    как результат своей работы
    Это способ передать результат вычислений метода в другие части программы.

    Ключевое слово return прекращает работу методы. И, возможно, используется для возврата значения из метода
     */

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        System.out.println(calculateSum(10, 20));
        int sum = calculateSum(10, 20);
        System.out.println("sum = " + sum);

        int sum2 = calculateSum(10, 20) + calculateSum(5, 7);
        // int sum2 = 30 + 12;  = 42
        System.out.println("sum2 = " + sum2);

        System.out.println("==============\n");

        double pow = powTwo(3);
        System.out.println("powTwo(3): " + pow);

        System.out.println("powTwo(0): " + powTwo(0));

        System.out.println("powTwo(-3): " + powTwo(-3));


    } // Method

    // Написать метод, возвращающий 2 в степени Х. Х метод получается в качестве параметра
    public static double powTwo(int x) {

        // Если пришла степень равная 0 - результат должен быть 1
        if (x == 0) {
            return 1;
            // Метод прекращает работу и возвращает значение.
        }

        // в этой строчке кода х абсолютно точно не равен 0!
        boolean isPositive = x > 0;

        // Если х отрицательный - отбросить знак числа
        if (x < 0) x *= -1;

        int result = 1;

        for (int i = 0; i < x; i++) {
            result *= 2;
        }

        if (isPositive) {
            return result;
            // до 70-й строчки кода мы не дойдем, если будет вызван этот return
        }
        // В эту строчку кода я попаду только если не будет вызван return
        // Т.е. если в переменной isPositive значение false
//      System.out.println("Деление: " + (1.0 / result));
        return 1.0 / result;


    }


    public static int calculateSum(int a, int b) {
        int result = a + b;
        //
        return result;

    }


} // class
