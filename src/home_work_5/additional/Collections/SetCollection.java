package home_work_5.additional.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    String[] arr;

    public Set<String> createSetCollection(String text) {
        arr = text.split(" ");
        Set<String> wordsFromText = new HashSet<>();

        for (String s : arr) {
            if (s.equals(" ") || s.equals("")) {
            } else {
                wordsFromText.add(s);
            }
        }
        return wordsFromText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetCollection that = (SetCollection) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}