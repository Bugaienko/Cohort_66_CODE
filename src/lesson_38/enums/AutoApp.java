package lesson_38.enums;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.06.2025
 */

public class AutoApp {
    public static void main(String[] args) {

//        Auto auto = new Auto("x-303", "Hello World");

        // В переменную типа enum можно присвоить только одну из констант этого enum-а
        Color color = Color.RED;
        System.out.println(color);

        Auto auto = new Auto("x-303", Color.BLACK);

        System.out.println(auto);

        auto.setColor(color);

        System.out.println(auto);

        System.out.println("===================\n");

        // Возвращает массив всех значений
        Color[] colors = Color.values();

        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }

        // Возвращает enum по строковому имени
//        System.out.println(Color.RED.equals("RED"));
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

        // Получить имя константы (String)
        String name = Color.RED.name();
        System.out.println(name + "!");

        // Получить порядковый номер (начиная с 0)
        int ordinal = Color.YELLOW.ordinal();
        System.out.println("ordinal: " + ordinal);

        System.out.println(auto);
        // Enum безопасно сравнивать на равенство оператором ==
        if (auto.getColor() == Color.YELLOW) {
            System.out.println("Цвет авто желтый!");
        } else {
            System.out.println("Не желтый!");
        }

        // Enum-ы очень часто используются в switch
        switch (auto.getColor()) {
            case RED:
                System.out.println("Красный");
                break;
            case BLACK:
                System.out.println("Black");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
                // Дефолтный блок не нужен
        }


    }
}
