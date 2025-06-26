package lesson_49;

import java.io.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.06.2025
 */

public class Task1 {

    public static void main(String[] args) {

        /*
        Выберите или создайте какую-то папку.
        Создайте в папке 10 файлов: test_1.txt, test_2.txt ... test_10.txt.
        В каждый файл запишите соответсвующую строку: Java1, Java2 ... Java10
         */

        File path = new File("src/lesson_49/fileIO/task1");
        path.mkdirs();

        for (int i = 1; i <= 10; i++) {
            File file = new File(path, "test_" + i + ".txt");

            try (FileWriter writer = new FileWriter(file)) {
                file.createNewFile();
                writer.write("Java" + i + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
        Проверьте все файлы в директории (получите список файлов, залезть в каждый, считать строку)
        Выведите в консоль имя файла, в котором содержится строка "Java7"
        // Output: test_7.txt
         */

        // Получить список файлов / директорий

        File[] files = path.listFiles();

        for (File file : files) {
            // Код чтения из каждого файла

            // Проверяем, что работаем с файлом, а не с директорией
            if (file.isFile()) {

                // открываю поток буферизированного чтения из файла
                try (FileReader fileReader = new FileReader(file);
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                    // Считываю строку из файла
                    String line = bufferedReader.readLine();

                    // Проверяю строку
                    if ( line!= null && line.contains("Java7")) {
                        System.out.println("Файл найден: " + file.getName());
                    }

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
