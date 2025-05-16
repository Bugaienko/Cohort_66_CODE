package homeworks.hw_20;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.05.2025
 */
/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива.

Метод должен создать и распечатать массив заданной в параметрах длинны.

В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода


 */

public class Task1 {
    public static void main(String[] args) {

        int[] test = {0, 1, 2, 3, 4, 5, 6};

        copyOfArray(test, 0);

    } // Method area

    public static void copyOfArray(int[] array, int newLength) {

        if (newLength < 0) {
            // return в void методах - прекращает работу метода. Ничего не возвращает
            System.out.println("[]");
            return;
        }

        int[] result = new int[newLength]; // [0, 0, 0]

        for (int i = 0; i < array.length && i < newLength; i++) {
            result[i] = array[i];
        }

        // Arrays
        String arrayToString = Arrays.toString(result);
        System.out.println(arrayToString);
    }


} // Class
