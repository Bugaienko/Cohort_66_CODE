package homeworks.hw_31.shapes_abstract;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class ShapesApp {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Triangle(3, 4, 5);

        double sumArea = 0;
        double sumPerimeters = 0;

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].area();
            double perimeter = shapes[i].perimeter();

            System.out.printf("%s: are= %.2f, Perimeter= %.2f\n",
                    shapes[i].getClass().getSimpleName(), area, perimeter);
            sumArea += area;
            sumPerimeters += perimeter;
            System.out.println("=====================\n");
        }

        System.out.printf("Сумма площадей: %.2f\n", sumArea);
        System.out.printf("Сумма периметров: %.2f\n", sumPerimeters);

        System.out.println("===================\n");

        Circle circle = new Circle(-10);

        System.out.println(circle);

        Rectangle rectangle = new Rectangle(-5, 4);

        System.out.println(rectangle);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

//        Невозможно создать объект - нет публичных конструкторов
//        CircleSingleTone single3 = new CircleSingleTone();

//        CircleSingleTone single = CircleSingleTone.getInstance();
//        System.out.println(single);

//        CircleSingleTone single2 = CircleSingleTone.getInstance();
//        System.out.println(single2);

        CircleSingleTone singleTone = CircleSingleTone.getInstance(-10);

        System.out.println(singleTone);



    }
}
