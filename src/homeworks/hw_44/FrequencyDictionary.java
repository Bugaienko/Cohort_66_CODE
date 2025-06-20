package homeworks.hw_44;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.06.2025
 */

/*
Task 1
Частотный словарь слов:
Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,

где каждому слову соответствует количество его вхождений в текст.
 */

public class FrequencyDictionary {

    public static void main(String[] args) {

        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
//        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("\noptional 1: " + frequencyDictionary(text));
        System.out.println("\noptional 2: " + frequencyDictionary2(text));
        System.out.println("\noptional 3: " + frequencyDictionary3(text));
        System.out.println("\noptional 4: " + frequencyDictionary4(text));
        System.out.println("\noptional 5: " + frequencyDictionary5(text));

    }

    public static Map<String, Integer> frequencyDictionary(String text) {
       /*
       1. Поместить в какую-то коллекцию слова из текста
       2. Создать карту вхождений слов -> слово : кол-воВхождений
       3. Перебираем слова в цикле:
            3.1. Если слово уже есть - обновить значение (староеЗначение + 1)
            3.2. Если слова нет - добавить в карту новую пару ключ-слово со значением 1
        */

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {

            // Попытаюсь получить значение, ассоциированное этому слову-ключу
            Integer amount = result.get(word);

            // Если такого ключа нет - вернется null
            if (amount == null) amount = 0;

            // Увеличиваю "старое значение" на 1
            amount = amount + 1;

            // Записать в карту новую или обновленную пару
            result.put(word, amount);
        }

        return result;

    }

    public static Map<String, Integer> frequencyDictionary2(String text) {
       /*
       1. Поместить в какую-то коллекцию слова из текста
       2. Создать карту вхождений слов -> слово : кол-воВхождений
       3. Перебираем слова в цикле:
            3.1. Если слово уже есть - обновить значение (староеЗначение + 1)
            3.2. Если слова нет - добавить в карту новую пару ключ-слово со значением 1
        */

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {

            // Попытаюсь получить значение, ассоциированное этому слову-ключу
            // Если такого ключа нет - вернется null и в переменную amount запишется значение по умолчанию (0)
            Integer amount = result.getOrDefault(word, 0);

            // Записать в карту новую или обновленную пару
            result.put(word, ++amount);
        }

        return result;
    }

    // Методы merge, compute - Методы используются для вычисления новых значений в мапе
    // на основании ключа и текущего значения

    public static Map<String, Integer> frequencyDictionary3(String text) {
       /*
       1. Поместить в какую-то коллекцию слова из текста
       2. Создать карту вхождений слов -> слово : кол-воВхождений
       3. Перебираем слова в цикле:
            3.1. Если слово уже есть - обновить значение (староеЗначение + 1)
            3.2. Если слова нет - добавить в карту новую пару ключ-слово со значением 1
        */

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {

            /*
            compute(K key, BiFunction<K, V> remappingFunction)
            Метод compute позволяет вычислить новое значение для ключа, используя функцию пересчета
            Функция пересчета может использовать текущий ключ и текущее значение (получает в параметры)
            Если функция пересчета вернет null, то пара с текущим ключом удаляется из карты
             */
            // key = word
            // oldValue = result.get(key)
            // oldValue == null ? result.put(word, 1) : put(word, oldValue + 1)
            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
//            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : null);
        }

        return result;
    }

    public static Map<String, Integer> frequencyDictionary4(String text) {
       /*
       1. Поместить в какую-то коллекцию слова из текста
       2. Создать карту вхождений слов -> слово : кол-воВхождений
       3. Перебираем слова в цикле:
            3.1. Если слово уже есть - обновить значение (староеЗначение + 1)
            3.2. Если слова нет - добавить в карту новую пару ключ-слово со значением 1
        */

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {

            /*
            compute(K key, BiFunction<K, V> remappingFunction)
            Метод compute позволяет вычислить новое значение для ключа, используя функцию пересчета
            Функция пересчета может использовать текущий ключ и текущее значение (получает в параметры)
            Если функция пересчета вернет null, то пара с текущим ключом удаляется из карты
             */

            // computeIfPresent - вычисляет новое значение, ТОЛЬКО ЕСЛИ ключу было ассоциированно какое-то не-null значение
            // если метод get(key) возвращает НЕ null
            result.computeIfPresent(word, (key, value) -> value + 1);

            // Метод вычисляет новое значение для ключа, ТОЛЬКО ЕСЛИ ключа НЕ БЫЛО (или вернулся null из метода null)
            // если метод get(key) возвращает null
            result.computeIfAbsent(word, key -> 1);
            // put(word, 1)
        }

        return result;
    }

    public static Map<String, Integer> frequencyDictionary5(String text) {
       /*
       1. Поместить в какую-то коллекцию слова из текста
       2. Создать карту вхождений слов -> слово : кол-воВхождений
       3. Перебираем слова в цикле:
            3.1. Если слово уже есть - обновить значение (староеЗначение + 1)
            3.2. Если слова нет - добавить в карту новую пару ключ-слово со значением 1
        */

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {

            /*
            merge(K key, V newValue, BiFunction<K,V> remappingFunction)
            Merge для объединения значений по ключу
            Как работает:
                   - Если ключа нет (или вернул null) новая пара key : newValue вставляется в карту
                   - Если ключ уже существует и вернул не null применится функция пересчета,
                   которая может использовать старое и новое значение value

             */
            // Если word нет -> put(word, 1)
            result.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);
//            result.merge(word, 1, (oldValue, newValue) -> oldValue + 1);
//            result.merge(word, 1, Integer::sum);
        }

        return result;
    }



}
