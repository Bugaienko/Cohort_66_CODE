package lesson_25;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.05.2025
 */

public class Cat {
    // ВСЕ поля класса должны быть закрыты модификатор private

    // пакет + в классах-наследниках
    protected String name;
    private int age;
    public int weight;
    // package default - только пакет
    double score;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Акссесоры -
    // Геттеры и сеттеры - специальные открытые метода для получения и изменения значений поля
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 20) {
            // я считаю входящие данные "не правильными"
            // Если входящий параметр меня не устраивает - прекращаю работу метода
            return;
        }
        this.age = newAge;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            // такое имя нас не устраивает. Не присваиваем его в поле
            return;
        }
        this.name = name;
    }


    public void sayMeow() {
        System.out.println("Meow! " + name);
        testPrivate();
    }

    private void testPrivate() {
        System.out.println("Private method!");
    }

    public void info() {
        System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
    }
}
