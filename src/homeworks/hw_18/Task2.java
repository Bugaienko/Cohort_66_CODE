package homeworks.hw_18;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.05.2025
 */

/*
Task 2
Дан массив целых чисел.

Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */

public class Task2 {
    public static void main(String[] args) {

        int[] array = {5, 6, -25, 0, 31, -15};

        int min = array[0];
        int minIndex = 0;


        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println("min: " + min + " -> idx: " + minIndex);
        System.out.println("max: " + max + " -> idx: " + maxIndex);

        // swap
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();





    }
}
