package homeworks.hw_45;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.06.2025
 */

/*
Task 1
Пересечение двух карт:
Реализуйте метод, который принимает две карты Map<String, Integer>
и возвращает новую карту, содержащую только те записи, ключи которых присутствуют в обеих исходных картах.

Для совпадающих ключей значение можно брать из любой карты


 */

public class Task1 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection2(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static Map<String, Integer> intersection2(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        Set<String> keys1 = result.keySet();
        keys1.retainAll(map2.keySet());

        return result;
    }

    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();

        Set<String> keySet1 = map1.keySet();

        for (String key1 : keySet1) {
            if (map2.containsKey(key1)) {
                result.put(key1, map1.get(key1));
            }
        }

        return result;
    }
}
