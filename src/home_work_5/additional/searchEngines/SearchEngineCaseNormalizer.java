package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

import java.util.List;

/**
 * Класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета его количества в тексте
 * без учета падежей
 */
public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод ищет заданное слово, приводит его к именительному падежу и подсчитывает его количество в тексте
     *
     * @param text строка с помещенным в нее текстом из файла
     * @param word слова, которое необходимо найти в тексте
     * @return информации о количестве раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        if (!List.of("а", "в", "и", "к", "о", "с", "у", "я").contains(word)) {
            String wordWithoutCase = word.replaceAll("[аяоеуыи]$", "");
            text = text.replaceAll(wordWithoutCase + "[аяоеуыи]", word);
        }
        return searchEngine.search(text, word);
    }
}