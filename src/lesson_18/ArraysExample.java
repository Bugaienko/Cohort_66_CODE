package lesson_18;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.05.2025
 */

public class ArraysExample {
    public static void main(String[] args) {

        int x; // Объявление переменной
        x = 10; // присвоение значения

        int[] array; // Объявление массива целых чисел
       // int array1[]; // Альтернативный способ. НЕ РЕККОМЕДУЕТСЯ использовать.
        String[] strings; // Объявляем массив строк

        array = new int[4]; // создали (инициализировали) массив типа int с 4 ячейками
        strings = new String[10]; // Создаем массив строк на 10 ячеек

        int[] array2 = new int[8]; // Объявление и инициализация массива int с 8 ячейками
        boolean[] bools = new boolean[3];

        /*
        Значение по умолчанию для типа данных.
        1. Для всех числовых примитивных типов (в том числе char) это будет 0 (0.0)
        2. Для boolean - false
        3. Для всех ссылочных типов данных (в том числе String) - null. (null - ничто / пустота)
         */

        // Получить из массива значение, находящееся в ячейке с определенным индексом
        int value = array2[4]; // получение значения по индексу - в данном случае 4
        System.out.println("array2[4]: " + value); // 0
        System.out.println("array2[7]: " + array2[7]); // 0
        System.out.println("bools[1]: " + bools[1]); // false
        System.out.println("strings[5: " + strings[5]); // null

        String str1 = null; // Ссылка не хранит в себе какой-либо адрес в памяти. Ссылка указывает на пустоту.
        System.out.println(str1);

        System.out.println("===============\n");

        // Явная инициализация массива значениями

        // Будет создан массив размером = кол-ву элементов в фигурных скобках. Ячейки будут заполнены значениями из скобок
        int[] numbers = new int[]{45, 56, -16, 0, 159};
        // Сокращенная форма явной инициализации
        int[] ints = {-10, 54, 32333, 4445}; // Будет создан массив целых чисел на 4 ячейки и заполнен этими значениями

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        System.out.println("x: " + x);
        // Распечатать все значения в массиве так не получится
        System.out.println("numbers: " + numbers); // Получим ссылку на адрес в памяти Heap (где хранятся значения)

        int len = numbers.length; // длина массива (кол-во ячеек в массиве)
        System.out.println("numbers.length: " + len);

        // Индексы массивы
        /*
        1. Индексация начинается с 0
        2. Максимальный индекс всегда равен длина массива минус 1
         */

        // Присвоение нового значения в ячейку по индексу
        numbers[2] = 100; // в ячейку с индексом 2 записать значение 100

        // Перебрать все индексы в цикле
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();

        System.out.println("===============\n");

        // Создать массив на 10 элементов и заполнить его случайными числами от 0 до 100 включительно

        /*
        1. Создать массив на 10 элементов.
        2. Перебрать все ячейки (все индексы) и в каждую записать случайное число от 0 до 100
         */

        Random random = new Random();

        int[] nums = new int[10];

        i = 0;
        System.out.print("[");
        while (i < nums.length){
            nums[i] = random.nextInt(101);
            System.out.print(nums[i] + ", ");

            i++;
        }
        System.out.println("]");

        // Найти минимальное значение в массиве

        int min = nums[0];
        i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }

        System.out.println("Минимальное значение: " + min);






    }

}
