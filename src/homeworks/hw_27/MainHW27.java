package homeworks.hw_27;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.05.2025
 */

public class MainHW27 {
    public static void main(String[] args) {

        double radius = 10.5;

        double area = Calculator_27.circleArea(radius);
        System.out.println("Area: " + area);

        System.out.println("Perimeter: " + Calculator_27.circlePerimeter(11.6));

        System.out.println("area -10: " + Calculator_27.circleArea(-10.5));
    }
}
