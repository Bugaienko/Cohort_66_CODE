package homeworks.hw_17;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.05.2025
 */

/*
Task 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */

public class Task2 {
    public static void main(String[] args) {

        int j = 1;
        while (j < 11) {
            System.out.println("Task" + j++);
        }


    }
}
