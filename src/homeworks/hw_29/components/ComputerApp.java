package homeworks.hw_29.components;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

/*
Task 2
Компьютер и компоненты

Создайте базовый класс Component с полями brand (бренд) и model (модель).

Создайте производные классы: Processor, Memory, Storage от класса Component.

Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.

Реализуйте отношения между Computer и компонентами.
Компоненты Processor и Memory не могу существовать без компьютера.
 */

public class ComputerApp {
    public static void main(String[] args) {

        Storage storage = new Storage("WD", "WD-1000");

        Computer computer = new Computer("LEN-5100", storage, 32);

        System.out.println(computer.toString());

        Storage storage2 = new Storage("Crucial", "C-1000");
        computer.setStorage(storage2);

        System.out.println(computer.toString());

    }
}
