package home_work_5.additional.collections;

import java.util.List;
import java.util.Map;

/**
 * Класс с методами создания и обработки коллекций Set и Map
 */
public class MakerForCollection {

    /**
     * Метод помещает обработанную строку из файла в коллекцию Set
     *
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @return значение количества использованных слов в тексте
     */
    public int createStringToSet(String text) {
        SetCollection set = new SetCollection();
        return set.createSetCollection(text);
    }

    /**
     * Метод помещает обработанную строку из файла в коллекцию Мар, затем наполняет коллекцию List значениями
     * Key и Value из коллекции Мар и сортирует по количеству и наименованию
     *
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @return отсортированный по количеству и наименованию список строк
     */
    public List<Map.Entry<String, Integer>> sortMap(String text) {
        MapCollection map = new MapCollection();
        Map<String, Integer> wordsAndCount = map.createMapCollection(text);
        return map.sortFromMap(wordsAndCount);
    }

    /**
     * Метод выводит n Топ использованных в тексте слов
     *
     * @param list   отсортированный по количеству и наименованию список строк
     * @param amount количество позиций для вывода в Топ
     */
    public String printTopMap(List<Map.Entry<String, Integer>> list, int amount) {
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, Integer> s : list) {
            if (amount-- <= 0) {
                break;
            }
            builder.append(s.getKey()).append(" - ").append(s.getValue()).append(" раз / ");

        }
        return builder.toString();
    }
}