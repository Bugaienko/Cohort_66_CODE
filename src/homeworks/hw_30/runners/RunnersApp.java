package homeworks.hw_30.runners;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.05.2025
 */

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человеку нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам


 */

public class RunnersApp {

    public static void main(String[] args) {
        Human human = new Human();
        human.run();

        AmateurRunner amateurRunner = new AmateurRunner();

        amateurRunner.run();

        ProfRunner prof = new ProfRunner();
        prof.run();

        System.out.println("==============\n");

        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = amateurRunner;
        humans[2] = prof;

        for (int i = 0; i < humans.length; i++) {
            humans[i].run();
            System.out.println("============");
        }
    }
}
