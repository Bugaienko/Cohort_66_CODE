package lesson_32.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class Airplane implements Flyable {


    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    public void takePassenger(){
        System.out.println("Пассажир, заходи!");
    }
}
