package lesson_43;

import java.util.ArrayList;
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

        // TODO indexOf, lastIndexOf, sort, subList


    }
}
