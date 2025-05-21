package lesson_26.init_blocks;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.05.2025
 */

public class StaticBlockDemo {

    // инициализация поля
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10; // Инициализация значения

    // Статический блок инициализации
    // В нем могут быть проинициализированные статические поля класса
    // (присвоены начальные значения статики)
    // Вызывается ровно один раз в момент загрузки класса в JVM
    // До вызова конструктора класса
    static {
        System.out.println("Static Block RUN");
        colors = new String[5];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

    // НЕ статический блок инициализации
    // Выполняется при КАЖДОМ создании объекта.
    // Вызывается до конструктора.
    {
        System.out.println("NON-static block RUN!");
        title = "Default title";
    }

    public StaticBlockDemo(int capacity) {
        System.out.println("Second constructor RUN!");
        this.capacity = capacity;
    }

    public StaticBlockDemo() {
        System.out.println("Empty constructor RUN!");
        capacity = 30;
    }

    public void info() {
        System.out.println("title:  " + title + ", capacity: " + capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
