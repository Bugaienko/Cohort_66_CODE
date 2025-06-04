package homeworks.hw_32.task1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public class Triathlete implements Swimmer, Runner {

    @Override
    public void run() {
        System.out.println("Triathlete is running");
    }

    @Override
    public void swim() {
        System.out.println("Swimmer is swimming");
    }
}
