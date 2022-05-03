package Student.additional.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RusNameFromRandomCharacterSupplier implements Supplier<String> {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private final int from;
    private final int to;

    public RusNameFromRandomCharacterSupplier(int from, int to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Метод генерирует рандомное сочетание букв русского алфавита
     *
     * @return рандомное имя сочетание букв русского алфавита
     */
    @Override
    public String get() {
        StringBuilder strName = new StringBuilder();
        int lengthName = random.nextInt(from, to);

        for (int i = 0; i < lengthName; i++) {
            strName.append((char) random.nextInt(1040, 1103));
        }
        return strName.toString();
    }
}
