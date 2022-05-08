package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = delete(text);
        return this.searchEngine.search(text, word);
    }

    public String delete(String text) {
        String chars = "(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        return text.replaceAll(chars, "  ").replaceAll("\\s{2,}", " ");
    }
}