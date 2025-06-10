package lesson_37;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.06.2025
 */

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    test@email.com.n.et
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */

    private boolean isEmailValid(String email) {
        // Валидация email

        if (email == null) return false;

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt < 0 || indexAt != lastAt) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() -2) return false;

        /*
        Перебираю в цикле все символы строки. Проверяю каждый текущий.
        Если нахожу хоть один "не правильны" - сразу возвращаю false
         */

//        string.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {

            // Проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '.'
                    || ch == '@'
                    || ch == '_'
                    || ch == '-';


            // Если символ НЕ подходит - вернуть false.
            // Сделать действие, если переменная isPass == false
            if (!isPass) return false;
        }

        //  5. До собаки должен быть хотя бы один символ, т.е. индекс @ не должен быть равен 0
        if (indexAt == 0) return false;

        // 6. Первый символ - должна быть буква. Символ с индексом 0 - должен быть буквы
        if (!Character.isLetter(email.charAt(0))) return false;

        // Все проверки пройдены. Email подходит.
        return true;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;

        boolean isDigit = false;
        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявления переменных
        boolean[] result = new boolean[4]; // false, false, false, false

        String symbols = "#@$!%&*()[],.-";

        // Перебирать символы
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
//            if (Character.isDigit(ch)) result[0] = true;
            if (Character.isUpperCase(ch)) isUppercase = true;
            if (Character.isLowerCase(ch)) isLowercase = true;
            if (symbols.indexOf(ch) >= 0 ) isSpecialSymbol = true;
//            if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;
        }

        System.out.printf("%s -> d:%s | u:%s | l:%s | s:%s\n",password, isDigit, isUppercase, isLowercase, isSpecialSymbol);

        // Если хотя бы одна из переменных останется в значении false, то весь пароль НЕ будет признать валидным (надо вернуть false)
        return  isDigit && isUppercase && isLowercase && isSpecialSymbol;
    }

    /*
    Требования к паролю:
    1. Длина пароля >= 8
    2. Должна быть мин 1 большая буква
    3. Должна быть мин 1 маленькая буква
    4. Должна быть мин 1 цифра
    5. Должна быть мин 1 специальный символ: "#@$!%&*()[],.-"

    Пароль должен удовлетворять ВСЕМ требованиям сразу.
    Для каждого пункта завести булевую переменную (isUpperCase, isDigit и т.д)
    Пароль подходит только если ВСЕ четыре имеют значение true.

     Character.isUpperCase(ch);
     Character.isLowerCase(ch);
     Character.isDigit(ch);
     */

    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }



    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
