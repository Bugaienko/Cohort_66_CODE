package lesson_30.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

public class Dog extends Animal {

    @Override
    public void voice() {
        // обращение к объекту родителя и вызов его реализации метода voice
        super.voice();
    }

    @Override
    public String toString() {
        // Я могу использовать реализацию родительского класса, если мне это нужно
        return super.toString() + " | Dog. Дополнение реализации родительского метода";
    }

    // Уникальный метод для класса Dog
    public void  bark() {
        System.out.println("Dog bark");
    }

}
