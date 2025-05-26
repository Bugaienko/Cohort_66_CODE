package lesson_29.autopark;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.05.2025
 */

/*
Ассоциация - это связь, при которой один объект связан с другим объектом

Агрегация - это форма ассоциации, представляющая собой отношение "часть-целое",
где часть может существовать независимо от целого

Композиция - это более жесткая форма агрегации (также отношение "Часть-целое"),
НО где часть не может существовать без целого.
Обычно, часть создается вместе с целым.
Если целое уничтожается, часть также уничтожается (жизненные циклы объектов)

Ассоциация (в том числе и Агрегация, и Композиция) на практике реализуется через создание
 ссылок в классе на другие объекты.
Это значит, что класс содержит поля, которые хранят ссылки на объекты других классов.

Ассоциация - это отношение между двумя классами, где один класс используется другой класс
в качестве одного из своих полей.

Автобус содержит Водителя. Autobus has-a Driver
HAS-A. Агрегация. Водитель может существовать независимо от автобуса

Автобус содержит автопилот.
HAS-A. Композиция. Автопилот является неотъемлемой частью автобуса.
Жесткая / неразрывная связь. Часть создается вместе с целым

Важные аспекты ассоциации.

Кардинальность связи. Определяет, сколько объектов одного класса может быть ассоциировано с объектом другого класса.
One-to-One (один к одному), One-to-Many (Один ко многим), Many-to-Many (многие ко многим)

1 : 1 -> Автобус и двигатель
Каждый автобус может иметь ровно один двигатель. И на каждый двигатель приходится ровно один автобус.

1 : Many -> Автобус и список пассажиров
Один автобус имеет множество пассажиров. Один пассажир - в одном автобусе.

Many : Many -> Список автобусов и список автобусных остановок
Каждый автобус останавливается на множестве остановок
На каждой остановке может обслуживаться множество автобусов


Направленность связи.
Ассоциация может однонаправленной или двунаправленной.

В однонаправленной ассоциации один класс знает о другом, но не наоборот.
В двунаправленной связи оба класса знают друг о друге (имеют ссылки друг на друга в полях)





 */


public class Autobus {
    private static int counter = 1;

    // Уникальный идентификатор объекта
    private final int id;

    private BusDriver driver; // агрегация (мягкая связь)
    private Autopilot autopilot; // композиция (жесткая связь)

    private final Passenger[] passengers;

    private final int capacity;
    private int countPassengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        // поддержка двунаправленности связи
        this.driver.setAutobus(this);

        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        // Хоть и создается в конструкторе, связь мягкая.
        this.passengers = new Passenger[capacity]; // создание сидений для пассажиров
    }

    // TODO переписать, используя StringBuilder
    @Override
    public String toString() {
        return "Autobus: {" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", capacity=" + capacity +
                ", countPassengers=" + countPassengers +
                '}';
    }

    // Композиция. Автобус управляет состоянием автопилота.
    public void updateAutopilotSoftware(String newVersion) {
        this.autopilot.setSoftwareVersion(newVersion);
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        /*
        1. Надо проверить свободное место
        2. Находится ди уже этот пассажир в автобусе
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем кол-во пассажиров
            3.3. Возвращаем true
        4. Иначе (3.3) - что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */
        if (countPassengers < capacity) {
            //Место есть
            // Надо проверить пункт 2.
            if (isPassengerInBus(passenger)) {
                // метод вернул true, значит пассажир в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n",
                        passenger.getId(), this.id);
                return false;
            }

            // Садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;

            System.out.printf("Пассажир с id %d совершил посадку в автобус с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }

        // Свободного места в автобусе нет
        System.out.printf("В автобусе с id %d свободных мест нет!\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                // id совпали - значит это один и тот же объект
                return true;
            }
        }

        // пассажира с таким id нет в массиве пассажиров
        return false;
    }

    public void showListPassengers() {
        // [{}, {}, {}]

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }

        System.out.println(sb.toString());
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        // у текущего водителя "отключить" автобус
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
