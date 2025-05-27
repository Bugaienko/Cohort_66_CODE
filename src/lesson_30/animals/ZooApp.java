package lesson_30.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

public class ZooApp {

    public static void main(String[] args) {


        Cat cat = new Cat();

        cat.voice(); // унаследован от Animal
        cat.eat(); // метод класса Cat

        System.out.println("==============\n");

        Dog dog = new Dog();

        // Метод унаследован от Animal
        dog.voice(); // Если в потомке не переопределен метод родителя,
        // то будет вызвана реализация метода, прописанная в классе-родителе

        Hamster hamster = new Hamster();

        hamster.voice();

        // Класс Object является родителем ВСЕХ классов в Java,
        // если явно не указан другой родитель

        Object object = new Object();

        String str = "str: " + cat;
        System.out.println(str);

        System.out.println("==============\n");

        System.out.println(cat);

        System.out.println("dog: " + dog);




    }
}
