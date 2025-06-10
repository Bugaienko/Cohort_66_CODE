package homeworks.hw_35;

import lists.MyArrayList;
import lists.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.06.2025
 */

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists,
который принимает два параметра типа MyList<T> и MyList<U>, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.

Пример использования:


 */

public class PrintLists {

    public static void main(String[] args) {
        MyList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);
    }

    public static <T, U> void printTwoLists(MyList<T> list1, MyList<U> list2) {
        // Вывожу элементы первого списка
        for (T element : list1) {
            System.out.println(element);
        }

        // Вывожу элементы второго списка
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
