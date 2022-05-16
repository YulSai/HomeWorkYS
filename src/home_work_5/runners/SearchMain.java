package home_work_5.runners;

import home_work_5.additional.searchEngines.*;
import home_work_5.additional.searchEngines.api.ISearchEngine;
import home_work_5.additional.stringMaker.MakerForString;
import home_work_5.additional.stringMaker.supplier.WarAndPeaceToStringSupplier;

import java.io.IOException;
import java.util.function.Supplier;

/**
 * Класс с точкой входа для MakerForString и ISearchEngine
 */
public class SearchMain {
    public static void main(String[] args) throws IOException {

        Supplier<String> stringFromFile = new WarAndPeaceToStringSupplier();
        MakerForString handler = new MakerForString();

        // считываем текс из файла и получаем обработанную строку
     //   String text = handler.makeText();
        String text = handler.getStringWithText(stringFromFile.get());

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
         с помощью EasySearch с учетом регистра
         */
        ISearchEngine searchEasySearch = new EasySearch();
        System.out.println("В тексте с учетом регистра:");
        System.out.println("Слово \"война\" в тексте встречается: " + searchEasySearch.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEasySearch.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEasySearch.search(text, "мир") + " раз");
        System.out.println("_______________");

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
        с помощью RegExSearch с учётом регистра
         */
        ISearchEngine searchRegExSearch = new RegExSearch();
        System.out.println("В тексте с учетом регистра (поиск через регулярные выражения):");
        System.out.println("Слово \"война\" в тексте встречается: " + searchRegExSearch.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchRegExSearch.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchRegExSearch.search(text, "мир") + " раз");
        System.out.println("_______________");

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
        с помощью EasySearch без учета регистра используя декоратор SearchEngineIgnoreCase
         */
        ISearchEngine searchEngineIgnoreCase = new SearchEngineIgnoreCase(searchEasySearch);
        System.out.println("В тексте без учета регистра:");
        System.out.println("Слово \"война\" в тексте встречается: " + searchEngineIgnoreCase.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEngineIgnoreCase.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEngineIgnoreCase.search(text, "мир") + " раз");
        System.out.println("_______________");

        /* получаем информацию как часто встречаются слова "война", "и" (как союз), "мир"
         с помощью RegExSearch без учета регистра, используя декоратор SearchEngineIgnoreCase
         */
        ISearchEngine searchEngineIgnoreCase2 = new SearchEngineIgnoreCase(searchRegExSearch);
        System.out.println("В тексте без учета регистра (поиск через регулярные выражения):");
        System.out.println("Слово \"война\" в тексте встречается: " + searchEngineIgnoreCase2.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEngineIgnoreCase2.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEngineIgnoreCase2.search(text, "мир") + " раз");
        System.out.println("_______________");

        /*получаем информацию как часто встречаются слова "война", "и" (как союз), "мир" и удаляем нежелательные символы
         с помощью RegExSearch без учета регистра, используя декораторы SearchEngineIgnoreCase и SearchEnginePunctuationNormalizer
         */
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(searchEngineIgnoreCase2);
        System.out.println("В тексте без учета регистра и нежелательных символов (поиск через регулярные выражения):");
        System.out.println("Слово \"война\" в тексте встречается: " + searchEnginePunctuationNormalizer.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchEnginePunctuationNormalizer.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchEnginePunctuationNormalizer.search(text, "мир") + " раз");
        System.out.println("_______________");

        /*получаем информацию как часто встречаются слова "война", "и" (как союз), "мир" и удаляем нежелательные символы
         с помощью RegExSearch без учета регистра и без учета падежей, используя декораторы
         SearchEngineIgnoreCase, SearchEnginePunctuationNormalizer и SearchEngineCaseNormalizer
         */
        ISearchEngine searchSearchEngineCaseNormalizer = new SearchEnginePunctuationNormalizer(new SearchEngineIgnoreCase
                (new SearchEngineCaseNormalizer(new RegExSearch())));
        System.out.println("В тексте без учета регистра и падежей, без нежелательных символов (поиск через регулярные выражения):");
        System.out.println("Слово \"война\" в тексте встречается: " + searchSearchEngineCaseNormalizer.search(text, "война") + " раз");
        System.out.println("Союз \"и\" в тексте встречается: " + searchSearchEngineCaseNormalizer.search(text, "и") + " раз");
        System.out.println("Слово \"мир\" в тексте встречается: " + searchSearchEngineCaseNormalizer.search(text, "мир") + " раз");
    }
}