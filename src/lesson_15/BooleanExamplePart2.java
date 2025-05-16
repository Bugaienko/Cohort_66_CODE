package lesson_15;

/**
 * @author Sergey Bugaenko
 * {@code @date} 29.04.2025
 */

public class BooleanExamplePart2 {
    public static void main(String[] args) {

        // Логический тип данных. Два значения true / false

        boolean bool = true;
        bool = false;

        System.out.println(bool);

        // Условное выражение -> операция сравнения или логическая операция

        // Операции сравнения: между двумя операндами (значениями) - результат всегда boolean


        int x = 10;
        int y = 7;


        // Сравнение на равенство ==
        boolean b1 = x == y; // Логическое высказывание: Х равен Y -> 10 равно 7 -> false
        System.out.printf("%s == %s -> %s\n", x, y, b1);

        // Сравнение на неравенство !=
        // X не равен Y. 10 не равно 7 -> true
        b1 = x != y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        // Больше >
        // X больше чем Y. 10 больше чем 7 -> true
        b1 = x > y;
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        y = 10;
        // X больше чем Y. 10 больше чем 10 -> false
        b1 = x > y;
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        // Больше или равно >=
        // X больше или равен Y. 10 больше или равно 10 -> true
        b1 = x >= y;
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        // Меньше <
        x = 5;
        // X меньше чем Y. 5 меньше чем 10 -> true
        b1 = x < y;
        System.out.printf("%s < %s -> %s\n", x, y, b1);

        // Меньше или равно <=
        // X меньше или равен Y. 5 меньше или равно 10 -> true
        b1 = x <= y;
        System.out.printf("%s <= %s -> %s\n", x, y, b1);

        // Методы класса String, возвращающие boolean


        // contains - проверяет, содержит ли строка указанную подстроку.
        // Возвращает true, если подстрока найдена и false, если не найдена
        String str = "Java is the best!";
        boolean contains = str.contains("Java"); // строка str содержит последовательность символов "Java"
        System.out.println("str.contains(Java) = " + contains); // true
        System.out.println("str.contains(java) = " + str.contains("java")); // false
        System.out.println("str.contains(is t)" + str.contains("is t"));

        // Todo рассказать о метод startsWith!
        // stratsWith(), endsWith() - начинается / оканчивается строка на указанную подстроку
        boolean startsWith = str.startsWith("Ja"); // Строка str начинается с "Ja"
        System.out.println("str.startsWith(Ja): " + startsWith);
        startsWith = str.startsWith("is t"); // false (последовательность букв такая есть. Но строка с них не начинается)
        System.out.println("str.startsWith(is t): " + startsWith);

        boolean endsWith = str.endsWith("best");
        System.out.println("str.endsWith(best): " + endsWith); // Строка str заканчивается на "best" -> false
        endsWith = str.endsWith("best!");
        System.out.println("str.endsWith(best!): " + endsWith); // Строка str заканчивается на "best!" -> true

        System.out.println("=========== Логические операции ============== \n");

        // Логическое НЕ (отрицание) - NOT - "!"
        // Меняет значение boolean на противоположное
        boolean b2 = !false; // НЕ false = true
        System.out.println("!false: " + b2);

        b2 = !(4 == 5); // !false -> true
        System.out.println("!(4 == 5): " + b2);

        // Составные сравнения, которые объединяют два условия

//        boolean & boolean

        System.out.println("\n======== Логическое И & =============== \n");

        /*
        Логическое И "&"
        Используется когда нужно, чтобы оба условия были истинными.
        Возвращает true, если оба условия true.
        Если хотя бы в одной части будет false -> в результате мы получим false
         */


        b2 = true & true;
        System.out.println("true & true: " + b2);
        System.out.println("true & false: " + (true & false));
        System.out.println("false & true: " + (false & true));
        System.out.println("false & false: " + (false & false));

        // Проверка, что число входит в нужный диапазон
        // Введите число от 0 до 100
        int input = 500;
        b2 = input >= 0 & input <= 100; // true & false -> false
        System.out.println("Вы ввели правильное число: " + b2);

        System.out.println("\n ============ ЛОГИЧЕСКОЕ ИЛИ | ===============\n");

        // Логическое ИЛИ "|"
        // Когда достаточно, чтобы одно из условий было истинным
        b2 = true | true;
        System.out.println("true | true: " + b2);
        System.out.println("true | false: " + (true | false));
        System.out.println("false | true: " + (false | true));
        System.out.println("false | false: " + (false | false));

        System.out.println("\n ============ ЛОГИЧЕСКОЕ Исключающее ИЛИ ^ ============\n");

        // ЛОГИЧЕСКОЕ Исключающее ИЛИ (XOR) "^"
        // Возвращает true, если две части выражения разные

        System.out.println("true ^ true: " + (true ^ true));
        System.out.println("true ^ false: " + (true ^ false));
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("false ^ false: " + (false ^ false));

        System.out.println("\n========= Логическое сокращенное И && ============\n");

        // Логическое сокращенное И "&&"
        // Выдает true, только если обе части выражения true
        b2 = true && true;
        System.out.println("true && true: " + b2);
        System.out.println("true && false: " + (true && false));

        int a = 10;
        int b = 10;

        // b = 0 > 0 != 0 -> false
        // false & ? -> false
        // b = 2 -> 2 != 0 -> true
        // true && ? ->
        boolean b3 = b != 0 && a / b > 2;
        System.out.println("a / b > 2: " + b3);


        System.out.println("\n========= Логическое сокращенное ИЛИ || ============\n");

        // Логическое сокращенное ИЛИ ||
        // Выдает true, если хотя бы одна часть выражения true;

        b = 0;
        // true || ? -> true (независимо от значения правой части)
        // в таком случае сокращение или НЕ будет вычислять правую часть, а обычное или будет считать.
        b3 = true || a / b > 0;
        System.out.println("a / b > 0: " + b3);

        System.out.println("=========== Приоритет логических операций ======================= \n");

        /*
        () ! & ^ | && || - приоритет выполнения логических операций
         */

        System.out.println(true ^ true & false); // true
        System.out.println(true ^ false); // true
        System.out.println(true); // true

        System.out.println();

        System.out.println(true ^ true && false); // false
        System.out.println(false && false); // false
        System.out.println(false); // false

        System.out.println();

        System.out.println(true ^ (true && false)); // true
        System.out.println(true ^ false); // true
        System.out.println(true ); // true










    }
}
