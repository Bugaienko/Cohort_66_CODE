package homeworks.hw_27;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.05.2025
 */

/*
Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)
        научно исследовательский институт -> НИИ
        С использованием StringBuilder
 */

public class StringBuilderHW {
    public static void main(String[] args) {

        System.out.println(phareString());

    }

    public static String phareString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов: ");

        // trim() - убирает пробелы в начале и в конце строки, если они есть

        // "   H     ello world      !    "
//        System.out.println("   H     ello world    !    ".trim());

        String input = scanner.nextLine().trim();

        // ""
        if (input.isEmpty()) return "";

        // "Hello   World !"
        // \\s - пробельный символ, + говорит в количестве от 1 и больше: " ", "  ", "     "
        String[] words = input.split("\\s+");
        System.out.println("words: " + Arrays.toString(words));

//        String result = "";
       StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.isEmpty()) continue;
//            result += word.charAt(0);
            sb.append(word.charAt(0));
        }

//        return result.toUpperCase();
        return sb.toString().toUpperCase();
    }
}
