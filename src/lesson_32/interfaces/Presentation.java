package lesson_32.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.06.2025
 */

public class Presentation implements ColorPrintable {
    String title;
    String author;
    String theme;

    public Presentation(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }

    @Override
    public void colorPrint() {
        System.out.println("Печать презентации в цвете: "+ title);
    }

    @Override
    public void print() {
        System.out.printf("Печать чб презентации %s автора %s\n",
                theme, author);
    }
}
