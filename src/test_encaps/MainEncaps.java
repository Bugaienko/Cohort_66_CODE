package test_encaps;

import lesson_25.Cat;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.05.2025
 */

public class MainEncaps {
    public static void main(String[] args) {

        Cat cat = new Cat("Max", 5, 10);

        cat.weight = 15;

//        name имеет модификатор protected - в соседнем пакете - нет доступа
        //cat.name = null;

//      score имеет модификатор по умолчанию - в соседнем пакете - нет доступа
//        cat.score = 199;

    }
}
