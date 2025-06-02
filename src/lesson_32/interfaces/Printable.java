package lesson_32.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

// Интерфейс содержит поведение, которое класс реализует.
public interface Printable {
    // Интерфейс = это совокупность абстрактных методов, задающих поведение
    // Интерфейс - косвенно абстрактный
    // Ключевое слово abstract присутствует по умолчанию в объявлении интерфейса

    // Если класс не реализовал все абстрактные методы интерфейса,
    // класс должен быть объявлен абстрактным

    // в интерфейсах могут быть определены публичные статические константы
    // public static final
    int STATUS = 1;

    // В интерфейсе НЕТ конструкторов

    // Все методы интерфейса косвенно (неявно и по умолчанию) и абстрактные, и публичные
    // public abstract
    void print();

    // Начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)
    default void defaultMethod() {
        System.out.println("Default method");
    }

    // Начиная с JDK 8 доступны статические методы
    static void testStaticMethod(String str) {
        System.out.println("Static method: " + str);
    }

    // С JDK 9 появились приватные методы (могут быть статическим и нестатическими)
    // Переопределить их в классе НЕВОЗМОЖНО
    private void privateMethod() {
        System.out.println("Private method");
    }
}
