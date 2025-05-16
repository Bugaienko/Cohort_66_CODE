package homeworks.hw_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.05.2025
 */

/*
Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Task 2.1. * Опционально
Перегрузить метод, если в него приходит индекс,
то часть массива слева до этого индекса распечатывается в обычном порядке,
а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 */

public class Task2 {
    public static void main(String[] args) {

        int[] ints = {1, 4, 3, 6, 7};

        printReverseArray(ints, 2);

        printReverseArray(ints);

    } // Method area

    public static void printReverseArray(int[] array) {
        // Весь массив в обратной последовательности = распечатать в обратной последовательности
        // элементы начиная с 0 индекса

        printReverseArray(array, 0);
    }

    public static void  printReverseArray(int[] array, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ", ");
        }

        for (int i = array.length - 1; i >= index ; i--) {
            System.out.print(array[i] + (i != index ? ", " : "]\n") );
        }
    }


} // class
