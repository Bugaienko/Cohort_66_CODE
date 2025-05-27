package homeworks.hw_29.components;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

public class Memory extends Component {
    private int value;

    public Memory(String brand, String model, int value) {
        super(brand, model);
        this.value = value;
    }
}
