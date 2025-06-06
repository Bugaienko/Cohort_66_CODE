package lesson_34;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.06.2025
 */

// Примерно так будет выглядеть скомпилированный код класса, для создание объекта, работающего c Integer

public class TypeErasure  {
    private Object value;

    public TypeErasure(Object value) {
        this.value = value;
    }

    public Integer getValue() {
        return (Integer) value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
