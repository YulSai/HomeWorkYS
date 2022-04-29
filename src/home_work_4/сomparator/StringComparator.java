package home_work_4.сomparator;

import java.util.Comparator;
/**
 * Класс для реализации интерфейса Comparator для String
 */
public class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1 == null && o2 == null) {
            return 0;
        } else if (o2 == null) {
            return -1;
        } else if (o1 == null) {
            return 1;
        }
        return o1.compareTo(o2);
    }
}