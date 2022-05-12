package home_work_5.additional.collections;

import home_work_5.additional.collections.comporator.ComparatorForListFromMapCount;
import home_work_5.additional.collections.comporator.ComparatorForListFromMapTitle;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс с методами создания и обработки коллекции Мар
 */
public class MapCollection {

    /**
     * Метод создает коллекцию Мар, помещая в Key наименование (слово), а в Value количество,
     * сколько раз встречается в тексте это слово
     *
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @return коллекцию Мар со словами и их количеством в тексте
     */
    public Map<String, Integer> createMapCollection(String text) {
        Map<String, Integer> wordsAndCount = new HashMap<>();

        Pattern pattern = Pattern.compile("[0-9a-zA-ZА-яЁё]+(-?[0-9a-zA-ZА-яЁё])*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group();
            Integer counter = wordsAndCount.get(word);

            wordsAndCount.put(word, counter == null ? 1 : counter + 1);
        }
        return wordsAndCount;
    }

    /**
     * Метод наполняет коллекцию List значениями Key и Value из коллекции Мар и сортирует по количеству и наименованию
     *
     * @param wordsAndCount коллекция Мар со словами и их количеством в тексте
     * @return отсортированную коллекцию List типа Map.Entry<String, Integer>
     */
    public List<Map.Entry<String, Integer>> sortFromMap(Map<String, Integer> wordsAndCount) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsAndCount.entrySet());
        list.sort(new ComparatorForListFromMapCount().thenComparing(new ComparatorForListFromMapTitle()));
        return list;
    }
}