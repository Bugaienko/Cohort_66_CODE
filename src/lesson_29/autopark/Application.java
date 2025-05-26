package lesson_29.autopark;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.05.2025
 */

public class Application {

    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-122221112");
        System.out.println("driver info: " + busDriver.toString());

        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("Margo", "AR-45455454554");
        bus.setDriver(busDriver1);

        System.out.println(bus.toString());

        System.out.println("объект первого водителя вне автобуса: " + busDriver.toString());

        bus.updateAutopilotSoftware("AP-v0002");
        System.out.println(bus.toString());

        System.out.println("======== passengers ======== \n");
        Passenger john = new Passenger("John");
        Passenger mario = new Passenger("Mario");
        Passenger peter = new Passenger("Peter");

        System.out.println(john.toString());
        System.out.println(mario.toString());
        System.out.println(peter.toString());

        bus.showListPassengers();

        bus.takePassenger(john);
        bus.takePassenger(john);

        bus.takePassenger(mario);

        bus.takePassenger(peter);
        bus.takePassenger(peter);


        System.out.println("Кол-во пассажир: " + bus.getCountPassengers());
        bus.showListPassengers();

    }
}
