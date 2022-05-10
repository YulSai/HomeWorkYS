package home_work_5.additional.searchEngines.api;

/**
 * Интерфейс с методом поиска слов в тексте
 */
public interface ISearchEngine {

    public long search(String text, String word);

}