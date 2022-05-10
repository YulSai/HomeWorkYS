package home_work_5.additional.stringMaker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Класс с методом для считывания текста из файла
 */

public class FileToString {

    /**
     * Метод считывает текс из файла и сохраняет его как строку
     *
     * @param fileName путь к файлу из которого необходимо считать текст
     * @return возвращает строку с текстом их файла
     */

    public String readerToString(String fileName) {
        String text = "";
        try {
            Path path = Path.of(fileName);
            text = Files.readString(path, StandardCharsets.UTF_8);
        } catch (
                FileNotFoundException f) {
            System.out.println("Ошибка. Файл не найден.");
            f.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
            e.printStackTrace();
        }
        return text;
    }
}