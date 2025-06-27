package homeworks.hw_49;

import java.io.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.06.2025
 */

/*
Task 1
Дан файл text.txt:



Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt'
и скопировать в него все данные из файла 'text.txt'
 */

public class Task1 {

    public static void main(String[] args) {
        File path = new File("src/homeworks/hw_49");

        String inputFile = "text.txt";
        String outputFile = "copy.txt";


        // Создаю поток для чтения из файла
        try (FileReader fileReader = new FileReader(new File(path, inputFile));
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             // Создаю поток для записи в файл
             FileWriter fileWriter = new FileWriter(new File(path, outputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {


            // Считываю строки из файла в цикле (пока строки есть). Записываю каждую строку в новый файл
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
