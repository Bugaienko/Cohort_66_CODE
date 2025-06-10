package lesson_37;


/**
 * @author Sergey Bugaenko
 * {@code @date} 06.06.2025
 */

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person("email@test.com.ua", "password");

        System.out.println(person);

        person.setPassword("SQWE4qw#ert");

        System.out.println(person);

    }
}
