package lesson_49.cats;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.06.2025
 */

public class CatsWriterReader {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>(
                List.of(
                        new Cat("Cat", 9, true),
                        new Cat("John", 2, true),
                        new Cat("Maria", 7, false),
                        new Cat("Boris", 4, true),
                        new Cat("Hanna", 6, false),
                        new Cat("Catty", 1, false),
                        new Cat("Max", 12, true)
                )
        );

        // Записать в файл список котов.
        // Прочитать из файла список котов

        File path = new File("src/lesson_49/cats/files");
        path.mkdirs();
        File file = new File(path, "cats.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // записать список кошек в файл
        writeCatsToFile(cats, file);

        //   считать (вернуть) из файла список кошек
        List<Cat> readCats = readCatsFromFile(file);

        readCats.forEach(System.out::println);

        System.out.println("===========\n");
        testReading(file);


    }

    private static List<Cat> testReading(File file) {
        List<Cat> cats = new ArrayList<>();

        // Прочитать из файла строки, создать объект кота, добавить в список

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            String line1;

            System.out.println((line = bufferedReader.readLine()));
            System.out.println((line1 = bufferedReader.readLine()));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cats;
    }


    private static List<Cat> readCatsFromFile(File file) {
        List<Cat> cats = new ArrayList<>();

        // Прочитать из файла строки, создать объект кота, добавить в список

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            /* Будем считывать строки из файла в цикле. Каждую строку записываем в переменную line.
            Считывать будем пока в файле есть строки = до тех пор, пока readline не вернет null
             */
            while ((line = bufferedReader.readLine()) != null) {
                // name|age|isMale = Maria|7|false
                Cat cat = parseCatFromStringLine(line);
                cats.add(cat);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cats;
    }

    private static Cat parseCatFromStringLine(String line) {
        // name|age|isMale = Maria|7|false
        String[] split = line.split("\\|");
//        System.out.println(Arrays.toString(split));

        Cat cat = new Cat(split[0], Integer.parseInt(split[1]), Boolean.valueOf(split[2]));
        return cat;
    }

    private static void writeCatsToFile(List<Cat> cats, File file) {

        // Удалим файл, если он существует
        if (file.exists()) file.delete();

        // Создаем файл. (Файл создастся, если его еще нет)
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Cat cat : cats) {
            // Открываю поток записи, ставим флаг, разрешающий дозапись в файл
            try (FileWriter fileWriter = new FileWriter(file, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                // name|age|isMale
                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine(); // перевод курсора на новую строку

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Запись в файл завершена!");


    }
}













