package homeworks.hw_43;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.06.2025
 */

public class Task3 {
    public static void main(String[] args) {
        String string = "AAAabcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));

    }

    private static Character getFirstUniqueChar(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        // Перебираем символы в строке
        for (char ch : string.toCharArray()) {

            // Проверяем, присутствует ли текущий символ в сете повторов
            if (repeatedChars.contains(ch)) {
                continue; // если да, переходим к следующему символу
            }

            // Проверяем, присутствует ли он в сете уникальных
            if (uniqueChars.contains(ch)) {
                uniqueChars.remove(ch); // если да, убираем символ из уникальных
                repeatedChars.add(ch); // добавляем в повторяющиеся
            } else {
                uniqueChars.add(ch);
            }
        }

        System.out.println("repeated chars: " + repeatedChars);
        System.out.println("unique chars: " + uniqueChars);

        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

    }
}
