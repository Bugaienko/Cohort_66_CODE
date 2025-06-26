package homeworks.hw_48.persons;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.06.2025
 */

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {
        // Валидация email

        //
        if (email == null) throw new EmailValidateException("email should be not null");

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt < 0 || indexAt != lastAt) throw new EmailValidateException("@ error");

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        // После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() -2) throw new EmailValidateException("last . error");

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
            if (!isPass) throw new EmailValidateException("Illegal symbol -> " + ch);
        }

        //  5. До собаки должен быть хотя бы один символ, т.е. индекс @ не должен быть равен 0
        if (indexAt == 0) throw new EmailValidateException("@ should be not first");

        // 6. Первый символ - должна быть буква. Символ с индексом 0 - должен быть буквы
        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

        // Все проверки пройдены. Email подходит.
    }

    public static void validatePassword(String password) throws PasswordValidateException {

        if (password == null || password.length() < 8) throw new PasswordValidateException("wrong length");

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

//        System.out.printf("%s -> d:%s | u:%s | l:%s | s:%s\n",password, isDigit, isUppercase, isLowercase, isSpecialSymbol);

        // Если хотя бы одна из переменных останется в значении false,
        // то весь пароль НЕ будет признать валидным (надо вернуть false)

        if (!isDigit) throw new PasswordValidateException("should be a digit in password");
        if (!isLowercase)  throw new PasswordValidateException("should be a lower case letter in password");
        if (!isUppercase)  throw new PasswordValidateException("should be a upper case letter in password");
        if (!isSpecialSymbol)  throw new PasswordValidateException("should be a special symbol in password");

    }
}
