package home_work_5.additional.stringMaker.supplier;

import java.util.function.Supplier;

/**
 * Класс с методом для преобразования в строку текста из файла по книге Война и Мир
 */
public class WarAndPeaceToStringSupplier implements Supplier<String> {
    private static final String fileName = "C:/Users/yluya/IdeaProjects/JD1/HomeWork/src/home_work_5/" +
            "resources/Война и мир_книга.txt";

    private final Supplier<String> textFromFile;

    public WarAndPeaceToStringSupplier() {
        this.textFromFile = new FileToStringSupplier(fileName);

    }

    @Override
    public String get() {
        return textFromFile.get();
    }
}
