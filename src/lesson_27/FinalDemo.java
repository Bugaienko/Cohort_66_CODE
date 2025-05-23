package lesson_27;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.05.2025
 */

/*
Ключевое слово final
Оно может быть применено к классам, члена классов (полям, методам),
переменным (в том числе к параметрам методов)
 */

public class FinalDemo {

    // Для примитивных типов данных, помеченных как final
    // После инициализации (присвоения первого значения)
    // - изменить значение в переменной будет нельзя
    private final int capacity;

    // Ссылочный тип данных. Нельзя изменить значение переменной (привязать новый объект)
    // Состояние объекта, который привязан, я могу изменить
    private final int[] ints = new int[5]; // [0, 0, 0, 0, 0]

    private int notFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // Нельзя изменить значение final переменной
        // this.capacity++;

        // Нельзя присвоить ссылку на другой объект или null
//        this.ints = new int[2];

        // Но можно изменить состояние объекта
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }


    // Параметры метода тоже можно пометить как final
    // Внутри метода невозможно изменить значение этой переменной
    public void finalArguments(final int x, final int[] array) {
        // нельзя изменить х
        // x++;

        // не могу присвоить ссылку на новый объект
        // array = new int[10];

        // Могу изменять состояние объекта
        array[0] = x;
        array[1] = 1000;
    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }



    // Сеттеры для финальных полей не генерируются
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
}
