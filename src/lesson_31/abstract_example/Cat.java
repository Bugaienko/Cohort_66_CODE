package lesson_31.abstract_example;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.05.2025
 */

public class Cat extends Animal{

    // Если у родителя есть абстрактные методы,
    // в потомке мы ОБЯЗАНЫ их реализовать

    @Override
    void move() {
        System.out.println("Кот передвигается");
    }

    @Override
    void eat() {
        System.out.println("Кот очень любит кушать");
    }
}
