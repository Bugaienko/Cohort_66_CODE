package lesson_44;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.06.2025
 */

public class MapExample {
    public static void main(String[] args) {

        // Map<K, V>

        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая, медленная. Не рекомендуется к использованию.

        Map<String, String> phoneBook = new HashMap<>();

        // Добавить пару ключ-значение
        // V put(K key, V value) -> добавляет пару ключ-значение.
        // Возвращает старое значение, ранее соответсвующее этому ключу
        // Если такого ключа еще не было - вернет null
        System.out.println(phoneBook.put("Hanna", "+49-11111"));
        System.out.println(phoneBook.put("Hanna", "+49-11111-1"));

        phoneBook.put("Max", "+49-22222");
        phoneBook.put("John", "+49-33333");

        System.out.println("phoneBook: "  + phoneBook);

        phoneBook.put(null, "+49-00000");

        String oldValue = phoneBook.put("John", "+49-44444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook);

        // putAll - принимает карту (Map) и копирует все пару ключ-значения из этой карты
        Map<String, String> book2 = new HashMap<>();
        book2.put("Seb", "+49-55555");
        book2.put("Michael", "+49-66666");

        phoneBook.putAll(book2);

        System.out.println("phoneBook: " + phoneBook);
        System.out.println("book2: " + book2);

        // boolean containsKey(Object key) - вернет true, если карта содержит такой ключ
        // boolean containsValue(Object key) - вернет true, если карта содержит хотя бы одно такое значение
        System.out.println("phoneBook.containsKey(\"Seb\"): " + phoneBook.containsKey("Seb"));
        System.out.println("phoneBook.containsValue(\"Hello\"): " + phoneBook.containsValue("Hello"));
        System.out.println("phoneBook.containsValue(\"+49-11111-1\"): " + phoneBook.containsValue("+49-11111-1"));

        System.out.println("=============== GET ================== ");

        // Взятие значения по ключу
        // V get(Object key) - возвращает значение по ключу. Если ключа нет - вернет null
        String value = phoneBook.get("Hanna");
        System.out.println("phoneBook.get(\"Hanna\"): " + value);

        System.out.println("phoneBook.get(\"KEY\"): " + phoneBook.get("KEY")); // такого ключа нет - вернет null

        // getOrDefault(Object ket, V defaultValue)
        // Возвращает значение по ключу. Если ключа нет - вернет значение по умолчанию (второй параметр метода)
        String value2 = phoneBook.getOrDefault("Hanna", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"Hanna\"): " + value2);

        value2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"KEY\", \"DEFAULT\"): " + value2);

        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");

        // Конструкторы
        // 16 корзин. Коэффициент заполнения 0.75
        Map<Integer, String> construct = new HashMap<>(); // Создает пустой словарь
        construct = new HashMap<>(30); // Создает пустой словарь. 32 корзины. Коэфф 0.75
        construct = new HashMap<>(30, 0.90f); // Создает пустой словарь. 32 корзины. Коэфф 0.90

        // Принимает Map и копирует все пары ключ-значение
        construct = new HashMap<>(otherMap);

        System.out.println("construct: " + construct);

        System.out.println("\n=============== REMOVE ===================");

        // V remove(Object key) - удаляет пару ключ-значение. Возвращает старое значение или null (если не нашел ключ)
        System.out.println(phoneBook);
        System.out.println("phoneBook.remove(\"Michael\"): " + phoneBook.remove("Michael")); // Ключ есть. Удалит пару. Вернет старое значение
        System.out.println(phoneBook);
        System.out.println("phoneBook.remove(\"Nicolas\"): " + phoneBook.remove("Nicolas")); // Ключа нет. Вернет null

        // boolean remove(Object key, Object value) - удаляет пару ключ-значение,
        // только если в мапе есть такой ключ и ему ассоциировано такое значение

        System.out.println("phoneBook.remove(\"Hanna\", \"+49-22222\"): " + phoneBook.remove("Hanna", "+49-22222")); // такой записи нет в карте
        System.out.println(phoneBook);
        System.out.println("phoneBook.remove(\"Max\", \"+49-22222\"): " + phoneBook.remove("Max", "+49-22222")); // такая запись есть - и она будет удалена
        System.out.println(phoneBook);

        // void clear() - очищает карту
        // int size() - возвращает кол-во элементов (пар ключ-значение)
        System.out.println("phoneBook.size(): " + phoneBook.size());
        // boolean isEmpty() - вернет true, если словарь пустой


    }
}















