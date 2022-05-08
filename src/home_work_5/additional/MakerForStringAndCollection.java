package home_work_5.additional;

import home_work_5.additional.Collections.MapCollection;
import home_work_5.additional.Collections.SetCollection;
import home_work_5.additional.StringMaker.FileToStringWithoutSymbols;
import home_work_5.additional.StringMaker.api.IFileToString;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MakerForStringAndCollection {
    private String[] arr;

    public MakerForStringAndCollection() {
    }

    public String createTextToString() throws IOException {
        String fileName = "D:\\Документы\\- =Учеба = -\\IT\\Java\\Программирование на Java_02" +
                "\\ДЗ\\HW05\\Война и мир_книга.txt";
        IFileToString reader = new FileToStringWithoutSymbols();

        return reader.readerToString(fileName);
    }

    public Set<String> createStringToSet(String text) {
        SetCollection set = new SetCollection();

        return set.createSetCollection(text);
    }

    public List<String> sortMap(String text){
        MapCollection map = new MapCollection();
        Map<String, Integer> wordsAndCount = map.createMapCollection(text);
        List<Map.Entry<String, Integer>> list = map.sortFromMap(wordsAndCount);
        return map.formatListFromString(list);
    }

    public static void printTopMap(List<String> list, int amt) {
        int count = 0;
        for (String s : list) {
            System.out.print(s + " раз, ");
            if (count++ >= amt - 1)
                break;
        }
    }
}