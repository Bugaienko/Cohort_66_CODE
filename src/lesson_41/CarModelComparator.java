package lesson_41;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.06.2025
 */

public class CarModelComparator implements Comparator<Car> {

    // String, Integer (и другие Wrapper-s) уже имеют встроенную логику сравнения,
    // т.е. они реализует интерфейс Comparable (т.е. у них реализован метод compareTo)

    // лексикографический порядок - порядок, в котором слова упорядочены, как в словаре
    // apple < banana
    // zebra > apple
    // Zebra < apple
    // A...Za...z



    @Override
    public int compare(Car c1, Car c2) {
        String model1 = c1.getModel();
        String model2 = c2.getModel();

        return model1.compareTo(model2);

//      return c1.getModel().compareTo(c2.getModel());
    }
}
