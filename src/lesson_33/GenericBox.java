package lesson_33;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

/*
Дженерики предоставляют возможность создавать класса, в которых типы данных задаются параметром

Мы создаем универсальный класс. И не указываем конкретный тип данных, с которым он работает.
Мы хотим определять тип данных при создании КАЖДОГО объекта

Дженерики работают только со ссылочными типами данных.
НЕ работают с примитивами
 */

// <T> - символ заполнитель. Синтаксис указывает, что класс обобщенный (дженерик),
    // способный работать с объектами любого типа, который будет указана в момент создания ОБЪЕКТА
public class GenericBox <T> { // T - type, E - element, K - key, V - value

    // Вместо конкретного типа данных используется символ-заполнитель
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
