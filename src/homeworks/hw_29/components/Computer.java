package homeworks.hw_29.components;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.05.2025
 */

/*
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.

Реализуйте отношения между Computer и компонентами.

Компоненты Processor и Memory не могу существовать без компьютера.
 */

public class Computer {

    private String model;

    private Processor processor;
    private final Memory memory; // можно усилить неразрывность связи

    private Storage storage;

    public Computer(String compModel, Storage storage, int memorySize) {
        this.model = compModel;
        this.storage = storage;

        this.processor = new Processor("Intel", "i5");
        this.memory = new Memory("Samsung", "T9", memorySize);
    }

    public String toString() {
        return String.format("{Computer: model: %s | processor: %s | memory: %s | storage: %s}",
                model, processor.toString(), memory.toString(), storage.toString());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }
}
