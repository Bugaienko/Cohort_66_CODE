package lesson_32.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class App {

    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        Boat boat = new Boat();
        Duck duck = new Duck();

        airplane.fly();

        boat.swim();

        duck.fly();
        duck.swim();

        System.out.println("================\n");

        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        // интерфейсная ссылка - не могу вызвать метод класса.
//        flyables[0].takePassenger();

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();

            // Проверим возможность приведения ссылки к типу "интерфейс"
            if (flyable instanceof Swimmable) {
                System.out.println("Могу привести этот объект к swimmable: " + flyables.getClass().getSimpleName());
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swim();
            } else {
                System.out.println("НЕ могу привести к swimmable: " + flyables.getClass().getSimpleName());
            }
            System.out.println("================\n");

            // Проверим возможность приведения ссылки к типу "класс"
            if (flyable instanceof Airplane) {
                System.out.println("Могу привести к классу Airplane: " + flyables.getClass().getTypeName());
                Airplane airplaneLink = (Airplane) flyable;
                airplaneLink.takePassenger();
            } else {
                System.out.println("Не могу привести к классу Airplane: " + flyables.getClass().getTypeName());
            }

            System.out.println("================\n");

        }

    }


}
