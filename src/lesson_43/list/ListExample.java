package lesson_43.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.06.2025
 */

public class ListExample {
    public static void main(String[] args) {

        // Конструкторы

        // Конструкторы ArrayList
        List<Integer> list = new ArrayList<>(); // Создает пустой список (с начальной емкостью 10 элементов)
        list = new ArrayList<>(50); // Пустой список с указанной емкостью
        // Создает список, содержащий все элементы указанной коллекции (копирование элементов из другой коллекции)
        list = new ArrayList<>(List.of(1, -10, 0, 25, -100)); // Принимает коллекцию

        // Конструкторы LinkedList
        list = new LinkedList<>(); // Создает пустой список (внутрення реализация - двусвязный список)
        list = new LinkedList<>(List.of(1, -10, 0, 25, -100)); // Создает список, содержащий все элементы указанной коллекции


        // Методы интерфейса List

        // boolean add (E e) - добавляет элемент в конец списка
        list.add(1000);
        list.add(-100); // допускается дублирование значений в списке
        System.out.println("list: " + list);

        // void add(int index, E element) = добавляет элемент на указанную позицию (перед индексом index)
        list.add(3, 500);
        System.out.println("list: " + list);

        // E get(int index) - возвращает элемент по индексу
        int value = list.get(5);
        System.out.println("value : " + value);

        // E remove(int index) - удаляет элемент по индексу, возвращает старое значение
        System.out.println("list.remove(5): " +  list.remove(5));
        System.out.println("list: " + list);

        // boolean remove(Object o) - метод удаляет по значению (из интерфейса Collection) - принимает ссылочный тип данных
        System.out.println("list.remove(0): " + list.remove(Integer.valueOf(0)));
        System.out.println("list: " + list);

        // Поиск элемента по значению - как результат возвращает индекс
        // int indexOf(Object obj) - первое вхождения
        // int lastIndexOf(Object obj) - последнее вхождение

        System.out.println("list.indexOf(4000): " + list.indexOf(4000)); // -1 - значение не найдено
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));

        System.out.println("===================== sort ==================");
        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора

        list.sort((i1, i2) -> Integer.compare(i2, i1));
        list.sort(Comparator.reverseOrder());

        System.out.println("list: " + list);

        list.sort((i1, i2) -> Integer.compare(i1, i2));
        list.sort((i1, i2) -> i1.compareTo(i2));
        list.sort(Integer::compareTo);
        list.sort(Comparator.naturalOrder());

        System.out.println("list: " + list);

        List<Integer> sorted = sortByComparator(list, Comparator.naturalOrder());
        System.out.println("sorted: " + sorted);

        // List<E> subList(int idxFrom, int idxTo) - возвращает список из элементов,
        // между этими индексами. From - включительно, To - не включительно

        List<Integer> subList = list.subList(1, 5);
        System.out.println("subList(1, 5): " + subList);


    }

    public static List<Integer> sortByComparator(List<Integer> list, Comparator<Integer> comparator) {
        List<Integer> result = new ArrayList<>(list);
        result.sort(comparator);
        return result;
    }
}
