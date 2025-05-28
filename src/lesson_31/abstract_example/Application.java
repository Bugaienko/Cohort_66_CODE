package lesson_31.abstract_example;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.05.2025
 */

public class Application {

    public static void main(String[] args) {

        //  Нельзя создать объект абстрактного класса
//         Animal animal = new Animal();
       // Dog dog = new Dog();

        Cat cat = new Cat();
        cat.move();
        cat.sayHello();

        System.out.println("===========\n");

        Animal animal = new Cat();
        animal.move();
        animal.eat();




    }
}
