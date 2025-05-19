package lesson_24;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.05.2025
 */

public class LessonMain24 {

    public static void main(String[] args) {


//        int[] numbers = new int[10];

        MagicArray magicArray = new MagicArray();


        System.out.println(magicArray.toString());

        magicArray.add(10);
        magicArray.add(20);

        magicArray.add(30, 40, 50);
        magicArray.add(60, 70, 80, 90, 100, 200);

        System.out.println(magicArray.toString());

        System.out.println("size: " + magicArray.size());

        System.out.println("magicArray.get(0): " + magicArray.get(0));
        System.out.println("magicArray.get(10): " + magicArray.get(10));
        System.out.println("magicArray.get(100): " + magicArray.get(100));

        System.out.println(magicArray.toString());

        System.out.println("=======================\n");
        System.out.println("magicArray.remove(4): " + magicArray.remove(4));

        System.out.println(magicArray.toString());
        System.out.println(magicArray.get(4));
        System.out.println(magicArray.size());

        System.out.println(magicArray.remove(0));
        System.out.println(magicArray.toString());

        System.out.println(magicArray.size());
        System.out.println(magicArray.remove(8));
        System.out.println(magicArray.toString());

        System.out.println("=======================\n");
        System.out.println(magicArray.remove(-1));
        System.out.println(magicArray.toString());

        int index = magicArray.indexOf(6000);

        if (index != -1) {
            System.out.println("Значение было найдено. Я получил существующий в массиве индекс " + index);
        } else {
            System.out.println("Такое значение в массиве не найдено! " + index);
        }


    }
}

