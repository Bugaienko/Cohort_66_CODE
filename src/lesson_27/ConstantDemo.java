package lesson_27;

import homeworks.hw_26.Calculator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.05.2025
 */

/*

Константа - это статическое финальное поле, содержимое которого неизменно.
Если состояние объекта можно изменить, он н является константой.


В Java константа это переменная, которую не может изменить НИ ОДИН объект класса, в котором она находится.
Такая переменная создается и инициализируется для всех экземпляров класса.

В Java константой считается НЕ та переменная, которую нельзя изменить в рамках одного объекта.

static - делает переменную единственной для всех экземпляров (единое для всех значение)
+ final делает ее неизменяемой
+ состояние объекта тоже не должно меняться



 */

public class ConstantDemo {

    public static final double PI = 3.141519; // Константа
    public static final String MY_COUNTRY = "Germany"; // Константа, т.е. невозможно изменить значение строки (состояние объекта)

    public static final String[] colors = {"blue", "red", "greed"}; // Не константа, т.к. значения в массиве можно изменить

    // Не является константой, т.к. состояние объекта (значения в массиве) можно изменить
    public static final int[] ints = new int[5];

    public ConstantDemo() {
        colors[0] = "yellow";

//        MY_COUNTRY = "USA"; не могу изменить
       String newString =  MY_COUNTRY.toUpperCase();

    }

    public static double doublePi() {
        double result = 2 * PI * PI;
        return result;
    }
}
