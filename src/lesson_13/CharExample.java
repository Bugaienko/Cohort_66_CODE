package lesson_13;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.04.2025
 */

public class CharExample {
    public static void main(String[] args) {

        // Тип данных char

        // символ пишется в одинарных кавычках
        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная тоже будет хранить букву А латинского алфавита, соответствующую коду 65 в 10-ой системе счисления
        char a2 = 0x41; // Присваиваю число в 16-формате. Что соответствует все той же букве А.
        a2 = 0x0041; // полная форма записи числа в 16 системе счисления
        // FFFFFF, 000000
        // R - 0...256, G 0...256, B 0...256
        char a3 = '\u0041'; // Еще один способ задать значение в 16 формате
        char x ='\u15A7';



        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        char digit = 48; // Соответствует символу цифры 0
        System.out.println("digit: " + digit);
        digit++; // А символ с кодом 49 - это цифра 1
        System.out.println("digit + 1: " + digit);

        digit += 4; // 54
        System.out.println("digit + 4: " + digit);

         /*
        Когда в выражении (в формуле) присутствует несколько разных типов данных,
        то все меньшие типы данных автоматически, неявно, приводятся к более широкому типу
         */

        // 54 char + 3 int -> 54 int + 3 int -> 57 int
        // char = int
        digit = (char) (digit + 3);

        System.out.println("digit + 3: " + digit);

        char letter = 97; // a - латинского алфавита
        System.out.println("letter: " + letter);
        letter++;
        System.out.println("letter: " + letter);

        System.out.println("int из char 10-й код символа: " + (int) letter);
        System.out.println(0 + letter);

        /*
        0...9 -> соответствуют кодам 48...57
        a...z -> соответствуют кодам 97...122
        A...Z -> соответствуют кодам 65...90

         */

        char x1 = 12853;
        System.out.println("x1: " + x1);







    }
}
