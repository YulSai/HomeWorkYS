package home_work_5.additional.searchEngines;

import home_work_5.additional.searchEngines.api.ISearchEngine;

public class SearchEngineIgnoreCase implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public SearchEngineIgnoreCase(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        return searchEngine.search(text.toLowerCase(), word.toLowerCase());
    }
}