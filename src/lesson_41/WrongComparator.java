package lesson_41;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.06.2025
 */

public class WrongComparator {


    public int compare(Car c1, Car c2) {
        String model1 = c1.getModel();
        String model2 = c2.getModel();

        return model1.compareTo(model2);

//      return c1.getModel().compareTo(c2.getModel());
    }
}
