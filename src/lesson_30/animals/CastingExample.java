package lesson_30.animals;

import lesson_29.autopark.BusDriver;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

/*
Объекты могут принадлежать одному классу и при этом могут быть приведены
к другому типу, ЕСЛИ между этими классами ЕСТЬ СВЯЗЬ наследования.
Это называется кастингом (casting)

Кастинг бывает двух видов:

- Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип родительского класса.
- Нисходящее преобразование (downcasting) -
 */

public class CastingExample {

    public static void main(String[] args) {

        // Восходящее преобразование происходит автоматически

        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу animal

        /*
        !!! Важно!
        Тип ссылочной переменной определяет:
        1. Список методов, который можно вызвать, обращаясь к этой переменной.
        2. Ссылки на объекты каких типов могут храниться в этой переменной.

        Ссылочная переменная может хранить объект своего класса или любого ребенка.
         */

        // Какая реализация будет взята - определяется ФАКТИЧЕСКИМ типом объекта
        animal.voice();

        // Метод eat не доступен к вызову на переменной типа Animal
        // animal.eat(); несмотря на то, что привязан объект типа Cat

        Animal animal2 = new Hamster(); // Неявное автоматическое преобразование Hamster к типу Animal

        // Сейчас объект Hamster. Своей реализации метода не имеет - предоставляет реализацию родителя
        animal2.voice();

        System.out.println("==============\n");

        Animal[] animals = new Animal[3];
        animals[0] = animal; // Cat
        animals[1] = animal2; // Hamster
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
            animals[i].voice();
            System.out.println("===============");
        }

        // Автоматическое преобразование объекта к типу параметра метода
        testAnimals(new Cat());
        testAnimals(new Dog());
        testAnimals(animal2);

        // Todo Нисходящее преобразование


    }

    public static void testAnimals(Animal animal) {
        // Animal animal = animals2;
        animal.voice();
    }
}
