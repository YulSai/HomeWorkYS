package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

/**
 * Класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета его количества в тексте
 * без нежелательных символов
 */
public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод удаляет нежелательные символы и ищет заданное слова и подсчитывает его количество в тексте
     *
     * @param text строка с помещенным в нее текстом из файла
     * @param word слова, которое необходимо найти в тексте
     * @return информации о количестве раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        text = delete(text);
        return this.searchEngine.search(text, word);
    }

    /**
     * @param text строка с помещенным в нее текстом из файла
     * @return отформатированную строку без нежелательных символов
     */
    public static String delete(String text) {
        String chars = "(\\.|,|:|;|=|\\*|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        return text.replaceAll(chars, "  ").replaceAll("\\s{2,}", " ");
    }
}