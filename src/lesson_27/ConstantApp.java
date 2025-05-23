package lesson_27;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.05.2025
 */

public class ConstantApp {
    public static void main(String[] args) {

        System.out.println(ConstantDemo.PI);
        // Невозможно изменить значение константы
//        ConstantDemo.PI = 555;

        System.out.println(ConstantDemo.doublePi());

    }
}
