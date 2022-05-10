package home_work_5.runners;

import home_work_5.additional.collections.MakerForCollection;
import home_work_5.additional.stringMaker.MakerForString;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * Класс с точкой входа для классов MakerForString и MakerForCollection
 */
public class CollectionMain {
    public static void main(String[] args) throws IOException {

        MakerForString handler = new MakerForString();
        MakerForCollection creator = new MakerForCollection();

        // считываем текс из файла
        String text = handler.createTextToString();
        System.out.println("Строка из файла: " + text);
        System.out.println("_______________");

        // обрабатываем строку
        text = handler.handleString(text);
        System.out.println("Отредактированная строка: " + text);
        System.out.println("_______________");

        //получаем данные с учетом регистра

        // помещаем слова в коллекцию Set и находим количество использованных слов в тексте
        Set<String> wordsFromText = creator.createStringToSet(text);
        System.out.println("Количество использованных слов: " + wordsFromText.size());
        System.out.println("_______________");

        //помещаем слова в коллекцию с количеством раз их использования, сортируем по количеству и наименованию
        List<String> mapSorted = creator.sortMap(text);
        System.out.println("Отсортированный список: " + mapSorted);
        System.out.println("_______________");

        //выводим n Топ использованных слов
        System.out.println("Топ использованных слов: ");
        creator.printTopMap(mapSorted, 100);
        System.out.println();

        System.out.println("-----------------------------");
        //получаем данные без учета регистра

        //приводим строку к нижнему регистру
        text = handler.getLowerCase(text);
        System.out.println("Отредактированная строка с нижним регистром: " + text);
        System.out.println("_______________");

        // помещаем слова в коллекцию Set и находим количество использованных слов в тексте
        Set<String> wordsFromTextIgnoreCase = creator.createStringToSet(text);
        System.out.println("Количество использованных слов без учета регистра: " + wordsFromTextIgnoreCase.size());
        System.out.println("_______________");

        //помещаем слова в коллекцию с количеством раз их использования, сортируем по количеству и наименованию
        List<String> mapSortedIgnoreCase = creator.sortMap(text);
        System.out.println("Отсортированный список без учета регистра: " + mapSortedIgnoreCase);
        System.out.println("_______________");

        //выводим n Топ использованных слов
        System.out.println("Топ использованных слов без учета регистра: ");
        creator.printTopMap(mapSortedIgnoreCase, 100);
    }
}