package homeworks.hw_31.shapes_abstract;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class CircleSingleTone {

    private static CircleSingleTone instance;

    private double radius;

    /*
    private CircleSingleTone() {
    }

    public static CircleSingleTone getInstance() {

        if (instance == null) {
            System.out.println("Создаем объект!");
            instance = new CircleSingleTone();
        }

        return instance;
    }
     */

    private CircleSingleTone (double radius) {
        this.radius = radius;
    }

    public static CircleSingleTone getInstance(double radius) {
        if (radius < 0) return null;

        return new CircleSingleTone(radius);
    }

    public double getRadius() {
        return radius;
    }





}
