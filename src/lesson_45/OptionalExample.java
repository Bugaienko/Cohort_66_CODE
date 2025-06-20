package lesson_45;

import java.util.Optional;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.06.2025
 */

public class OptionalExample {
    public static void main(String[] args) {

        // class Optional<T> - класс-обертка.
        // Может содержать значение типа T, либо быть пустым.

        // Это альтернатива возвращению null из методов, чтобы уменьшить количество NPE

        // Optional.of(value) - создает Optional, содержащий значение. Если передать null - выбросит ошибку
        Optional<String> name = Optional.of("Alice");
        System.out.println(name);

        // name = Optional.of(null); // будет ошибка

        // Optional.ofNullable(value) - создает Optional, содержащий значение, если оно не-null
        // или пустой Optional, если значение null
        Optional<String> name2 = Optional.ofNullable(null); // пустой Optional

        System.out.println("ofNullable(null): " + name2);
        name2 = Optional.ofNullable("Bob");
        System.out.println("ofNullable(\"Bob\"): " + name2);

        System.out.println();

        //  Optional.empty() - Явно создает пустой Optional
        Optional<String> emptyName = Optional.empty();
        System.out.println(emptyName);

        System.out.println(" ============ Получение значения из Optional ============= ");

        // get() - получить значение из Optional. Если вызвать на пустом Optional - будет ошибка
        String string = name.get();
        System.out.println("name.get(): " + string);

        // System.out.println(emptyName.get()); // ошибка

        // isPrecent() - вернет true, если в Optional есть значение
        // isEmpty() - вернет true, если Optional пустой

        if (emptyName.isPresent()) {
            System.out.println("Имя: " + name.get());
        } else {
            System.out.println("Имя не найдено");
        }

        // orElse(T default) Получить значение или значение по умолчанию
//        String result = name.orElse("Guest!");
        String result = emptyName.orElse("Guest!");
        System.out.println("Hello, " + result);

        System.out.println("========================\n");

        // ifPresent() - выполнить действие, если значение есть
        name.ifPresent(n -> System.out.println("Hello, " + n));
        emptyName.ifPresent(n -> System.out.println("Hello, " + n));

        
    }


}
