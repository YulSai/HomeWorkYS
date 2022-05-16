package home_work_5.additional.books;

import home_work_5.additional.searchEngines.RegExSearch;
import home_work_5.additional.searchEngines.SearchEngineCaseNormalizer;
import home_work_5.additional.searchEngines.SearchEngineIgnoreCase;
import home_work_5.additional.searchEngines.SearchEnginePunctuationNormalizer;
import home_work_5.additional.searchEngines.api.ISearchEngine;
import home_work_5.additional.stringMaker.MakerForString;
import home_work_5.additional.stringMaker.supplier.FileToStringSupplier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Supplier;

/**
 * Класс с методами обработки пути и файлов для выбора файлов и поиска слов
 */
public class WorkWithBooksFromFiles {

    /**
     * Метод считывает переданный путь к папке и выводит информацию о файлах, находящихся там
     *
     * @param pathToFolder путь к папке
     */
    public void getFileName(String pathToFolder) {
        File reader = new File(pathToFolder);
        if (Files.isDirectory(Path.of(pathToFolder))) {
            File[] listOfFiles = reader.listFiles();
            if ((listOfFiles != null ? listOfFiles.length : 0) == 0) {
                System.out.println("Папка " + reader.getName() + " пуста.");
            } else {
                System.out.println("В папке " + reader.getName() + " найдено: ");
                for (File file : listOfFiles) {
                    System.out.println(file.getName());
                }
            }
        }
    }

    /**
     * Метод получает обработанный текс из выбранного файла в папке
     *
     * @param pathToFolder путь к папке
     * @param fileName     название файла, которое выбрал пользователь
     * @return строку с обработанным текстом из файла
     */
    public String getText(String pathToFolder, String fileName) {
        Supplier<String> textFromFile = new FileToStringSupplier(pathToFolder + "\\" + fileName);
        MakerForString handler = new MakerForString();
        return handler.getStringWithText(textFromFile.get());
    }

    /**
     * Метод ищет заданное слова и подсчитывает его количество в тексте без учета регистра, падежей
     *
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @param word слово, которое необходимо найти
     * @return информации о количестве раз которое встречается слово в тексте
     */
    public long searchWord(String text, String word) {
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(new SearchEngineIgnoreCase
                (new SearchEngineCaseNormalizer(new RegExSearch())));

        return searchEngine.search(text, word);
    }

    /**
     * Метод создает файл result.txt для записи результатов поиска
     * @param pathToFolder путь к папке
     */
    public void makeResultFile(String pathToFolder) {
        File creator = new File(pathToFolder + "\\result.txt");
        if (creator.exists()) {
            creator.delete();
        }
        try {
            creator.createNewFile();
        } catch (IOException e) {
            System.out.println("Не удалось создать файл result");
            e.printStackTrace();
        }
    }

    /**
     * Метод записывает результаты поиска слов в тексте в файл
     *
     * @param pathToFolder путь к папке
     * @param fileName     название файла, которое выбрал пользователь
     * @param word         слово, которое необходимо найти
     * @param count        количество раз которое встречается слово в тексте
     */
    public void fillOutResultFile(String pathToFolder, String fileName, String word, long count) {
        try {
            Path pathToFileLog = Path.of(pathToFolder + "\\result.txt");
            String textLog = Files.readString(pathToFileLog, StandardCharsets.UTF_8);

            if (!word.equals("1")) {
                FileWriter writer = new FileWriter(pathToFolder + "\\result.txt");
                writer.append(textLog).append("\nИмя файла: ").append(fileName).append(", искомое слово: ").append(word).append(", слово найдено ").append(String.valueOf(count)).append(" раз");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}