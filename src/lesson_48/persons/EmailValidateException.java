package lesson_48.persons;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.06.2025
 */

// extends RuntimeException = для НЕ-проверяемых исключений
// extends Exception - проверяемое исключение
public class EmailValidateException extends Exception {

    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - строковое представление исключения
    printStackTrace() - выводит трассировку исключения
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Email validate exception | " +  super.toString();
    }
}
