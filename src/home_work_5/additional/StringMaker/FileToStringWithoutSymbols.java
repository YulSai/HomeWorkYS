package home_work_5.additional.StringMaker;

import home_work_5.additional.StringMaker.api.IFileToString;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Метод считывает текс из файла и записывает его в строку, исключая указанные символы.
 *
 */
public class FileToStringWithoutSymbols implements IFileToString {

    @Override
    public String readerToString(String fileName) throws IOException {
        StringBuilder builder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            int symbol;

            while ((symbol = fileReader.read()) != -1) {
                if (symbol == 10) {
                    builder.append(" ");
                } else if (symbol == 13) {
                } else if (symbol != ','  && symbol != '-' && symbol != '.' && symbol != '!' && symbol != ')' && symbol != '"'
                        && symbol != ':' && symbol != ';' && symbol != '?' && symbol != '*' && symbol != '(') {
                    builder.append((char) symbol);
                }
            }
            return builder.toString();
        } catch (FileNotFoundException f) {
            System.out.println("Ошибка. Файл не найден.");
            f.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
            e.printStackTrace();
        }
        return builder.toString();
    }
}
