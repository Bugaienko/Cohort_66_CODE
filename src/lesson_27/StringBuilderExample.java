package lesson_27;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.05.2025
 */

public class StringBuilderExample {

    public static void main(String[] args) {

        // String = НЕизменяемая последовательность символов
        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        // StringBuilder - это класс, объекты которого используются для
        // создания и манипулирования изменяемыми строками
        // StringBuilder = изменяемая последовательность символов

        // Перегруженные конструкторы. Может быть пустым, можем принимать String
        StringBuilder sb = new StringBuilder(); // пустой конструктор
        sb = new StringBuilder("Hello");

        // Метод добавления символов в конец строки (приклеивание справа). Аналог конкатенации
        sb.append(" !!!"); // "Hello" + " !!!" ->

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        sb = new StringBuilder("Java");
        sb.append(" ").append("is").append(" ").append("the").append(" ").append("best");
        System.out.println(sb.toString());

        // Вставить символы в указанную позицию.
        System.out.println("==============\n");
        sb = new StringBuilder("Hello World"); // Hello beautiful World
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());

        String start = "Hello World";
        String result = start.substring(0, 6); // "Hello "
        result += "beautiful "; // "Hello beautiful "
        result += start.substring(6);
        System.out.println(result);

        System.out.println("==============\n");
        // Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!"); // "Hello Java!"
        sb.replace(6, 11, "Java"); // Заменить все что было с 6 по 11 индекс на значение "Java"
        System.out.println(sb.toString());

        // Удалить подстроку (определяется индексами). Start вкл до end не включительно
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        // Нам надо знать есть ли в sb подстрока.
        // Вернет положительный индекс, если нашел. И минус 1, если подстрока не найдена
        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("Wor");
        System.out.println("index: " + index);
        index = sb.lastIndexOf("l");
        System.out.println("index: " + index);
        System.out.println(sb.lastIndexOf("Java"));

        System.out.println("============ reverse ==\n");
        // Реверс - разворачивает последовательность символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        // Получить символ по индексу
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(4);
        System.out.println("ch: " + ch);

        // количество символов в sb (длина)
        sb = new StringBuilder("Hello");
        System.out.println("length: " + sb.length());

        // Я могу установить новую длину (обрезать или расширить sb)
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8): " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb.toString());
        System.out.println("sb.length(): " + sb.length());

        System.out.println("==============\n");

        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)
        научно исследовательский институт -> НИИ
        С использованием StringBuilder
         */

        String  example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);

        String[] words = example.split(" "); // Метод класса String. Результат - массив строк
        System.out.println(Arrays.toString(words));

        String symbols = "EQRrqereq frefr!";
        // получить массив символов, из которых состоит строка
        char[] chars = symbols.toCharArray();
        System.out.println(Arrays.toString(chars));




    }

    public static String phraseString() {
        Scanner scanner = new Scanner(System.in);

        // TODO
        return null;
    }

}
