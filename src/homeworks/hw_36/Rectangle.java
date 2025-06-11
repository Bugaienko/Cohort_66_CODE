package homeworks.hw_36;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.06.2025
 */

/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

length (длина) — тип double
width (ширина) — тип double

Требования:

Конструкторы:
Создайте конструктор, который инициализирует оба поля класса.
Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.
Методы:
Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle
в формате: "Прямоугольник [длина=..., ширина=...]".

Метод main():
В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().

 */

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник [ширина= %.2f, длина=%.2f]", width, height);
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(width);
        result = 31 * result + Double.hashCode(height);
        return result;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
