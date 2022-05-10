package home_work_5.additional.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс с методами создания и обработки коллекции Set
 */
public class SetCollection {

    /**
     * Метод создает коллекцию Set и наполняет ее словами из текста
     *
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @return коллекцию Set типа String
     */
    public Set<String> createSetCollection(String text) {
        Set<String> wordsFromText = new HashSet<>();

        Pattern pattern = Pattern.compile("[0-9a-zA-ZА-яЁё]+-?[0-9a-zA-ZА-яЁё]*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group();
            wordsFromText.add(word);
        }
        return wordsFromText;
    }
}