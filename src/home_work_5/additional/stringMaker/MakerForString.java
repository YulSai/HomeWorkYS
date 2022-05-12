package home_work_5.additional.stringMaker;


import home_work_5.additional.stringMaker.supplier.FileToStringSupplier;
import home_work_5.additional.stringMaker.supplier.StringWithTextSupplier;

import java.util.function.Supplier;

/**
 * Класс с методами обработки текса из файла
 */
public class MakerForString {

    /**
     * Метод считывает текст из файла и помещает его в строку, затем обрабатывает строку, чтобы из нее можно
     * было выделить отдельные слова
     *
     * @return обработанную строку из файла
     */
    public String createTextToString() {
        // String fileName = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\home_work_5\\resources\\Война и мир_книга.txt";
        // String fileName = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\home_work_5\\resources\\fragment.txt";
        // FileToString reader = new FileToString();

        //  return reader.readerToString(fileName);

        String fileName = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\home_work_5\\" +
                "resources\\Война и мир_книга.txt";

        Supplier<String> stringFromFile = new FileToStringSupplier(fileName);
        String text = stringFromFile.get();

        Supplier<String> stringWithText = new StringWithTextSupplier(text);

        return stringWithText.get();
    }
}