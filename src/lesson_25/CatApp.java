package lesson_25;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.05.2025
 */

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);

        cat.sayMeow();
        cat.info();

        // age имеет модификатор private - здесь "не виден"
        // cat.age = -1000;
        cat.weight = 1500;
//        cat.name = null;
        cat.score = 1000.0;

        cat.info();

        // приватный метод
        // cat.testPrivate();

        // Использование геттера
        int catAge = cat.getAge();
        System.out.println("Cat age: " + catAge);

        cat.setAge(50);
        cat.setAge(10);

        cat.setName("");
        cat.setName(null);
        cat.setName("Tom");
        cat.info();




    }
}
