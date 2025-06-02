package lesson_32.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

// Множественная реализация интерфейсов
public class Duck implements Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

// В Java НЕТ множественного наследования
// class B extends A; A extends C; != class B extends A, C
