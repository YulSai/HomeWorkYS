package home_work_5.additional.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public Set<String> createSetCollection(String[] arr) {
        Set<String> wordsFromText = new HashSet<>();

       /* for (String s : arr) {
            wordsFromText.add(s);
        }*/
        Collections.addAll(wordsFromText, arr);

        return wordsFromText;
    }
}