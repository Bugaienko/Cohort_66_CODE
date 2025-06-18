package lesson_43.set;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.06.2025
 */

public class SetExample {
    public static void main(String[] args) {

        // Хеширование -> преобразование объекта в вид целого числа. Это число называется хеш-код объекта
        // hashCode() из класса Object

        String str = "abc";
        int code = str.hashCode();
        System.out.println(code);

        String str2 = new String("abc");
        System.out.println(str2.hashCode());

        System.out.println(str.equals(str2));
        System.out.println(str.hashCode() == str2.hashCode());

        String s1 = "Aa";
        String s2 = "BB";
        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());

        /*
        Для корректной работы хеш-коллекций есть важное правило -
        контракт между equals() и hashCode()

         1. Если два объекта равны по методу equals(), то их hashCode() тоже должны быть равны.
         2. Если хеш-коды двух объектов разные, то объекты точно НЕ должны быть равны по equals()
         (обратное не всегда верно. Коллизия - разные объекты могут иметь одинаковые hash-коды)
         3. Вызов метода hashCode должен возвращать одинаковое значение при многократных вызовах на неизмененном объекты
         */

        // Конструкторов
        Set<Integer> set = new HashSet<>(); // Создает пустое множество (set). Емкость 16 и коэффициент заполнения 0.75
        set = new HashSet<>(20); // Создает пустое множество (set) с указанной емкостью.
        // Принимает коллекцию - создает новый сет, содержащий уникальные элементы из указанной коллекции
        set = new HashSet<>(java.util.List.of(1, 2, 3, 5, 6, -10, 5, 6, -25, 3, 6, -4, 0));

        System.out.println("set: " + set);

        List<Integer> startValues = java.util.List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32);

        // HashSet - не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers: " + integers);

        // LinkedHashSet - сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        // гибкость интерфейсной ссылки
        linkedSet = new HashSet<>();

        System.out.println("=====================\n");

        // Методы интерфейса Set

        // boolean add(E e) - добавление элемента
        System.out.println("integers.add(100) #1: " + integers.add(100)); // true - элемент был добавлен
        System.out.println(integers);
        System.out.println("integers.add(100) #2: " + integers.add(100)); // false - элемент НЕ добавлен, т.к. такое значение уже есть в сете
        System.out.println(integers);

        System.out.println("====================\n");
        // boolean remove(Object o) - удаление элемента по значению
        System.out.println("integers.remove(100): " + integers.remove(100)); // true
        System.out.println(integers);

        // boolean contains(Object o) - проверяет присутствие элемента во множестве
        System.out.println("integers.contains(100): "  + integers.contains(100)); // false
        System.out.println("integers.contains(32): "  + integers.contains(32)); // true

        /*
        int size() - кол-во элементов в сет-е
        boolean isEmpty() - возвращает true, если сет не содержит элементов
        clear() - удаляет все элементы
         */

        System.out.println("==========================\n");
       //  System.out.println(integers[2]); в set-ах НЕ поддерживается индексация

        // iterator() - возвращает итератор для элементов сет-а
        // Наличие итератора позволяет последовательно перебирать все элементы множества циклом for-each

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        for (Integer val : integers) {
            System.out.print(val + ", ");
        }
        System.out.println();

        // Убрать дубликаты
        // Написать метод, который принимает список и возвращает список,
        // состоящий только из уникальных элементов начального списка

        System.out.println("startValues: " + startValues);

        List<Integer> result = getUniqueList(startValues);
        System.out.println("getUniqueList: " + result);

        System.out.println("==========================\n");

        /* SortedSet - расширяет интерфейс Set
        Элементы упорядочены (отсортированы) в соответствии с их естественным порядком (если реализован Comparable)
        или в соответствии с компаратором, переданным при создании

        SortedSet конструкторы
        Пустой - Естественный порядок сортировки     */
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое, упорядоченное множество. Сортировка по Comparable

        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);

        System.out.println(sortedSet);

        // Принимает коллекцию. Создает set из элементов коллекции. Сортировка в естественном порядке
        sortedSet = new TreeSet<>(startValues);
        sortedSet.add(10);
        System.out.println(sortedSet);

        // Конструктор с компаратором, определяющим порядок сортировки
        sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(startValues);
        sortedSet.add(10);
        System.out.println(sortedSet);

        System.out.println("=================\n");
        sortedSet = new TreeSet<>((i1, i2) -> Integer.compare(i1, i2));
        sortedSet.addAll(startValues);
        System.out.println(sortedSet);

        SortedSet<Integer> set1 = sortedSet.headSet(15);
        System.out.println("set1: " + set1);
        System.out.println(sortedSet.tailSet(15));

        // comparator()
        // если используется естественный порядок - вернет null

        homework("Тестовая.      778%  строка,  со словами!");





    }

    private static void homework(String testStr) {
        // Заменить все НЕ-буквы на пустоту
        // заменить символ, который не является буквой, цифрой или пробелом на "" (пустоту)
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        System.out.println(newString);

        String str = String.join(" ", "Hello", "Java", "Test");
        System.out.println("str: " + str);

        // s+ - "пробельный символ" в количестве 1шт или более -- " ", "  "
        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array ) - преобразует массив в список (List)
        List<String> wordList = Arrays.asList(words);
        System.out.println(wordList);



    }

    private static <T> List<T> getUniqueList(List<T> list) {
        // Создать коллекцию, состоящую из уникальных элементов списка list (убрать дубликаты) = Set
        // P.S. Позаботиться о сохранении порядка элементов изначального списка
        Set<T> set = new LinkedHashSet<>(list);

        // Преобразовать set в список и вернуть из метода
        return new ArrayList<>(set);
    }
}
