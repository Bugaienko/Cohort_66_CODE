package lesson_46;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.06.2025
 */

public class StreamExample {

    /*
    Императивный стиль написания программ (Imperative)
    Определяет как выполнить задачу - пошаговые инструкции.

    Декларативный стиль (Declarative)
    Определяет ЧТО нужно сделать, без указания КАК это сделать.

    Stream API (Java 8 or higher) - мощный инструмент,
    позволяющий обрабатывать наборы данных (часто коллекции) в декларативном стиле.

    Позволяет обрабатывать наборы данных простым, понятным и компактным способом.
    Вместо обычных циклов, можно писать цепочки операций:
    фильтровать, сортировать, превращать в другой вид - и все это читаемо.

    Главное отличие от коллекций:
     - Коллекция - это хранилище данных (структура данных)
     - Stream - это поток данных, с которыми можно делать разные операции (без изменения исходной коллекции)

     Поток (Stream) данных - представляет собой последовательность элементов
     с возможностью поочередного получения элемента обратки. Стримы могут создаваться из различных источников.

     Коллекция - это источник данных для стрима.

     Pipeline - последовательность операций, выполняемых на потоке данных

     Промежуточные операции: Это операции, которые преобразуют поток в другой поток (возвращают поток).
     Промежуточных операций может быть много (больше одной)
     Ленивые вычисления!
     Стримы НЕ выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.


     Терминальные операции: Это операции, который запускают обработку элементов потока и закрывают поток
     (после выполнения терминальной операции - поток перестает быть доступным для дальнейших операций)
     Может быть ТОЛЬКО ОДИН терминальный метод.
     */


    /*
    ПРОМЕЖУТОЧНЫЕ (все возвращают Stream<>) : Фильтрация, Изменение данных, упорядочивание данных

    Stream<T> filter(Predicate<T> predicate) - останутся только те элементы, для которых предикат вернет true
    Остаются элементы, удовлетворяющие условию (отбрасываются НЕ удовлетворяющие)

    sorted() - сортирует поток в естественном порядке
    sorted(Comparator<T> comparator) - сортирует поток c использованием компаратора

    Stream<R> map (Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
    в том числе в другой тип данных

    Stream<T> peek (Consumer<T> action) - выполняет действие для каждого элемента потока.
    Как правило, не изменяющее элемент






    ТЕРМИНАЛЬНЫЕ - это сохранение результат обработки

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или другие СД

    void foreach(Consumer<T> action) - выполняет действие для каждого элемента потока.


     */


    public static void main(String[] args) {


//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
        task9();


    }

    private static void task9() {
        // создание стрима из Map

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        System.out.println("map: " + map);

    }

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null ,cat2, cat3, new Cat(null, 10, "red")};

        // Получить список кошек, имя которых длиннее 4 символов

        List<Cat> longCats = Arrays.stream(cats) // создаем стрим из массива
//                .filter(c -> c != null) // оставить в потоке только не null
//                .filter(c -> Objects.nonNull(c)) // оставить в потоке только не null
                .filter(Objects::nonNull) // оставить в потоке только не null

                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null

                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

        System.out.println("longCats: " + longCats);

        Objects.nonNull(null); // вернет true, если параметр НЕ null
        Objects.isNull(null); // вернет true, если параметр null

    }

    private static void task7() {
        List<Cat> cats = getListCats();

        // Вывести на экран имена котов, чей вес меньше 5
        // Вывести на экран котов, оставшихся в потоке после фильтрации

        Stream<String> stream = cats.stream()
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("peek: " + cat))
                .map(Cat::getName);

        // Терминальный метод. Запускает обработку и закрывает поток.
        stream.forEach(cat -> System.out.println("forEach: " + cat));
      /*
          peek() - промежуточный метод. Используется в основном для отладки. Не прерывает поток.
          foreach() - терминальный метод. Для выполнения действия с каждым элементом. Закрывает поток
      */

    }

    private static void task6() {
        List<Cat> cats = getListCats();

        // Получить список имен кошек, у которых имена короче 5 символов

        /*
        Классический
        Фильтрация в потоке должна выполняться как можно раньше. Эффективность
         */
        List<String> names = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("names: " + names);
        System.out.println("=========================\n");

        /*
        Читаемость кода
         */
        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println("names2: " + names2);
    }

    private static void task5() {
        List<Cat> cats = getListCats();

        /*
        Получить список имен кошек, чей вес больше 4
        Создать поток
        Оставить кошек, чей вес больше 4
        Изменить тип потока Cat -> name
        Собрать в список
         */

        List<String> names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(names);
    }

    private static void task4() {
        List<Cat> cats = getListCats();

        // Получить список имен всех кошек
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

//        List<String> names2 = new ArrayList<>();
//        for (Cat cat : cats) {
//            names2.add(cat.getName());
//        }

        List<String> names = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names);

        // Изначальная коллекция не изменяется
        System.out.println(cats);

    }

    private static void task3() {
        List<Cat> cats = getListCats();

        // Оставить котов с именем, длиннее 4 символов
        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // Пока не вызван терминальный метод - промежуточные не выполняются
        List<Cat> longNames = stream.collect(Collectors.toList());

        printCats(longNames);
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // список кошек с весом больше 4
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());
//        List<Cat> fatCats = catStream.toList(); // Java 17 or higher -> .collect(Collectors.toList()) = .toList()

        printCats(fatCats);

        // Повторно использовать "закрыты" поток нельзя. Закрытый - на котором уже был вызван терминальный метод.
//        Set<Cat> setCats = catStream.collect(Collectors.toSet()); // при запуске будет ошибка

    }

    private static void printCats(List<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("==========================================\n");
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }


    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, -10, 24);

        // Получить список, содержащий все положительные числа из исходного списка
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();

        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());

        System.out.println("result: " + result);

        // =======================

        // У всех коллекций есть метод .stream() создающий поток (Stream) из элементов коллекции.

        // -1, 12, 0, 5, 1, -15, -10, 24
        List<Integer> integerList = integers.stream() // создаю поток из элементов коллекции List
                .filter(num -> num > 0) // фильтрация элементов потока // 12, 5, 1, 24
                .sorted() // сортировка элементов в естественном порядке // 1, 5, 12, 24
                .collect(Collectors.toList()); // собираем элементы потока в коллекцию List

        System.out.println("list: " + integerList);

        System.out.println("Поток не изменяет источник данных: " + integers);

        // Pipeline
        // integers.stream().filter(i -> i > 0).sorted().collect(Collectors.toList());


    }
}
