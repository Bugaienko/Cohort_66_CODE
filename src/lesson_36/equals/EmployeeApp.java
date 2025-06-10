package lesson_36.equals;

import lists.MyArrayList;
import lists.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.06.2025
 */

public class EmployeeApp {
    public static void main(String[] args) {

        MyList<Employee> list = new MyArrayList<>();

        Employee employee = new Employee("Петр", "Петров", "21.10.2000");
        Employee employee1 = new Employee("Иван", "Иванов", "05.12.1990");
        Employee employee2 = new Employee("Иван", "Иванов", "15.01.2000");
        Employee employee3 = new Employee("Иван", "Иванов", "15.01.2000");
        Employee employee4 = new Employee(null, "Иванов", "15.01.2000");

        System.out.println("employee == employee: " + (employee == employee1)); // Сравниваем значения переменных (адреса объектов)

        // Если два объекта физически разные, даже сщ всеми одинаковыми значениями полей, оператор == вернет false
        System.out.println("employee2 == employee3: " + (employee2 == employee3)); //false

        // Метод equals предназначен для логического сравнения объектов по их содержимому
        // По умолчанию, метод equals в классе Object ведет себя как ==,
        // но мы можем переопределить его, чтобы сравнивать объекты по значениям их полей.
        System.out.println("employee2.equals(employee3): " + employee2.equals(employee3));
        System.out.println("employee2.equals(employee1): " + employee2.equals(employee1));

        System.out.println("============\n");
        System.out.println("employee4.equals(employee2): " + employee4.equals(employee2));
        System.out.println("employee3.equals(null): " + employee3.equals(null));

        System.out.println("======================\n");

        list.add(employee);
        list.addAll(employee1, employee2, employee3, employee4);

        for (Employee empl : list) {
            System.out.println(empl);
        }

        System.out.println("list.contains(employee2): " +
                list.indexOf(new Employee("Иван", "Иванов", "15.01.2000")));


    }
}
