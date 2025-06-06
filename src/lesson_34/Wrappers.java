package lesson_34;

import lesson_33.GenericBox;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */



public class Wrappers {

    /*
    Классы-обертки используются для представления примитивных типов как объектов (как ссылочных ТД)

    Byte - обертка byte
    Short - обертка short
    Integer - обертка int
    Long - обертка long
    Double - обертка double
    Float - обертка float
    Character - обертка char
    Boolean - обертка boolean

     */

    public static void main(String[] args) {

        // константы
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

//        int x = null; примитив null не поддерживает
        maxValue = null; // Обертки поддерживают null-значением

        // Привидение типов. Автоупаковка и автораспаковка

        // 1.56
        Integer wrapperInt = 5; // Автоупаковка примитива в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка. Из Integer автоматически преобразовано в примитив int
        System.out.println("primitiveInt: " + primitiveInt);

        // Сравнение объектов. Чтобы сравнить объекты по значению, следует использовать метод equals().
        // -128...127 - Кеширование


        Integer a = 127; // Создан объект с адресом в памяти @2aaa2
        Integer b = 127; // Объект с таким значением уже есть. Новый не создается - выдается ссылка на уже существующий -> @2aaa2

        // Сравниваем значения переменных (т.е. адреса объектов, хранящиеся в переменных)
        System.out.println("127 == 127: " + (a == b)); // true
        System.out.println("127.equals(127): " + a.equals(b)); // true

        Integer c = 128; // Создан объект с адресом в памяти @3ссс3
        Integer d = 128; // Создан объект с адресом в памяти @4bbb4. Не проверяется наличие объекта с таким значением
        System.out.println("128 == 128: " + (c == d)); // false
        System.out.println("128.equals(128): " + c.equals(d)); // true

        System.out.println("=======================\n");

        // Общие или схожие методы, которыми обладают классы-обертки

        // .valueOf() - преобразует явным образом примитив или строку в объект типа его обертки. Явная упаковка

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf("154.56");
        System.out.println("dbl: " +  dbl);

        System.out.println("======================\n");

        // parseXXX() - преобразует строку в соответствующий примитив.
        double dblP = Double.parseDouble("456"); // возвращает примитив
        Double dblD = Double.valueOf("456"); // возвращает ссылочный тип данных

        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("12345")); // на выходе int

        // toString() - переопределен у всех оберток
        Boolean flag = Boolean.FALSE;
        System.out.println(flag);
        flag = true; // Автоупаковка
        System.out.println(flag);

        // equals() - сравнивает два объекта по значению (сравнение на равенство)

        // compareTo() - сравнивает текущий объект с другим объектом того же типа
        // Кто больше?
        // Возвращаемое значение типа int

        /*
        i1, i2 сравниваем. i1.compareTo(i2); 10.compareTo(5)
        i1 > i2 -> положительное
        i1 < i2 -> отрицательное
        i1 = i2 -> 0
         */

        Integer i1 = 127;
        Integer i2 = 256;
        System.out.println("127.compareTo(256): " + i1.compareTo(i2));
        System.out.println("256.compareTo(128): " + i2.compareTo(i1));

        System.out.println("=====================\n");

        // xxxValue() - возвращает значение обертки как примитивный тип\
        // doubleValue(), intValue() и т.д.

        Double d2 = 123.56; // Автоупаковка (примитив -> обертка)
        d2 = Double.valueOf(125.67); // Явная / принудительная упаковка
        double dPrimitive = d2; // Автораспаковка (обертка -> примитив)
        dPrimitive = d2.doubleValue(); // Явная / принудительная распаковка


        System.out.println("==================\n");

        /*
        Все числовые обертки над примитивами наследуются от
        абстрактного класса Number.
        Byte, Short, Integer, Long, Float, Double
        Эти классы обладают методами, унаследованными от Number,
        которые позволяют извлекать значение объекта в различных примитивных форматах.

        byteValue();
        shortValue();
        intValue();
        longValue();
        floatValue();
        doubleValue();
         */

        Integer integer = 31844;

        double dVal = integer.doubleValue();
        System.out.println(dVal);
        System.out.println(integer.floatValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);

        System.out.println("dWrapper.byteValue(): " + dWrapper.byteValue());

        GenericBox<Integer> intBox = new GenericBox<>(15);
        System.out.println(intBox);

        // Автоупаковка и автораспаковка практически избавляют нас
        // от необходимости явно приводить типы данных

        GenericBox<Integer> intBox2 = new GenericBox<>(50);

        int sum = intBox.getValue() +  intBox2.getValue();

        // intBox.setValue(123);












    }

}
