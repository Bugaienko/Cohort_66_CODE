package lesson_31;

import lesson_30.animals.Animal;
import lesson_30.animals.Cat;
import lesson_30.animals.Dog;
import lesson_30.animals.Hamster;

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
- Нисходящее преобразование (downcasting) - преобразование объекта родительского класса обратно в тип дочернего
 */

public class CastingExample2 {

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

        // Нисходящее преобразование

        System.out.println("====== Нисходящее преобразование ========\n");

        int intX = 10;
        double doubleX = intX; // неявное автоматическое преобразование

        intX = (int) doubleX; // явное преобразование


        Animal animalD = new Dog(); // Upcasting - восходящее преобразование
     //   animalD.bark(); метод не доступен
        Dog dog = (Dog) animalD; // Downcasting - Явное нисходящее преобразование

        dog.bark();

        Animal animalCat = new Cat();

        // Если попытаться привести объект к неверному типу - будет ошибка компиляции - ClassCastException
//        Dog dog1 = (Dog) animalCat;
//        dog1.bark();

        // Мы можем проверить - можно ли привести объект к указанному типу
        if (animalCat instanceof Cat) {
            System.out.println("Animal is Cat");
            // Я могу безопасно привести объект к типу Cat
            Cat cat = (Cat) animalCat;
            //вызываю метод класса Cat
            cat.eat();
        } else {
            System.out.println("Animal is not Cat - downcasting failed!!!");
        }

        if (animalCat instanceof Dog) {
            System.out.println("Animal is Dog");
        } else {
            System.out.println("Animal is not Dog - downcasting failed!!!");
        }

        System.out.println("==============\n");

        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();
            System.out.println(currentAnimal.getClass().getName());
            // Можно проверить тип объекта для избежания ошибок перед downcasting
            if (currentAnimal instanceof Cat) {
                System.out.println("В ячейке массива " + i + " тип объекта Cat");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat();
            }

            if (currentAnimal instanceof  Dog) {
                System.out.println("В ячейке массива " + i + " тип объекта Dog");
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark();
            }
            System.out.println("==================\n");

        }




    }

    public static void testAnimals(Animal animal) {
        // Animal animal = animals2;
        animal.voice();
    }
}
