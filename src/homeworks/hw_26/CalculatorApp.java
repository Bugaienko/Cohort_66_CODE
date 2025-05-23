package homeworks.hw_26;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.05.2025
 */

public class CalculatorApp {

    public static void main(String[] args) {

        int x1 =  10;
        int x2 =  5;
        int result;

        System.out.println("add: " + Calculator.add(x1, x2));
        System.out.println("subtract: " + Calculator.subtract(x1, x2));
        System.out.println("multiply: " + Calculator.multiply(x1, x2));



        result = Calculator.divide(x1, x2);
        result = Calculator.divide(x1, 0);
        System.out.println("result = " + result );

        System.out.println("======================\n");

        double d1 = 10.0;
        double resD = d1 / 0;

        System.out.println("10.0 / 0 = " + resD);

        // Infinity -  бесконечность
        // NaN - значение не определено

        double inf1 = 1.0 / 0;
        double inf2 = 10000.0 / 0;

        System.out.println(inf1 + " | " + inf2);
        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);

        System.out.println(10.0 / 10.0);
        System.out.println(10.0 - 10.0);
        System.out.println(inf1 / inf2);

        System.out.println("inf1 - inf2 : " + (inf1 - inf2));
        System.out.println("inf1 + 10 : " + (inf1 + 10));
        System.out.println("inf1 * (-1) : " + (inf1 * -1));

        System.out.println(inf1 - 1500000000);
        System.out.println(inf1 * 2);

        if (inf1 == Double.POSITIVE_INFINITY) {
            System.out.println("Yes");
        }

        System.out.println("=================\n");
        int res = Calculator.divide(10, 2);
        double res1 = Calculator.divide(10.0, 4);

        System.out.println("int res = " + res );

        System.out.println("double res1 = " + res1);

        System.out.println("===============\n");
        System.out.println(Calculator.multiply(10.0, 3.0));

        System.out.println(Calculator.multiply(2, 5));







    }
}
