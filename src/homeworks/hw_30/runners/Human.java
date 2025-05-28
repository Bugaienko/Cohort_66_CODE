package homeworks.hw_30.runners;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.05.2025
 */

/*
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человеку нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class Human {

    private int runSpeed;
    private int restTime;

    protected String typeRunner = "Человек";

    public Human() {
        this(10, 15);
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч\n",typeRunner, runSpeed);
        rest();
    }

    public void rest() {
        System.out.printf("%s нужно %d минут для отдыха\n",typeRunner, restTime);
    }


    @Override
    public String toString() {
        return "Human {" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                '}';
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}
