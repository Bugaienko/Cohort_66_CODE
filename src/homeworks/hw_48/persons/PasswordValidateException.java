package homeworks.hw_48.persons;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.06.2025
 */

public class PasswordValidateException extends Exception{

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Password validate Exception | " +  super.getMessage();
    }
}
