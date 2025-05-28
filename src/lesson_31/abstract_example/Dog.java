package lesson_31.abstract_example;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.05.2025
 */

// Если потомок реализовал НЕ все абстрактные методы родителя,
// то такой класс ДОЛЖЕН быть помечен как абстрактный

public abstract class Dog extends Animal{

    @Override
    void move() {
        System.out.println("Dog is moving");
    }
}
