package lesson_32.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class Journal implements Printable {
    String name;
    int number;


    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }


    @Override
    public void print() {
        System.out.printf("Journal %s #%d\n", name, number);
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overriding default method");
    }
}
