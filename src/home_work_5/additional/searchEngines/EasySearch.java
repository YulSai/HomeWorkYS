package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long counter = 0;
        int index;
        int currentIndex = 0;
        while ((index = text.indexOf(word, currentIndex)) != -1) {
            int first = index + word.length();
            int last = index - 1;
            if ((first >= text.length() || checkIsNotWord(text.charAt(first))) &&
                    (last < 0 || checkIsNotWord(text.charAt(last)))) {
                counter++;
            }
            currentIndex = index + word.length() + 1;
        }
        return counter;
    }

    private boolean checkIsNotWord(char symbol) {
        return !(symbol >= 'А' && symbol <= 'я') && !(symbol >= '0' && symbol <= '9')
                && symbol != 'ё' && symbol != 'Ё' && symbol != '-';
    }
}