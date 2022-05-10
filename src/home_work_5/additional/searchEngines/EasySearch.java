package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

/**
 * Класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета его количества в тексте
 * с использованием indexOf
 */
public class EasySearch implements ISearchEngine {

    /**
     * Метод ищет заданное слова и подсчитывает его количество в тексте с учетом регистра
     *
     * @param text строка с помещенным в нее текстом из файла
     * @param word слова, которое необходимо найти в тексте
     * @return информации о количестве раз которое встречается слово в тексте
     */
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

    /**
     * Метод проверяет, является ли символ буквой, числом или дефисом
     *
     * @param symbol символ типа char
     * @return true если символ является буквой, числом или дефисом, иначе - false
     */
    private boolean checkIsNotWord(char symbol) {
        return !(symbol >= 'А' && symbol <= 'я') && !(symbol >= '0' && symbol <= '9')
                && symbol != 'ё' && symbol != 'Ё' && symbol != '-';
    }
}