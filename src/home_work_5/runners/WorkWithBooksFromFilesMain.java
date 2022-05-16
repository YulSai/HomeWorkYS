package home_work_5.runners;

import home_work_5.additional.books.WorkWithBooksFromFiles;

import java.io.IOException;
import java.util.Scanner;

/**
 * Класс с точкой входа WorkWithBooksFromFiles
 */
public class WorkWithBooksFromFilesMain {
    public static void main(String[] args) throws IOException {

        WorkWithBooksFromFiles handler = new WorkWithBooksFromFiles();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в библиотеку. \nКниги из какой папки вас интересуют? >");
        String pathToFolder = scanner.nextLine();

        handler.makeResultFile(pathToFolder);

        handler.getFileName(pathToFolder);

        String fileName;

        do {
            System.out.println("Введите название книги, в которой будем искать > ");
            System.out.println("Если хотите выйти - введите 1 > ");
            fileName = scanner.nextLine();

            if (fileName.equals("1")) {
                break;
            }

            String text = handler.getText(pathToFolder, fileName);
            String word;

            do {
                System.out.println("Введите слово, которое нужно найти > ");
                System.out.println("Если хотите выйти - введите 1 > ");
                word = scanner.nextLine();

                long count = handler.searchWord(text, word);
                handler.fillOutResultFile(pathToFolder, fileName, word, count);

                System.out.println("Слово " + word + " в тексте встречается: " + count + " раз");
            } while (!word.equals("1"));
        } while (true);
    }
}