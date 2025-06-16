package homeworks.hw_36;

import lists.MyArrayList;
import lists.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.06.2025
 */

public class RectangleUtils {

    public static void main(String[] args) {
        MyList<Rectangle> rectangles = new MyArrayList<>();

        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
//        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);
        RectangleUtils.removeDuplicates2(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }

    public static void removeDuplicates(MyList<Rectangle> list, Rectangle rectangle) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(rectangle)) {
                list.remove(i);
                i--; // корректируем индекс после удаления (решение, если будут идти два дубликата рядом)
            }
        }
    }

    public static void removeDuplicates2(MyList<Rectangle> list, Rectangle rectangle) {
        while (list.remove(rectangle)) {
            // пустое тело
        }

//        while (list.contains(rectangle)) {
//            list.remove(rectangle);
//        }
    }
}
