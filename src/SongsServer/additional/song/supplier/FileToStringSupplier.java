package SongsServer.additional.song.supplier;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Supplier;

/**
 * Класс для работы с текстом из файла
 */
public class FileToStringSupplier implements Supplier<String> {
    private final String fileName;

    public FileToStringSupplier(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Метод считывает текс из файла и сохраняет его как строку.
     *
     * @return строку с песнями из файла
     */
    @Override
    public String get() {
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

    /**
     * Метод создает массив песен из строки
     *
     * @param text строка с песнями из файла
     * @return массив песен
     */
    public String[] transformStringToArray(String text) {
        return text.split("\n");
    }
}