package lesson_48;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.06.2025
 */

public class ExceptionsExample {

    public static void main(String[] args)  {

        // Ошибки компиляции - ошибки которые возникают на этапе компиляции.

//        int a = "Java";
//        String str - "Java";

        // Времени выполнения (runtime) - ошибки, появляющиеся во время работы программы.

        // Исключения (Exceptions) - представляют собой события,
        // которые могут возникнуть во время выполнения программы (runtime) и нарушить ее нормальное выполнение

//        Исключение в Java представляет собой объект определенного класса, который наследуется от класса Throwable
//        этот объект возникает (создается автоматически) при ненормальной, аварийной ситуации

        /*
        try-catch

        try {
            // код, который может вызвать появление исключения (объекта определенного класса)
        } catch (ExceptionType exception) {
            код для обработки исключения
            код, который выполнится при возникновении исключения определенного в параметрах класса
            в нашем случае -> ExceptionType или его наследников
        } catch (AnotherExceptionType ex2) {
            // код обработки ошибки другого типа
        } finally {
            // код, который будет выполнен в любом случае, перед выходом из конструкции try-catch
        }

         */


        int[] array = {1, 23, 4};
//        array[19] = 100; // java.lang.ArrayIndexOutOfBoundsException

//        int x = 10 / 0; // java.lang.ArithmeticException


        try {
            array[2] = 100;
            System.out.println("Try continue");
//            array[10] = 99;
            int x = array[2] / 0;
            System.out.println("Try continue #2");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayException: " + exception.getMessage());
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка!");
            ex.printStackTrace();
            System.out.println("Exception: " + ex.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.err.println("Печатаю в потоке ошибок!");

        System.out.println("Continue program");

        // Проверяемые (checked exception) и непроверяемые исключения

        // Проверяемые - возможность появления этих исключения мы ОБЯЗАНЫ обработать.
        // Непроверяемые исключения - это исключения, возможность появления которых я не обязан обрабатывать в коде

        String result = getUrlString();

        System.out.println("result: " + result);


        String result2;

        try {
            result2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: " + e.getMessage());
            result2 = "http://google.com";
        }

        System.out.println("result2: " + result2);


    }

    // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключение
    private static String getUrlString2() throws MalformedURLException {
        URL url = new URL("http://example.com");
        return url.toString();
    }

    private static String getUrlString() {
        URL myUrl;

        // new URL бросает проверяемое исключения

        try {
            myUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат url: " + e.getMessage() );
            return "https://google.com";
        }

        return  myUrl.toString();
    }
}
