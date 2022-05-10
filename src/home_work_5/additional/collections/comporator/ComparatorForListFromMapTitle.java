package home_work_5.additional.collections.comporator;

import java.util.Comparator;
import java.util.Map;

/**
 * Класс с компаратором для сортировки объектов по наименованию
 */
public class ComparatorForListFromMapTitle implements Comparator<Map.Entry<String, Integer>> {

    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getKey() == null && o2.getKey() == null) {
            return 0;
        } else if (o2.getKey() == null) {
            return -1;
        } else if (o1.getKey() == null) {
            return 1;
        }
        return o1.getKey().compareTo(o2.getKey());
    }
}