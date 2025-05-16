package lesson_16;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.05.2025
 */

public class TernaryOperator {

    public static void main(String[] args) {

        // введите ваш возраст

        int age = 20;

        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else  {
            status = "Ребенок";
        }

        System.out.println(status);

        /*
        Тернарный оператор - это краткая форма условного оператора if-else,
        которая позволяет присваивать значение переменной или выполнять какое-то действие в зависимости от условия

        переменная = (условие) ? значение_если_True : значение_если_False

         */


        status = (age >= 18) ? "Значение true" : "Значение false";
        //  (age >= 18) ? "Значение true" : "Значение false"; ->
        // true ->  status = "Значение true";
        // false ->  status = "Значение false";

        System.out.println("status: "+ status );

        System.out.println("===============\n");

        // Введите число
        int x = 20;
        System.out.println("Значение в переменной х " + "положительное / отрицательное");

        String res;

        if (x >= 0) {
            res = "положительное";
        } else {
            res = "отрицательное";
        }

        System.out.println("Значение в переменной х " + res);
        System.out.println("Значение в переменной х " + (x >= 0 ? "положительное" : "отрицательное"));








    }
}
