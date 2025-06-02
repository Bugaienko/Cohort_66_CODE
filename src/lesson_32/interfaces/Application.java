package lesson_32.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class Application {

    public static void main(String[] args) {

        Book book = new Book("Мастер и маргарита", "М.Булгаков");
        book.print();

        Journal journal = new Journal("Cosmopolitan", 154);

        journal.print();

        book.defaultMethod();
        journal.defaultMethod();

        // Тип ссылки - должен быть интерфейсный.
        // Набор методов, доступных по ссылке - методы, которые прописаны в интерфейсе.
        // Объект класса, который реализовал данный интерфейс.
        Printable printable = journal; // Неявное автоматическое приведение типа ссылки

        Printable printable1 = new Book("Философия Java", "Б.Эккель");

        printable1.print();

        Printable.testStaticMethod("Hello!");

        System.out.println("константа интерфейса: " + Printable.STATUS);

        System.out.println("==============\n");

        ColorPrintable presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP"
        );

        presentation.colorPrint();
        presentation.defaultMethod();
        presentation.print();
        System.out.println(ColorPrintable.STATUS);

        System.out.println("==============\n");
        testLink(presentation);


    }

    public static void testLink(Printable printable) {
        printable.print();
    }
}
