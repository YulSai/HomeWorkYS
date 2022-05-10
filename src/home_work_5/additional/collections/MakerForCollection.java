package home_work_5.additional.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Класс с методами создания и обработки коллекций Set и Map
 */
public class MakerForCollection {

    /**
     * Метод помещает массив строк в коллекцию Set
     *
     * @param text строка с помещенным в нее текстом из файла
     * @return значение количества использованных слов в тексте
     */
    public Set<String> createStringToSet(String text) {
        SetCollection set = new SetCollection();

        return set.createSetCollection(text);
    }

    /**
     * Метод создает коллекцию Мар, затем наполняет коллекцию List значениями
     * Key и Value из коллекции Мар и сортирует по количеству и наименованию и
     * производит замену символа "=" на " - "
     *
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @return отсортированный по количеству и наименованию список строк
     */
    public List<String> sortMap(String text) {
        MapCollection map = new MapCollection();

        Map<String, Integer> wordsAndCount = map.createMapCollection(text);
        List<Map.Entry<String, Integer>> list = map.sortFromMap(wordsAndCount);

        return map.formatListFromString(list);
    }

    /**
     * Метод выводит n Топ использованных в тексте слов
     *
     * @param list отсортированный по количеству и наименованию список строк
     * @param amt  количество позиций для вывода в Топ
     */
    public void printTopMap(List<String> list, int amt) {

        int count = 0;
        for (String s : list) {
            System.out.print(s + " раз; " + " / ");
            if (count++ >= amt - 1)
                break;
        }
    }
}