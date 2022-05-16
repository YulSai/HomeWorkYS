package home_work_5.additional.stringMaker;


import home_work_5.additional.stringMaker.supplier.FileToStringSupplier;

import java.util.function.Supplier;

/**
 * Класс с методами обработки текса из файла
 */
public class MakerForString {

    private String fileName;

    /**
     * Метод считывает текс из файла и сохраняет его как строку.
     *
     * @return строку с текстом из файла
     */
    public String createTextToString(String fileName) {
        Supplier<String> stringFromFile = new FileToStringSupplier(fileName);

        return stringFromFile.get();
    }

    /**
     * Метод обрабатывает текст в строке, удаляя из нее часть нежелательных символов
     *
     * @return обработанную строку без нежелательных символов
     */
    public String getStringWithText(String text) {
        String chars = "(\n|\t|_|--|-\\s+|\\s+-|\\s+)";
        return text.replaceAll(chars, "  ").replaceAll("\\s{2,}", " ");
    }

    /**
     * Метод получает строку из файла и обрабатывает ее
     *
     * @param fileName путь к файлу
     * @return обработанную строку с текстом из файла
     */
    public String makeText(String fileName) {
        String text = createTextToString(fileName);
        return getStringWithText(text);
    }
}