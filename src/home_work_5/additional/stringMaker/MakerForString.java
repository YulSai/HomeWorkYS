package home_work_5.additional.stringMaker;

/**
 * Класс с методами обработки текса из файла
 */
public class MakerForString {

    /**
     * Метод считывает текст из файла и помещает его в строку
     *
     * @return строку с помещенным в нее текстом из файла
     */
    public String createTextToString() {
        String fileName = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\home_work_5\\resources\\Война и мир_книга.txt";
        FileToString reader = new FileToString();

        return reader.readerToString(fileName);
    }

    /**
     * Метод обрабатывает текст в строке, удаляя из нее часть нежелательных символов
     *
     * @param text строка с помещенным в нее текстом из файла
     * @return обработанную строку без нежелательных символов
     */
    public String handleString(String text) {
        String chars = "(\n|\t|--|-\\s+|\\s+-|\\s+)";

        return text.replaceAll(chars, "  ").replaceAll("\\s{2,}", " ");
    }

    /**
     * Метод приводит текст в строке к нижнему регистру
     *
     * @param text строка с помещенным в нее текстом из файла
     * @return обработанную строку со текстом в нижнем регистре
     */
    public String getLowerCase(String text) {
        return text.toLowerCase();
    }

    /**
     * Метод форматирует строку и создает массив строк
     *
     * @param text строка с помещенным в нее текстом из файла
     * @return массив строк, элементами которого являются слова из текса
     */
    public String prepareString(String text) {
        return handleString(text);
    }
}