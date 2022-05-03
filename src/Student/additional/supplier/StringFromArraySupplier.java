package Student.additional.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StringFromArraySupplier implements Supplier<String> {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private final String[] names;
    private final int from;
    private final int to;


    public StringFromArraySupplier(String[] names, int from, int to) {
        this.names = names;
        this.from = from;
        this.to = to;
    }

    /**
     * Метод получает рандомное имя
     *
     * @return рандомное имя
     */
    @Override
    public String get() {
        String name;
        do {
            name = names[random.nextInt(names.length)];
        } while (name.length() < from || name.length() > to);

        return name;
    }
}
