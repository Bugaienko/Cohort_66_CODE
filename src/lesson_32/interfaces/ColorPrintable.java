package lesson_32.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

// Интерфейс расширяет другой интерфейс.
public interface ColorPrintable extends Printable {

    // Дочерний интерфейс наследует все методы родительского.
    void colorPrint();

}
