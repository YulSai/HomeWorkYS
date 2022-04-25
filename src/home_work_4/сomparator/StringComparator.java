package home_work_4;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o2 == null) {
            return -1;
        }
        if (o1 == null) {
            return 1;
        }
        if (o1 == null || o2 == null) {
            return -1;
        }
        return o1.compareTo(o2);
    }
}