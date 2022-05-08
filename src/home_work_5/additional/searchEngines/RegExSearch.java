package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("\\b" + word+ "\\b");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}