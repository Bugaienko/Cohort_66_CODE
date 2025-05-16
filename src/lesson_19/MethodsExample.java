package lesson_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.05.2025
 */

public class MethodsExample {

    public static void main(String[] args) {

        // Метод - это инструкция, которую мы один раз пишем и можем потом использовать сколько угодно раз.
        // Каждый метод имеет имя.
        // Метод - это код - набор инструкций (или команды), которые выполняются при вызове метода.
        // Один раз написал - много раз использовал


        // Каждый java-метод ДОЛЖЕН быть внутри класса

        // Вызов метода по имени.
        sayHello();
        sayHello();
        sayHello();

        char ch = 'a';
//        ch = 98;
//        System.out.println(ch);

        // Параметры - это данные, которые мы передаем в метод, чтобы он их смог использовать в своем теле (инструкциях)

        printDecimalCodeOfChar(ch);

        char anotherChar = 'B';
//        char anotherChar1 = "AS"; // так нельзя, так как не совпадают типы - переменной и значения
        printDecimalCodeOfChar(anotherChar);
        printDecimalCodeOfChar('6');

        int[] array = {1, 45, 76, 65, 980, 435, 9, 0};

        // DRY - не повторяй сам себя

//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println("]");

        printArray(array);

        array[3] = 1001;
        array[0] = -100_000;

        printArray(array);

        String[] strings = {"Hello", "Java", "Test", "Python"};

        printArray(strings);

        testParameterOrder(1, "Hello");
        testParameterOrder("Java", 2);



    } // end main
    // Methods area

    /*
    ПЕРЕГРУЗКА МЕТОДОВ

    В пределах одного класса может быть два и более методов с одинаковым именем,
    НО разным набором параметров (тип и порядок параметров имеют значение)

     */

    public static void testParameterOrder(String string, int index) {
        System.out.println("Другое поведение! Реализация № 2");
        System.out.println("str: " + string);
        System.out.println("int: " + index);
        System.out.println("===================");
    }

    public static void testParameterOrder(int x, String str) {
        // int x = первыйПараметрВызова
        // String str = второйПараметрВызова
        System.out.println("Реализация №1 тест-метода!");
        System.out.println("str: " + str);
        System.out.println("int: " + x);
        System.out.println("===================");
    }


    public static void printArray(boolean[] booleans) {
        // Логика вывода массива типа boolean

    }



    // Метод "красиво" выводит все элементы массива СТРОК
    public static void printArray(String[] strings) {
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i < strings.length - 1 ? ", " : "]\n"));
        }
    }


    // Метод "красиво" выводит все элементы массива ЦЕЛЫХ ЧИСЕЛ
    public static void printArray(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) { // перебираю индексы массива
            System.out.print(ints[i] + (i == ints.length - 1 ? "]\n" : ", "));
        }
    }



    // Написать метод, который печатает в консоль код char (символа)
    public static void printDecimalCodeOfChar(char ch1) {
        // Условно выполняемая строка при вызове метода (перед началом работы метода)
       // char ch1 = ch (значение ch берется из аргумента вызова метода)
        System.out.println((int) ch1);

    }


    // Написать метод приветствия пользователя
    public static void sayHello() {
        // Тело метода - код, который будет выполнен при вызове метода
        System.out.println("Hello user!");
    }

} // end class

