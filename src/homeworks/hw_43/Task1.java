package homeworks.hw_43;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.06.2025
 */

/*
 Task 1
Напишите метод, принимающий строку и возвращающий

Список ее слов без повторений, отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке

// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords(String string) {
        /*
        1. Избавиться от знаков препинания
        2. Разбить на слова (массив слов / список слов)
        3. Поместить в коллекцию, которая обеспечит мне уникальность и сортировку (SortedSet)
        4. Преобразовать результаты в список и вернуть
         */

        // regex - s - Специальный знак обозначающий "пробельный символ" - пробел, табуляция, перевод каретки \r, перевод строки \n
        // s+ - пробельный символ в количестве 1 или более
        // массив слов, состоящих только из букв и цифр (без знаков пунктуации)
        String[] words = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");


        Set<String> uniqueWords =
                new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

      // Arrays.asList() - преобразует массив в список
        uniqueWords.addAll(Arrays.asList(words));

        return new ArrayList<>(uniqueWords);
    }

    public static List<String> getUniqueSortedWords2(String string) {
        /*
        1. Избавиться от знаков препинания
        2. Разбить на слова (массив слов / список слов)
        3. Поместить в коллекцию, которая обеспечит мне уникальность и сортировку (SortedSet)
        4. Преобразовать результаты в список и вернуть
         */

        // regex - s - Специальный знак обозначающий "пробельный символ" - пробел, табуляция, перевод каретки \r, перевод строки \n
        // s+ - пробельный символ в количестве 1 или более
        // массив слов, состоящих только из букв и цифр (без знаков пунктуации)
        String[] words = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        List<String> list = Arrays.asList(words);

        Set<String> set = new HashSet<>(list);

        List<String> result = new ArrayList<>(set);

        result.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        return result;

    }
}



















