package home_work_5.additional.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MakerForCollection {
    private String[] arr;

    public MakerForCollection() {
    }

    public Set<String> createStringToSet(String[] arr) {
        SetCollection set = new SetCollection();

        return set.createSetCollection(arr);
    }

    public List<String> sortMap(String[] arr){
        MapCollection map = new MapCollection();

        Map<String, Integer> wordsAndCount = map.createMapCollection(arr);
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