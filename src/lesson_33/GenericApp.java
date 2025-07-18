package lesson_33;

import lesson_23.Cat;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public class GenericApp {


    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello!");

        System.out.println(box);

        String value = box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(box.getValue().length());

        // Проверка типизации на уровне компилятора
        // box.setValue(1000);

        box.setValue("New Value!");
        System.out.println(box);

        System.out.println("=================\n");

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());
        System.out.println(catBox.getValue());

        // Нельзя поместить другой тип данных. Ошибка КОМПИЛЯЦИИ
        // catBox.setValue("String");

        // Дженерики НЕ работают с примитивными типами данных
//        GenericBox<int> intBox = new GenericBox<>(10);

        // Классы-обертки, для хранения примитивов

        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);

        System.out.println(intBox);

        int sum = intBox.getValue() + intBox2.getValue();

        System.out.println("sum = " + sum);



    }
}
