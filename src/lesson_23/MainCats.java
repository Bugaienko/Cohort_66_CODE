package lesson_23;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.05.2025
 */

public class MainCats {

    public static void main(String[] args) {


        Cat cat = new Cat(); // Создание объекта класса Cat
        // 1. Физически в памяти создается объект типа Cat
        // 2. Вызывается конструктор класса для инициализации полей
        // 3. Поля объекта заполняются значениями

        /*
        При создании объекта класса все его поля инициализируются каким-то значением
        По умолчанию (Если не задано другое поведение),
        поля объекта инициализируются значениями пол умолчанию для своего типа данныч

        - для числовых примитивов -> 0 / 0.0
        - boolean -> false
        - для всех ссылочных (в том числе String) -> null
         */

        String str = "Java";
        // Тип ссылочной переменной определяет ровно две вещи
        // 1. Какие действия я могу совершить с этой переменной (набор доступных методов)
        // 2. Ссылка на какие типы объектов может быть сохранена в этой переменной




        cat.sayMeow();
        cat.sleep();
        cat.run();



        String catName = cat.name;
        System.out.println("Имя: " + catName);

        System.out.println("Возраст: " + cat.age);

        System.out.println("=======================\n");

        Cat cat1 = new Cat("Max");
        /*
        Будет создан новый объект класса Cat
        Имя (строка) которая была передана в конструктор
        будет присвоено в поле/свойство name этого объекта
         */

        System.out.println("cat1.name: "  + cat1.name);
        System.out.println("cat1.color: " + cat1.color);

        cat.info();
        cat1.info();

        System.out.println("=============\n");

        Cat cat2 = new Cat("Diamond", "red");

        cat2.info();

        Cat barsik = new Cat("Barsik", "white", 2);

        System.out.println("barsik.name: "  + barsik.name);
        barsik.info();

        Cat catClone = barsik;
        catClone.info();

        System.out.println("barsik.age = 100 =========== " );
        barsik.age = 100;
        barsik.info();
        catClone.info();

        System.out.println("=====================\n");
        catClone = new Cat("Kratos", "black", 66);
        catClone.info();
        barsik.info();

        catClone = null; // Нет привязки к объекту. null - ничто. Переменная не ссылается ни на какой объект
        // catClone.info();

        /*
        Если у переменной, значение которой null вызвать метод или получить свойство (обратиться к полю) -
        программа завершится аварийно (с ошибкой NullPointerException)

        У null нельзя вызвать метод, присвоить или получить значение поля - NPE
         */
//        System.out.println(catClone.name);

        if (catClone != null) {
            System.out.println(catClone.name);
            catClone.info();
        } else {
            System.out.println("В переменной хранится null");
        }


    }
}
