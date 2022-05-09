package home_work_5.runners;

import home_work_5.additional.Collections.MakerForCollection;
import home_work_5.additional.StringMaker.MakerForString;
import home_work_5.additional.searchEngines.*;
import home_work_5.additional.searchEngines.api.ISearchEngine;

import java.io.IOException;

public class SearchMain {
    public static void main(String[] args) throws IOException {
        MakerForString handler = new MakerForString();
        MakerForCollection creator = new MakerForCollection();


        String text = handler.createTextToString();
        String text2 = "война война и мир Мир и";

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
         с помощью EasySearch с учетом регистра
         */
        ISearchEngine searchEasySearch = new EasySearch();
        System.out.println("Слово \"война\" в тексте встречается: " + searchEasySearch.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEasySearch.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEasySearch.search(text, "мир") + " раз");
        System.out.println();

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
        с помощью RegExSearch с учётом регистра
         */
        ISearchEngine searchRegExSearch = new RegExSearch();
        System.out.println("Слово \"война\" в тексте встречается: " + searchRegExSearch.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchRegExSearch.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchRegExSearch.search(text, "мир") + " раз");
        System.out.println();

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
        с помощью EasySearch без учета регистра используя декоратор SearchEngineIgnoreCase
         */
        ISearchEngine searchEngineIgnoreCase = new SearchEngineIgnoreCase(searchEasySearch);
        System.out.println("Слово \"война\" в тексте встречается: " + searchEngineIgnoreCase.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEngineIgnoreCase.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEngineIgnoreCase.search(text, "мир") + " раз");
        System.out.println();

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
         с помощью RegExSearch без учета регистра, используя декоратор SearchEngineIgnoreCase
         */
        ISearchEngine searchEngineIgnoreCase2 = new SearchEngineIgnoreCase(searchRegExSearch);
        System.out.println("Слово \"война\" в тексте встречается: " + searchEngineIgnoreCase2.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEngineIgnoreCase2.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEngineIgnoreCase2.search(text, "мир") + " раз");
        System.out.println();


        /*получаем информацию как часто встречаются слова "война", "и" (как союз), "мир" и удаляем нежелательные символы
         с помощью RegExSearch без учета регистра, используя декораторы SearchEngineIgnoreCase и SearchEnginePunctuationNormalizer
         */
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(searchEngineIgnoreCase2);
        System.out.println("Слово \"война\" в тексте встречается: " + searchEnginePunctuationNormalizer.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEnginePunctuationNormalizer.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEnginePunctuationNormalizer.search(text, "мир") + " раз");
        System.out.println();

        /*получаем информацию как часто встречаются слова "война", "и" (как союз), "мир" и удаляем нежелательные символы
         с помощью RegExSearch без учета регистра и без учета падежей, используя декораторы
         SearchEngineIgnoreCase, SearchEnginePunctuationNormalizer и SearchEngineCaseNormalizer
         */
        ISearchEngine searchSearchEngineCaseNormalizer = new SearchEngineCaseNormalizer(searchEngineIgnoreCase2);
        System.out.println("Слово \"война\" в тексте встречается: " + searchSearchEngineCaseNormalizer.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchSearchEngineCaseNormalizer.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchSearchEngineCaseNormalizer.search(text, "мир") + " раз");
        System.out.println();
    }
}