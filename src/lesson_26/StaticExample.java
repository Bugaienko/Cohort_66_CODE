package lesson_26;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.05.2025
 */

/*
Статические члены класса имеют доступ (видят) ТОЛЬКО статический контент
 */

public class StaticExample {

    // non-static поле класса
    int x;

    // static поле класс
    static int staticY;

    // Статический метод
    public static void staticMethod() {
        // Статические методы видят ТОЛЬКО статические члены (поля и методы) класса:
        // x++; нет доступа к не-статическому полю
        staticY++; // доступ к статическому полю есть

        // можем вызывать ТОЛЬКО статические методы
        // nonStaticMethod();

        // Ключевое слово this не доступно в статик-методах.
        // this.x;
    }

    // НЕ-статический метод
    public void nonStaticMethod() {
        //  У нестатического метода есть доступ КО ВСЕМ членам класса
        x++; // не-статика доступа
        staticY++; // статика тоже доступна
        // можем вызывать статические и не-статические методы
        staticMethod();
    }


    // Метод main статический
    public static void main(String[] args) {
        // x = 10; // Ошибка компиляции. У статик метода нет доступа к НЕ-статик переменным / полям

        staticY = 10;
        System.out.println(staticY);


        // nonStaticMethod(); не могу вызвать не-статический метод без создания объекта
        StaticExample staticExample = new StaticExample(); // создаем объект класса
        staticExample.nonStaticMethod(); // я могу вызвать не-статик метод только используя ссылку на объект

        // Я могу вызвать статический метод БЕЗ создания объекта
        StaticExample.staticMethod();

        int sum = MathUtil.sumIntegers(1, 2, 5, 6, 7);
        System.out.println("Сумма чисел = " + sum);

    }


}
