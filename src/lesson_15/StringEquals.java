package lesson_15;

/**
 * @author Sergey Bugaenko
 * {@code @date} 30.04.2025
 */

public class StringEquals {
    public static void main(String[] args) {

        int x = 10;

        // Ссылочный тип данных
        // В переменной ссылочного типа хранится ССЫЛКА на область в памяти, в которой находится объект типа String (значение)
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        // ВАЖНО! Оператор == сравнивает значения, которые хранятся в ПЕРЕМЕННЫХ.

        boolean check = str1 == str2;
        System.out.println("str1 == str2: " + check); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1 == str4: " + (str1 == str4)); // false
        System.out.println("str2 == str4: " + (str2 == str4)); // false

        System.out.println("\n ====================== \n");

        // ВАЖНО!!!
        // Для сравнения строк по их значению мы ДОЛЖНЫ использовать метод equals()
        boolean isEquals = str1.equals(str2);
        System.out.println("str1.equals(str2): " + isEquals); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // true
        System.out.println("str2.equals(str4): " + str2.equals(str4)); // true

        // Мы можем сравнивать значения строк игнорируя регистр букв  | J = j, J = J, j = j
        System.out.println("ignoreCase: " + "java".equalsIgnoreCase("JAVA"));

        String str5 = str1;
        str1 = "Java";



    }
}
