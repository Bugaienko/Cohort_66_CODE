package lesson_11;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.04.2025
 */

public class Variables {
    public static void main(String[] args) {

        /*
        Фундаментальное отличие:
        Java - строго типизированный язык программирования,
        а Python - динамически типизированный язык

        Python: x = 10 # Python сам понимает / определяет тип переменной - число / строка / булеан


        Строгая типизация - Каждая переменная должна иметь определенный тип данных, который не может измениться.

        Тип данных определяет, какие значения могут храниться в переменной и
        какие операции можно выполнить со значением этой переменной

        Объявляя переменную, мы ДОЛЖНЫ указать тип данных и выбрать уникальное имя

        Имена переменных ВСЕГДА пишутся с маленькой буквы м в camelCase нотации
        my first variable -> myFirstVariable

         */
        int myFirstVariable; // Объявление (декларация) переменной типа int
        myFirstVariable = 1; // Первое присвоение значения называется - инициализация. Присвоение значения переменной

//        Можно также объявить и присвоить значение в одной строке
        int mySecondVariable = 25; // Объявление и инициализация в одной строке

        System.out.println(mySecondVariable);

        mySecondVariable = 50; // Присвоение нового значения

        System.out.println("mySecondVar: " + mySecondVariable);

        byte byteVar = 125; // Объявление и инициализация переменной типа byte
        byteVar = 0;
        System.out.println("Значение переменной byteVar: " + byteVar);

        // Имя переменной должно быть уникально в границах видимости.
        // byte mySecondVariable; Я не могу повторно объявить переменную с таким же именем

        short shortVar; // Объявление переменной типа short
        shortVar = 31000;

        // знак _ для визуального разделения разрядов в числе
        long longVariable = 2_100_000_000_000_000_000L; // L в конце числа - сказать компилятору, что это число в формате long
        System.out.println("longVariable: " + longVariable);

        // В коде любое целое число воспринимается компилятором как число в формате int
        // В коде любой число с дробной частью воспринимается как тип double

        double doubleVar = 10.5421; // Разделитель дробной части - точка
        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 123.56f; // f/F - указать, что число в формате float
        System.out.println("floatVar: " + floatVar);


//        IEEE 754




    }

}
