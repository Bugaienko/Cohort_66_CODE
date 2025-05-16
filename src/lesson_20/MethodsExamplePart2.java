package lesson_20;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.05.2025
 */

public class MethodsExamplePart2 {

    public static void main(String[] args) {

        int temp = 55;
        changeMe(temp);
        System.out.println(temp); // 55

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);

        System.out.println("===============\n");

        int[] link = numbers;
        link[2] = -100;

        System.out.print("numbers: ");
        printArray(numbers);
        System.out.print("link:    ");
        printArray(link);

        // null - ничто - специальное значение, указывающее, что переменная не хранит ссылку на какой-либо объект. В переменной - отсутствие значения.

        numbers = null;
        // Нельзя взять 0-й элемент у "ничто"
        //numbers[0] = 10; // Ошибка возникает во время работы программы - NullPointerException - NPE

        // System.out.println(numbers.length); // Тоже NPE - нельзя узнать длину "ничто"
        System.out.println(numbers);
        if (numbers == null) {
            System.out.println("Я могу проверить наличие null в переменной");
        }

        link[7] = 0;
        printArray(link);

        numbers = new int[] {10, 20, 30};
        printArray(numbers);

        System.out.println("==============\n");
        String hello = "Hello";
        changeMe(hello);
        System.out.println(hello);

        hello = hello + "!!!";
        System.out.println(hello);
//        hello = null;




    } // Methods area

    public static void changeMe(String str) {
        System.out.println("method str start value: " + str);
        str = str.toLowerCase();
    }

    public static void changeMe(int[] array) {
        array[0] = 1000;
    }


    public static void changeMe(int x) {
        x = 100;
        int temp = 10000;
    }

    // Метод "красиво" выводит все элементы массива ЦЕЛЫХ ЧИСЕЛ
    public static void printArray(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) { // перебираю индексы массива
            System.out.print(ints[i] + (i == ints.length - 1 ? "]\n" : ", "));
        }
    }



} // end class
