package lesson_33;

import lesson_23.Cat;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public class SimpleApp {

    public static void main(String[] args) {

        SimpleBox box = new SimpleBox(10);

        System.out.println(box);

        SimpleBox box1 = new SimpleBox(20);

        int sum = (int) box.getValue() + (int) box1.getValue();

        System.out.println("sum: " + sum);

        SimpleBox[] boxes = new SimpleBox[3];
        boxes[0] = box;
        boxes[1] = box1;
        boxes[2] = new SimpleBox("30");

        int sum1 = 0;
        for (int i = 0; i < boxes.length; i++) {
            sum1 += (int) boxes[i].getValue(); // надо преобразовать int
        }

        System.out.println("sum1: " + sum1);

        // Нет типобезопасности - могу передать в конструктор ВСЕ что угодно.
        SimpleBox any = new SimpleBox(new Cat());







    }
}
