package lesson_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.04.2025
 */

public class PrintFormat {
    public static void main(String[] args) {

        double result = 20.0 / 7.0;
        int age = 25;
        String name = "Alice"; // Тип данных для хранения текста. Текст записывается в кавычках.

        System.out.println("Name: " + name + ", Age: " + age + ", score: " + result);

        // Форматированный вывод - printf
        System.out.printf("Name: %s, Age: %d, score: %.2f\n", name, 18, result);
        System.out.println("Hello\n"); // добавляет знак перевода каретки
        System.out.println("Second line");

        //Ctrl + Z

        /*
        Место в шаблоне, куда я хочу вставить значение переменной, всегда помечается значком %
        После % я должен указать тип данных
        %d - целое число (digit)
        %f - число с плавающей точкой (float)
        %.3f - указать формат вывода числа - кол-во знаков после запятой
        %s - строка / текст (string)
        \n - добавляет перевод каретки на новую строку - работает в любой строке
        %n - символ новой строки (работает только в printf)
         */

    }


}
