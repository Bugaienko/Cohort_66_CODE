package lesson_49;

import java.io.*;
import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.06.2025
 */

public class FileIOExample {

    // Java IO (Input/Output)
    //java.io

    public static void main(String[] args) throws InterruptedException {

        // class File - абстракция для работы с файлами и директориями (создание, удаление, проверка свойств и т.д.)

        File pathDir = new File("files");
        File pathDir2 = new File("files/db/v1");

        // boolean mkdir() - создает директорию. Может создать только "конечную" директорию
        System.out.println(pathDir.mkdir());
        System.out.println(pathDir2.mkdir());

        // boolean mkdirs() - создает директорию, включая все необходимые родительские директории
        pathDir = new File("src/lesson_49/fileIO/files/example");
        System.out.println(pathDir.mkdirs());

        // new File(File/String parent, String child) - создает объект file с указанием родительского пути
        File lessonDir = new File("src/lesson_49/fileIO");
        File pathDb = new File(lessonDir, "db/v01");
        System.out.println("path.mkdirs: " + pathDb.mkdirs());

        // delete() - удаляет папку или директорию
        System.out.println("pathDir.delete(): " + pathDir.delete());

        // deleteOnExit() - удаляет файл или директорию при завершении работы JVM (приложения)
        pathDb.deleteOnExit();

        // Пауза в работе потока выполнения программы. Бросает исключение.
        Thread.sleep(10);

        System.out.println("Программа завершила работу");

        System.out.println("================\n");
        File file = new File(lessonDir, "text.txt");

        // boolean createNewFile() - создает новый пустой файл, если файл с таким именем еще не существует

        try {
            System.out.println("create file: " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // exists() - проверяет существует ли файл или директория
        System.out.println("file.exists(): " + file.exists());
        System.out.println("pathDb.exists(): " + pathDb.exists() + " | pathDir.exists(): " + pathDir.exists());

        // isFile, isDirectory - возвращает true, если объект файл является файлом / директорией
        System.out.println("file.isFile(): " + file.isFile());
        System.out.println("file.isDirectory(): " + file.isDirectory());
        System.out.println("lessonDir.isFile(): " + lessonDir.isFile());
        System.out.println("lessonDir.isDirectory(): " + lessonDir.isDirectory());

        System.out.println("length: " + file.length()); // размер файла в байтах
        System.out.println("lastModified: " + file.lastModified()); // время последнего изменения файла

        System.out.println("getName: " + file.getName()); // возвращает имя файла или директории
        System.out.println("getPath: " + file.getPath()); // возвращает строковое представление пути к файлу / директории

        System.out.println("======================\n");

        try {
            FileWriter fileWriter = new FileWriter(file, false); // флаг определяющий дозапись / перезапись
            fileWriter.write("Hello, World!");
//            fileWriter.write("\n");
            fileWriter.close(); // закрываем доступ к файлу
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Почитаем из файла
        // try с ресурсами

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            System.out.println("Чтение строки завершено");
            System.out.println("line: " + line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // String[] list() - список имен файлов и директорий в директории
        String[] names = lessonDir.list();
        System.out.println("names: " + Arrays.toString(names));

        System.out.println("============\n");

        // File[] listFiles() - массив объектов типа File представляющих файлы и директории
        File[] files = lessonDir.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName() + " | " + file1.getPath() + " | " + file1.isFile());
        }



    }
}
