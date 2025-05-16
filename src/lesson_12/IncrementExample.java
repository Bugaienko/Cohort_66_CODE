package lesson_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.04.2025
 */

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;

        // 1. Сначала происходит вычисление результата справа от знака присвоения
        // 2. Результат вычисления присваивается в переменную слева от знака равно

        x = x + 5;
        System.out.println("x: " + x);
        // Ctrl + D
        // Shift + Alt + стрелка вверх / вниз

        x -= 3; //  x = x - 3;
        System.out.println("x: " + x);
        x += 5; // x = x + 5
        x *= 2; // x = x * 2
        x /= 5; // x = x / 5
        System.out.println("после всех операций x : " + x);

        // Инкремент, декремент

        // x += 1; // x = x + 1;
        x++; // Инкремент - увеличить текущее значение в переменной на 1
        System.out.println("x: " + x);

        // x -= 1; x = x - 1;
        x--; // Декремент - уменьшить текущее значение в переменной на 1
        System.out.println("x: " + x);

        /*
        Порядок имеет значение!
        Инкремент и декремент можно записать по разному:
        после переменной x++, x-- (постфикс)
        перед переменной ++x, --x (префикс)

        Если запись постфиксная (х++), то сначала используется текущее значение переменной,
        а потом оно увеличивается
         */

        int var = 100;
        System.out.println("var: " + var++);
        System.out.println("var: " + var);

        int y = 100;
        System.out.println("y: "+ ++y);
        System.out.println("y: " + y);

        int result = y++;
        System.out.println("result: " + result);
        System.out.println("y: " + y);




    }
}
