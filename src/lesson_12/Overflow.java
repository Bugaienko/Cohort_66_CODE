package lesson_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.04.2025
 */

public class Overflow {
    public static void main(String[] args) {

        // -128...127
        byte byteVar = 127;
        System.out.println(byteVar);

        // Переполнение типа данных.
        // При добавлении к максимальному числу диапазона единицы - мы получим минимальное число диапазона
        byteVar++;
        System.out.println(byteVar);

        byteVar--; // -128 - 1 => -129? тип байт не умеет хранить значения меньше чем -128
        System.out.println(byteVar);

        short shortVar = 32767; // -32768 + 4 -> - 32764
        shortVar += 5;
        System.out.println(shortVar);


        byteVar = 100; // max 127 -> 100 + 100 => 100 + 27 + 1 + 72 => 127 + 1 + 72 ->
        // -128 + 72 = -56
        byteVar += 100;
        System.out.println(byteVar);

        int var = 2_100_000_000;
        var += 1_000_000_000;
        System.out.println(var);

    }
}
