package home_work_5.additional.Collections;

import home_work_5.additional.Collections.comporator.ComparatorForListFromMapCount;
import home_work_5.additional.Collections.comporator.ComparatorForListFromMapTitle;

import java.util.*;

public class MapCollection {
    private String[] arr;

    public Map<String, Integer> createMapCollection(String text) {
        arr = text.split(" ");
        Map<String, Integer> wordsAndCount = new HashMap<>();

        for (String s : arr) {
            if (s.equals(" ") || s.equals("")) {
            } else {
                Integer count = wordsAndCount.get(s);
                wordsAndCount.put(s, count == null ? 1 : count + 1);
            }
        }
        return wordsAndCount;
    }

    public List<Map.Entry<String, Integer>> sortFromMap(Map<String, Integer> wordsAndCount) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsAndCount.entrySet());
        list.sort(new ComparatorForListFromMapCount().thenComparing(new ComparatorForListFromMapTitle()));
        return list;
    }

    public List<String> formatListFromString(List<Map.Entry<String, Integer>> list) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> s : list) {
            result.add(String.valueOf(s));
        }
        List<String> result2 = new ArrayList<>();
        for (String s : result) {
            result2.add(s.replaceAll("=", " - "));
        }
        return result2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapCollection that = (MapCollection) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}
