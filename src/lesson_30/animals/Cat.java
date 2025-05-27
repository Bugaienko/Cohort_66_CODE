package lesson_30.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

public class Cat extends Animal {

    // Уникальный функционал кота
    public void eat() {
        System.out.println("Cat eat");
    }

    // Переопределение родительского метода voice()
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!");
    }



}
