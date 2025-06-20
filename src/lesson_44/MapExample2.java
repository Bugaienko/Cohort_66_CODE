package lesson_44;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.06.2025
 */

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(17, "orange");
        map.put(7, "red");

        System.out.println(map);

        //  Collection<V> values() - возвращает коллекцию всех значений карты
        Collection<String> values = map.values();
        System.out.println("map.values(): " + values);

        // Set<K> keySet() - возвращает set, состоящий из всех ключей карты
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);

        // могу перебрать в цикле и получить все значения
//        for (Integer key : keys) {
//            System.out.print(map.get(key) + ", ");
//        }
//        System.out.println();

        /*
        ФОКУС! Живая связь.
        Метод keySet и values возвращают представление / проекцию (view) соответствующих ключей и значений карты.
        Эта проекция поддерживается самой картой, и они напрямую связаны с внутренними данными Map-ы.

         */
        keys.remove(17);
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);
        System.out.println("values: " + values);

        System.out.println("===============\n");
        values.remove("green");
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);

        System.out.println("=============\n");
        System.out.println(map.remove(16));
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("===================\n");

        // Если мы хотим разорвать "связь" - нужно копировать элементы в другую коллекцию
        Set<Integer> keysCopy = new HashSet<>(map.keySet());
        keysCopy.remove(0);
        System.out.println("keysCopy: " + keysCopy);
        System.out.println("map: " + map);

        System.out.println("=================== Map.Entry =================");

        // Set<Map.Entry<K, V>> entrySet - возвращает set всех пар ключ-значение
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry: " + entry);
            System.out.println("entry.getKey(): " + entry.getKey());
            System.out.println("entry.getValue(): " + entry.getValue());
            System.out.println("=======================\n");
        }

        // Тоже живая связь
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(15)) {
                entry.setValue("JAVA!");
            }
        }

        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("=====================\n");

        // foreach() - Перебор всех пар ключ-значение с возможностью применить к ним какую-то функцию

        map.forEach((k, v) -> System.out.println("key: " + k + " -> value: " + v));

        System.out.println("==== Многострочное действие ======");
        map.forEach((key, val) -> {
            System.out.println("Iteration: ");
            System.out.println(key + " | " + val);
            System.out.println("====================\n");
        });









    }
}
