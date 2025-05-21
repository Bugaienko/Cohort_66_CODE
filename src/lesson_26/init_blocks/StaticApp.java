package lesson_26.init_blocks;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.05.2025
 */

public class StaticApp {

    public static void main(String[] args) {

        System.out.println("static counter: " + StaticBlockDemo.counter);
        System.out.println("static colors: " + Arrays.toString(StaticBlockDemo.colors));


        StaticBlockDemo demo = new StaticBlockDemo();
//        System.out.println(demo.getCapacity());
        System.out.println("==============\n");

        StaticBlockDemo demo2 = new StaticBlockDemo();
        System.out.println("==============\n");

        StaticBlockDemo demo3 = new StaticBlockDemo(50);


    }
}
