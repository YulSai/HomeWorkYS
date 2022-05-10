package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

/**
 * Класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета его количества в тексте
 * без учета регистра
 */
public class SearchEngineIgnoreCase implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineIgnoreCase(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод приводит все слова к нижнему регистру и ищет заданное слова и подсчитывает его количество в тексте
     *
     * @param text строка с помещенным в нее текстом из файла
     * @param word слова, которое необходимо найти в тексте
     * @return информации о количестве раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        return searchEngine.search(text.toLowerCase(), word.toLowerCase());
    }
}