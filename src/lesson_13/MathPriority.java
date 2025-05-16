package lesson_13;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.04.2025
 */

public class MathPriority {
    public static void main(String[] args) {

        // Приоритет математических операций

        /*
        Приоритет - как в математике. Если приоритет у операций равный -
        операции выполняются слева направо
        1. ()  Сначала выполняется операция/-и в скобках
        2. * / %  Умножение, деление и взятие остатка
        3. + -  Сложение и вычитание
         */

        int res = 2 + 8 / 2;
        System.out.println("res: " + res);

        res = 5 / 2 * 2;
        System.out.println("5 / 2 * 2: " + res);
        res = 5 * 2 / 2;
        System.out.println("5 * 2 / 2: " + res);
        res = 5 / (2 * 2);
        System.out.println("5 / (2 * 2): " + res);


    }
}
