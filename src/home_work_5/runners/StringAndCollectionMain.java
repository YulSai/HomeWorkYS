package home_work_5.runners;

import home_work_5.additional.MakerForStringAndCollection;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class StringAndCollectionMain {
    public static void main(String[] args) throws IOException {
        MakerForStringAndCollection creator = new MakerForStringAndCollection();


        String text = creator.createTextToString();
        //System.out.println("Строка из файла: " + text);
        //System.out.println();

        Set<String> wordsFromText = creator.createStringToSet(text);
        //System.out.println("Количество использованных слов: " + wordsFromText.size());
        //System.out.println();


        List<String> mapSorted = creator.sortMap(text);
        //System.out.println("Отсортированный список: " + mapSorted);

        System.out.println("Топ использованных слов: ");
        MakerForStringAndCollection.printTopMap(mapSorted, 10);
    }
}