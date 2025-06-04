package homeworks.hw_32.task1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.

Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.

Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class App {
    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete();
        triathlete.run();
        triathlete.swim();

    }
}
