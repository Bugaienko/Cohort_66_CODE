package lesson_25.persons;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.05.2025
 */

public class PersonApp {
    /*
    Массив объектов (массив ссылочных типов данных
    Массив, элементы которого являются ссылками на объекты
     */


    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");

        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");

        System.out.println(john.toString());

        // Массив объектов
        Person[] people = new Person[5]; // Создаю массив для 5 ссылок на объекты типа Person

        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("=================\n");

        System.out.println("people[0]: " + people[0].toString());
        System.out.println(people[0].getName());

        people[0].setName("Peter");
        System.out.println("garry: " + garry.toString());
        System.out.println("people[0]: " + people[0].toString());

        System.out.println("============ for =========== \n");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println("name: " + people[i].getName());
                System.out.println();
            } else {
                System.out.println("NULL!!!");
                System.out.println();
            }
        }

        System.out.println("\n======================");

        Person test = new Person("Test", 50, "coding");
        people[2] = test;
        people[2].setName("Test1");
        test.setAge(52);

        System.out.println(test.toString());
        System.out.println(people[2].toString());

        test = null;
        System.out.println(people[2].getHobby());

        test = people[1];

        Person deleteMe = new Person("DeleteMe", 100, "nothing");

        deleteMe = null;








    }
}
