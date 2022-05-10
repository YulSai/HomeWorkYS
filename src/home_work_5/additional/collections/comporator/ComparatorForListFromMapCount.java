package home_work_5.additional.collections.comporator;

import java.util.Comparator;
import java.util.Map;

/**
 * Класс с компаратором для сортировки объектов по количеству
 */
public class ComparatorForListFromMapCount implements Comparator<Map.Entry<String, Integer>> {

    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue() - o1.getValue();
    }
}