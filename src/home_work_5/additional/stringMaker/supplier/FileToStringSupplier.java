package home_work_5.additional.stringMaker.supplier;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Supplier;

import static java.nio.file.Path.of;

/**
 * Класс с методом для считывания текста из файла
 */
public class FileToStringSupplier implements Supplier<String> {
    private final String fileName;

    public FileToStringSupplier(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Метод считывает текс из файла и сохраняет его как строку.
     * @return строку с текстом из файла
     */
    @Override
    public String get() {
        String text = "";
        try {
            Path path = of(fileName);
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
