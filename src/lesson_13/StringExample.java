package lesson_13;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.04.2025
 */

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; // Объявление и инициализация переменной типа String.
        System.out.println("string: " + string);

        String string1 = new String("Hello"); // Тоже создание новой строки (не рекомендуемый)
        System.out.println("string1: " + string1);

        // Методы для работы со строками

        // 1. Получить количество символов в строке (длина строки)
        int length = string.length(); // в результате работы метода мы получаем число,
        // соответствующее кол-ву символов в этой строке
        System.out.println("length: " + length);

        // Метод позволяет перевести все символы строки в верхний регистр.
        System.out.println(string.toUpperCase());
        System.out.println("string осталась без изменений: " + string);

        /*
        String иммутабельны (неизменяемые)
        Это значит, что после создания строка не может быть изменена.
        Если мы попробуем изменить строку каким-то методом, Java создаст новую строку,
        а старая строка останется без изменений.
         */

        // toUpperCase() - возвращает новую строку, где все буквы заменены на строчные (большие)
        // Если я хочу сохранить результаты работы метода - я должен сохранить его в какую-то переменную
        String stringUpper = string.toUpperCase();
        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);

        // toLowerCase() - переводит все символы строки в нижний регистр
        // Результат работы метода мы можем сохранить и в ту же саму. переменную - переписав ее значение.
//        int x = 10;
//        x = x + 5;
        stringUpper = stringUpper.toLowerCase();
        System.out.println("stringUpper: " + stringUpper);

        System.out.println("=================\n");


        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты конкатенации (склеивание / объединение) строк

        // Конкатенация 1. С помощью оператора +
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);


        // Конкатенация 2. Метод concat() - явный способ объединения двух строк

        concatStr = str1.concat(str2); // str1 + str2
        concatStr = concatStr.concat(str3); // str1 + str2  + str3
        // concatStr.concat( 5); метод concat работает ТОЛЬКО со строками. И авто-кастинг не происходит, если передать другой тип данных

        // цепочка методов
        String concatNew = str1.concat(str2).concat(str3).concat("!!!"); // ((str1 + str2) + str3) + "!!!"
        System.out.println("concatNew: " + concatNew);


        // Конкатенация 3.

        // "One", "hello", "java" -> "One hello java"
//        concatStr = str1 + " " + str3 + " " + "java";
        // Позволяет объединить строки с использованием разделителя
        concatStr = String.join(" ", str1, str3, "java");
        System.out.println("String.join(\" \", str1, str3, \"java\"): " + concatStr);

        String joinStr = String.join("---", "Java", str3);
        System.out.println("join ---: " + joinStr);

        System.out.println("=========================\n");

        // Что происходит, когда + стоит между строкой и другим типом данных (например, числом),
        // Когда одна из частей выражения
        int id = 1;
        System.out.println("My id: " + id);

        System.out.println(1 + 3);

        System.out.println("2 + 3 = " + 2 + 3);
        System.out.println("2 + 3 = " + "2" + 3); // "2 + 3 = 2"
        System.out.println("2 + 3 = 2" + "3"); // "2 + 3 = 23"


        System.out.println("===============\n");
        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println(4 + " : " + 2 + 3);
        System.out.println("4 : " + 2 + 3);
        System.out.println("4 : 2" + 3);
        System.out.println("4 : 23");

        System.out.println("2 + 3 = " + (2 + 3));
        System.out.println("2 + 3 = " + 5);


        System.out.println("=================\n");

        // Каждая строка состоит из символов, которые имеют свой индекс.
//        Индексация начинается с 0

        String digits = "0123456789";
        String word = "Programming";
        System.out.println("digits: " + digits);
        System.out.println("digits.length(): " + digits.length());
        char firstChar = digits.charAt(0);
        System.out.println("firstChar: " + firstChar);
        System.out.println("word.charAt(0): " + word.charAt(0));

        // Независимо от фактической длины строки, индекс последнего символа ВСЕШДА будет равен (длина минус 1)
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("lastChar: " + lastChar);
        System.out.println("word.charAt(word.length() - 1): " + word.charAt(word.length() - 1));

        System.out.println("====== substring =========== \n");

        // Извлечь подстроку - это процесс получения части строки на основе указанных индексов
        // Метод substring()
        // "status: online"
        String status = "status: online";

        // Взять символы начиная с 8 и до конца строки
        String subString = status.substring(8);
        System.out.println("status.substring(9): " + subString);
        System.out.println("status неизменна: " + status); // Изначальная строка остается неизмененной

        // Взять символы со 2 включительно по 7 НЕ включительно
        String subString2 = digits.substring(2, 7);
        System.out.println("digits.substring(2, 7): " + subString2);

        System.out.println("========= replace");

        String str = "One World One";

        // replace() - заменяет все совпадения заданной строки нп другую строку
        String result = str.replace("One", "World");
        System.out.println("result: " + result);

        // replaceFirst() - заменяет только первое найденное совпадение
        result = str.replaceFirst("One", "World");
        System.out.println("result: " + result);

        // replaceAll() - заменяет все найденные совпадения.
        result = str.replaceAll("One", "World");
        System.out.println("result: " + result);

        // replaceFirst и replaceAll - поддерживают работу с регулярными выражениями
        str = "One WorldOne Only O";
        System.out.println(str.replace("One", "WWW"));
        System.out.println(str.replaceAll("\\bO\\w*", "Replaced"));











    }
}
