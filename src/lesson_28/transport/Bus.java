package lesson_28.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.05.2025
 */

/*
extends - наследование. Bus наследуется от Vehicle
Bus is-a Vehicle -> Верно. Можно применить наследование
Smartphone is-a Vehicle -> НЕ верно. Применять наследование НЕЛЬЗЯ
 */

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // Если в конструкторе потомка нет явного вызова конструктора-родителя,
        // то автоматически будет вызван пустой конструктор родителя
//        super();
        // super - обращение к родительскому классу
        super(model, year); // вызов родительского конструктора, принимающего модель и год
        // Вызов конструктора родителя должен быть ПЕРВОЙ строкой исполняемого кода
        this.capacity = capacity;
    }

    // Так выглядит конструктор по умолчанию для класса-потока
//    public Bus() {
//        super(); // Вызов пустого конструктора родительского класса.
//    }


    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    // Метод посадки пассажира
    public boolean takePassenger() {
        // Проверить есть ли свободное место?
        // Если есть - посадить - увеличить кол-во пассажиров в автобусе
        if (countPassengers < capacity) {
            countPassengers++;
            // имею доступ в наследнике к полю родителя с модификатором protected
            System.out.println("Пассажир зашел в автобус " + model );
//            System.out.println("Пассажир зашел в автобус " + getModel() );
            return true;
        }

        // По сути с этой строчки начинается блок else
        // В эту строку кода я попаду только если условие if выдаст false

        System.out.printf("В автобусе %s больше мест нет. Сейчас %d пассажиров\n",
                model, countPassengers);
        return false;
    }

    // метод высадки пассажира из автобуса
    public boolean dropPassenger() {
        // TODO реализовать на выходных
        // Задача не уйти в минус по кол-ву пассажиров
        return false;
    }

}
