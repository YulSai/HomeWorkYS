package Student.additional.random;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomForStudent {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    /**
     * Метод получает рандомное имя из списка имен
     *
     * @param nameFromFile список с именами
     * @return имя типа String
     */
    public String RandomNameFromFile(List<String> nameFromFile) {
        return (nameFromFile.get(random.nextInt(nameFromFile.size())));
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
}