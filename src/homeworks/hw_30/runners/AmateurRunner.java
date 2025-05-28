package homeworks.hw_30.runners;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.05.2025
 */

public class AmateurRunner extends Human{

    // Блок инициализации
    {
        typeRunner = "Любитель";
    }

    public AmateurRunner() {
        super(15, 10);

    }

    public AmateurRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
}
