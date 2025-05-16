package homeworks.hw_20;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.05.2025
 */
/*
Task 3 * (Опционально)
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};

//        int[] primeArray = getArrayWithOnlyPrime(numbers);
//        System.out.println(Arrays.toString(primeArray));

        System.out.println(isPrime(10_000_019));
        System.out.println(isPrime2(10_000_019));

    }

    private static int[] getArrayWithOnlyPrime(int[] numbers) {
        // Считаем количество простых чисел
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }

        // Если простые числа не найдены - возвращаем пустой массив
        if (count == 0) return new int[0];

        // Создаю массив, где буду хранить только простые числа
        int[] result = new int[count];

        // Заполнить простыми числами


        for (int i = 0, idxPrime = 0; i < numbers.length && idxPrime < count; i++) {
            if (isPrime(numbers[i])) {
                result[idxPrime] =  numbers[i];
                idxPrime++;
            }
        }

        return result;

    }


    public static boolean isPrime(int number) {

        if (number <= 1) return false;
        int count = 0;
        for (int i = 2; i <= number - 1  ; i++) {
            count++;
            if (number % i == 0) return false;
        }

        System.out.println("V1 проверено делителей: " + count);
        // Когда перебрали все делители
        return true;
    }

    public static boolean isPrime2(int number) {
        if (number <= 1) return false;

        if (number == 2 || number == 3)  return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        int count = 2;

        for (int i = 5; i <= number -1 ; i += 6) {
            count++;
            if (number % i ==0 || number % (i + 2) ==0) return false;
        }

        System.out.println("V2 проверено делителей: " + count);
        return true;
    }
}
