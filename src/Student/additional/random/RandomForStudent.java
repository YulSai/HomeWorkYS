package Student.additional.random;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomForStudent {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    /**
     * Метод генерирует рандомное сочетание букв русского алфавита
     *
     * @return рандомное имя сочетание букв русского алфавита
     */
    public String nameRandomSymbols() {
        StringBuilder strName = new StringBuilder();
        int lengthName = random.nextInt(3, 11);
        char[] symbolForName = new char[lengthName];

        for (int i = 0; i < lengthName; i++) {
            symbolForName[i] = (char) random.nextInt(1040, 1103);
            strName.append(symbolForName[i]);
        }
        return strName.toString();
    }

    /**
     * Метод получает рандомное имя из предложенных имен
     *
     * @return рандомное имя
     */
    public String RandomUnderstandable() {
        String[] nameRus = {"Иван", "Андрей", "Яков", "Юрий", "Татьяна", "Мария", "Авдотья", "Елизавета",
                "Станислав", "Радомир", "Добромила", "Рада", "Ждан", "Пересвет", "Лада", "Любава", "Вилен",
                "Роман", "Игорь", "Олег", "Нинель", "Ярослава"};

        int index_name = random.nextInt(0, nameRus.length - 1);

        return nameRus[index_name];
    }

    /**
     * Метод генерирует рандомное целое число от 7 до 17 включительно
     *
     * @return рандомное число
     */
    public int ageRandom() {
        return random.nextInt(7, 18);
    }

    /**
     * Метод генерирует рандомное вещественное число от 0 до 10 включительно
     *
     * @return рандомное число
     */
    public double markRandom() {
        return random.nextInt(0, 11);
    }

    /**
     * Метод генерирует рандомное значение true или false
     *
     * @return true или false
     */
    public boolean isOlympiadsRandom() {
        return random.nextBoolean();
    }

    /**
     * Метод получает рандомное имя из списка имен
     *
     * @param nameFromFile список с именами
     * @return имя типа String
     */
    public String RandomNameFromFile(List<String> nameFromFile) {
        return (nameFromFile.get(random.nextInt(nameFromFile.size())));
    }
}