package home_work_5.runners;

import home_work_5.additional.Collections.MakerForCollection;
import home_work_5.additional.StringMaker.MakerForString;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class CollectionMain {
    public static void main(String[] args) throws IOException {
        MakerForString handler = new MakerForString();
        MakerForCollection creator = new MakerForCollection();

        // считываем текс из файла
        String text = handler.createTextToString();
        // System.out.println("Строка из файла: " + text);
        System.out.println();

        // обрабатываем строку и создаем массив с отдельными словами
        String[] arr = handler.prepareString(text);
        //  System.out.println(Arrays.toString(arr));
        System.out.println();

        // помещаем слова в коллекцию Set и находим количество использованных слов в тексте
        Set<String> wordsFromText = creator.createStringToSet(arr);
        System.out.println("Количество использованных слов: " + wordsFromText.size());
        //System.out.println();

        //помещаем слова в коллекцию с количеством раз их использования, сортируем по количеству и алфавиту
        List<String> mapSorted = creator.sortMap(arr);
        //System.out.println("Отсортированный список: " + mapSorted);
        System.out.println();

        //выводим n Топ использованных слов
        System.out.println("Топ использованных слов: ");
        MakerForCollection.printTopMap(mapSorted, 100);
    }
}