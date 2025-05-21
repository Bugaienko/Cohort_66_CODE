package homeworks.hw_24;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.05.2025
 */

public class HW24 {
    public static void main(String[] args) {

        int[] ints = {10, 20, 30, 40, 50};

        MagicArrayHW24 magicArray = new MagicArrayHW24(ints);

        magicArray.add(60);

        System.out.println(magicArray.toString());

        System.out.println(magicArray.indexOf(30));
        System.out.println(magicArray.indexOf(500));

        System.out.println(magicArray.removeByValue(30));
        System.out.println(magicArray.toString());
        System.out.println(magicArray.size());

        System.out.println(magicArray.removeByValue(1000));
        System.out.println(magicArray.toString());

        int[] result = magicArray.toArray();

        System.out.println(Arrays.toString(result));

        printArray(result);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
