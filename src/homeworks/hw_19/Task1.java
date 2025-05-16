package homeworks.hw_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.05.2025
 */

/*
Task 1
Написать метод, принимающий на вход строку.

Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)

 */


public class Task1 {

    public static void main(String[] args) {

        printStringLength("Test");
        printStringLength("Hello world");

    } // Method area

    public static void printStringLength(String string) {
        System.out.println(string.length());
    }



} // End class
