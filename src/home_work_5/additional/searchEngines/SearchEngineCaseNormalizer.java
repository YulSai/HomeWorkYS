package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

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
        String wordWithoutCase = word.replaceAll("[" + "аяоеуы" + "]$", "");
        text = text.replaceAll(wordWithoutCase + "[" + "аяоеуы" + "]", word);

        return searchEngine.search(text, word);
    }
}