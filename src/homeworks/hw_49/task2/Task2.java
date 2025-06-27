package homeworks.hw_49.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.06.2025
 */

/*
Task 2
Дан файл с историей поступлений денег на счета пользователей за некий период времени:

Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:

less.txt

user2:1950
user3:1800

___
more.txt:

user1:5050
user4:2100
 */

public class Task2 {
    private static final int LIMIT = 2000;
    private static final File PATH = new File("src/homeworks/hw_49/task2");
    private static final String FILE_DATA = "data";
    private static final String FILE_LESS = "less.txt";
    private static final String FILE_MORE = "more.txt";

    public static void main(String[] args) {

        List<String> records = readData();
        System.out.println(records);

        Map<String, Integer> usersMap = listToMap(records);
        System.out.println(usersMap);

        writeFiles(usersMap);


    }

    private static void writeFiles(Map<String, Integer> users) {
        try (BufferedWriter less = new BufferedWriter(new FileWriter(new File(PATH, FILE_LESS)));
             BufferedWriter more = new BufferedWriter(new FileWriter(new File(PATH, FILE_MORE)));
        ) {

            for (Map.Entry<String, Integer> entry : users.entrySet()) {

                String dataToWrite = entry.getKey() + ":" + entry.getValue();

//                if (entry.getValue() < LIMIT) {
//                    less.write(dataToWrite);
//                    less.newLine();
//                } else {
//                    more.write(dataToWrite);
//                    more.newLine();
//                }

//                BufferedWriter writer;
//                if (entry.getValue() < LIMIT) {
//                    writer = less;
//                } else {
//                    writer = more;
//                }

                BufferedWriter writer = entry.getValue() < LIMIT ? less : more;
                writer.write(dataToWrite);
                writer.newLine();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Map<String, Integer> listToMap(List<String> records) {
        Map<String, Integer> users = new HashMap<>();

        for (String record : records) {
            // user1:2050
            String[] data = record.split(":");

            String name = data[0];
            int amount = Integer.parseInt(data[1]);

            // Если ключа не было -> put(name, amount); А если было: put(name, amount + oldValue)
            // put (name, ???)
            users.compute(name, (key, value) -> value == null ? amount : value + amount);
        }

        return users;
    }

    private static List<String> readData() {
        List<String> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(PATH, FILE_DATA)))) {

            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return records;
    }


}





















