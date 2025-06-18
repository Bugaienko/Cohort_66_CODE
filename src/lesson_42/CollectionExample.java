package lesson_42;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.06.2025
 */

public class CollectionExample {

    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов
        // для всех расширяющих его интерфейсов (List, Queue, Set)

        // Это позволяет нам единообразно обрабатывать различные типы коллекций

        // Создадим коллекцию строк
        // Ссылка типа интерфейс -> набор доступных методов + ссылку на объект какого класса может хранить эта переменная
        // Справа мы можем объекты разных классов (получить разные реализации этого интерфейса)
        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true, если коллекция пустая
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add(T t) - добавляет элемент в коллекцию
        strings.add("Java");
        System.out.println("strings.add(\"Python\"): " + strings.add("Python"));

        // Переопределен метод toString для красивого вывода элементов коллекции
        System.out.println(strings);

        /* Статический метод .of() - метод есть в нескольких интерфейсах и классах JCF.
        Создает неизменяемую (нельзя удалить или добавить элементы) коллекцию из предоставленных элементов
        Доступен List, Set, Map
        Был введен в Java 9 (SDK 9 и выше)
         */

        Collection<Integer> integers = List.of(0, 1, 2, 3, 5, 6, 7);
        System.out.println("integers: " + integers);
       // integers.add(7); // Попытка изменить (модифицировать) такую коллекцию приведет к ошибке.

//        strings.add("Js");
//        strings.add("Ruby");

        // Методы addAll, removeAll, retainAll - это программная реализация операций над множествами из математики

        // addAll(Collection<? extends T> col) - добавит все элементы из указанной коллекции - СЛОЖЕНИЕ
        strings.addAll(List.of("JS", "Go Land", "Ruby"));

        System.out.println(strings);

        System.out.println("====================\n");
        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));
        System.out.println("colA: " + colA);

        // removeAll(Collection<? extends T> colB) - удаляет все элементы содержащиеся в коллекции B из коллекции вызова
        // colA.removeAll(colB) - Удаляет из А все элементы, которые содержит кол B (ВЫЧИТАНИЕ)
        Collection<Integer> colB = List.of(3, 2, 1, 10);
        colA.removeAll(colB);
        System.out.println(" colA.removeAll(List.of(3, 2, 1, 10)): " + colA);

        // ПЕРЕСЕЧЕНИЕ
        // retainAll(Collection<? extends T> colB) - оставляет в коллекции вызова только те элементы,
        // которые содержаться в коллекции B.
        // == Удаляет из А элементы, которые НЕ содержаться в В
        // colA.retainAll(colB) - оставляет в А только те элементы, которые также есть в В

        colA = new ArrayList<>();
        colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60));
        colB.addAll(List.of(20, 30, 40, 100));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);

        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);

//        colB.retainAll(colA);
//        System.out.println(" colB.retainAll(colA): " + colB);

        // boolean containsAll(Collection col) - Вернет true, если коллекция сдержит все элементы из colB
        System.out.println("colA.containsAll(List.of(20, 30): " + colA.containsAll(List.of(20, 30))); // true

        // boolean remove(Object obj) - удаляет элемент из коллекции. Вернет true если элемент был удален
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(20): " + colA.remove(20)); // Удалит одно значение (даже если элементов с таким значением несколько)
        // Если нужно удалить все вхождения colA.removeAll(List.of(20));

        System.out.println("colA : " + colA);

        // boolean contains(Object obj) - вернет true, если в коллекции есть элемент с таким значением
        System.out.println("colA.contains(\"Python\"): " + colA.contains("Python"));
        System.out.println("colA.contains(40): " + colA.contains(40));

        // clear() - удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA : " + colA);





    }
}
