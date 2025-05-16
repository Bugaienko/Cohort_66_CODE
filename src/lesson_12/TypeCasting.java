package lesson_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.04.2025
 */

public class TypeCasting {

    public static void main(String[] args) {

    /*
    Преобразование типов данных - это изменение значения из одного типа данных в другой

    В Java есть два способа преобразование типов данных:
    1. Неявное преобразование (автоматическое)
    2. Явное преобразование (кастинг)
     */

        // Неявное преобразование происходит автоматически, когда значение меньшего типа данных
        // преобразуется в бОльший тип данных
        byte byteVal = 123;
        int intVal;
        // = 123(byte) -> 123(int)
        intVal = byteVal; // Неявное преобразование типа byte в тип int
        System.out.println("intVal: " + intVal);

        // double - шире/больше чем тип int
        // 123(int) -> 123.0(double)
        double doubleVal = intVal; // Неявно преобразование int в double
        System.out.println("doubleVal: " + doubleVal);

        // Явное преобразование
        /*
        Требуется, когда нужно преобразовать значение из бОльшего типа данных
        в значение меньшего типа данных, так как
        это может привести к потере данных
         */

        double doubleVal2 = 42.9;
        int intV = (int) doubleVal2; // Явное преобразование из double в int
        System.out.println("intV: " + intV);
        System.out.println("doubleVal2: " + doubleVal2);

        double bigDouble = 3_000_000_000_000_000.00; // Тип данных double вмещает гораздо больший диапазон значений
        // в том числе и в целой части

        // 42(int) -> short = (short) 42(short)
        short shortVal = (short) intV;
        System.out.println("shortVal: " + shortVal);

        System.out.println("====================== \n");

        // Преобразование в вычислениях

        int x = 20;
        int y = 7;
        // 2.857..

        double result;

        // 20 / 7 -> 2 (int) -> неявное автоматическое преобразование 2 -> 2.0 (double) -> result
        result = x / y;
        System.out.println("result: " + result);

        // 20 / 7.0 -> 20.0 / 7.0 -> 2.857d... -> result
        result = x / 7.0;
        System.out.println("result: " + result);

        /*
        Когда в выражении (в формуле) присутствует несколько разных типов данных,
        то все меньшие типы данных автоматически, неявно, приводятся к более широкому типу
         */

        // (float) x / y -> 20.0f / 7 -> 20.0f / 7.0f -> 2.857f -> auto 2.857d -> result
        result = (float) x / y; // -> 2.857
        System.out.println("result: " + result);

    // 20 / (double) 7 -> 20 / 7.0d -> 20.0d / 7.0d -> 2.857d -> result
        result = x / (double) y;
        System.out.println("result: " + result);




    }

}
