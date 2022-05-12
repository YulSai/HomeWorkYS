package home_work_5.additional.stringMaker.supplier;

import java.util.function.Supplier;

/**
 * Класс с методом для обработки строки с текстом из файла
 */
public class StringWithTextSupplier implements Supplier<String> {
    private final String text;

    public StringWithTextSupplier(String text) {
        this.text = text;
    }

    /**
     * Метод обрабатывает текст в строке, удаляя из нее часть нежелательных символов
     *
     * @return обработанную строку без нежелательных символов
     */
    @Override
    public String get() {
        String chars = "(\n|\t|--|-\\s+|\\s+-|\\s+)";
        return text.replaceAll(chars, "  ").replaceAll("\\s{2,}", " ");
    }
}