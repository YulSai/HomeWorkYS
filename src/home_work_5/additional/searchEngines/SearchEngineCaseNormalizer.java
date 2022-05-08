package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String wordWithoutCase = word.replaceAll("[" + "аяеуы" + "]$","");
        text = text.replaceAll(wordWithoutCase+"[" + "аяеуы" + "]",word);
        return searchEngine.search(text,word);
    }
}
