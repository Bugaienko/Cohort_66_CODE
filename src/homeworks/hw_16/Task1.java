package homeworks.hw_16;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.05.2025
 */
/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1, 2 или 3: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        if (input == 1) {
            System.out.println("Один");
        } else if (input == 2) {
            System.out.println("Два");
        } else if (input == 3){
            System.out.println("Три!");
        } else {
            System.out.println("Число не является 1, 2 или 3-кой");
        }


    }

}
















