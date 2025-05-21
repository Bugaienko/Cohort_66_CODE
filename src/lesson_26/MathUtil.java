package lesson_26;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.05.2025
 */

public class MathUtil {

    public static int sumIntegers(int...integers) {
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }

        return sum;
    }

}
