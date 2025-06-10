package lesson_36.equals;

import java.util.Objects;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.06.2025
 */

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    /*
    Рефлексивность: Объект должен быть равен самому себе
    Симметричность: Если a.equals(b) возвращает true, то и b.equals(a) должно вернуть true.
    Транзитивность: Если a.equals(b) и b.equals(c), то a.equals(c) должно возвращать true
    Согласованность: Повторные вызовы equals() должны давать один и тот же результат, если объекты не изменились
    Сравнения с null: Любой объект должен корректно обрабатываться при сравнении c null
     */


//    @Override
//    // Чтобы изменить логику сравнения двух объектов на равенство, нам нужно переопределить метод equals
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // Ссылки ссылаются на один и тот же объект
//        if (!(obj instanceof Employee)) return false; // Проверка на возможность привести к Employee
//        Employee employee = (Employee) obj;
//
//        /* При таком сравнении возможно появление NPE
//        this.firstName.equals(employee.firstName)
//        null.equals(employee.firstName) -> аварийное завершение программы
//
//        return this.firstName.equals(employee.firstName)
//                && this.lastName.equals(employee.lastName)
//                && this.dateOfBirth.equals(employee.dateOfBirth);
//         */
//
//        // Безопасное сравнение объектов, учитывая возможность null значений
//        return Objects.equals(this.firstName, employee.firstName)
//                && Objects.equals(this.lastName, employee.lastName)
//                && Objects.equals(dateOfBirth, employee.dateOfBirth);
//    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(dateOfBirth);
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
