package home_work_5.runners;

import home_work_5.additional.collections.MakerForCollection;
import home_work_5.additional.stringMaker.MakerForString;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Класс с точкой входа для классов MakerForString и MakerForCollection
 */
public class CollectionMain {
    public static void main(String[] args) throws IOException {

        MakerForString handler = new MakerForString();
        MakerForCollection creator = new MakerForCollection();

        // считываем текс из файла и получаем обработанную строку
        String text = handler.createTextToString();

        // помещаем слова в коллекцию Set и находим количество использованных слов в тексте
        int wordsFromText = creator.createStringToSet(text);
        System.out.println("Количество использованных слов: " + wordsFromText);
        System.out.println("_______________");

        //помещаем слова в коллекцию с количеством раз их использования, сортируем по количеству и наименованию
        List<Map.Entry<String, Integer>> mapSorted = creator.sortMap(text);

        //выводим n Топ использованных слов
        System.out.println("Топ использованных слов: ");
        System.out.println(creator.printTopMap(mapSorted, 100));
    }
}