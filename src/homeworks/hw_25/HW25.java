package homeworks.hw_25;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.05.2025
 */

public class HW25 {

    public static void main(String[] args) {

        MagicArrayEncapsulation magicArray = new MagicArrayEncapsulation();

        magicArray.add(1, 2, 3, 4, 5);

        System.out.println(magicArray.toString());

//        magicArray.array[3] = 1000;

//        magicArray.array = null;

//        magicArray.array[1] = 5;

//        magicArray.cursor = -5;

        magicArray.add(100);

        System.out.println(magicArray.toString());

    }
}
