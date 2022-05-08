package home_work_5.additional.StringMaker;
import home_work_5.additional.StringMaker.api.IFileToString;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Метод считывает текс из файла и сохраняет его как строку.
 */
public class FileToString implements IFileToString {
    @Override
    public String readerToString(String fileName) throws IOException {
        String text = "";
        try {
            Path path = Path.of(fileName);
            text = Files.readString(path);
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
