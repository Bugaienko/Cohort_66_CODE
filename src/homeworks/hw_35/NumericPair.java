package homeworks.hw_35;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.06.2025
 */
/*
Task 3: Обобщенный класс с ограничениями типов
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.


Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */

public class NumericPair <T extends Number , E extends Number> {
    private T first;
    private E second;

    public NumericPair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public Double sum() {
        return first.doubleValue() + second.doubleValue();
    }

    public static void main(String[] args) {

        int value = 20;
        // int автоматически может быть приведен к Integer
        // int автоматически НЕ может быть приведен к другой обертке (Double, Float, Long и т.д.)
        NumericPair<Integer, Double> intPair = new NumericPair<>(10, Double.valueOf(value));
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0

        double x = 5;
    }
}
