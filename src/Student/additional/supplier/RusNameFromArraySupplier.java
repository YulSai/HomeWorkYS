package Student.additional.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RusNameFromArraySupplier implements Supplier<String> {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private static final String[] nameRus = {"Иван", "Андрей", "Яков", "Юрий", "Татьяна", "Мария", "Авдотья", "Елизавета",
            "Станислав", "Радомир", "Добромила", "Рада", "Ждан", "Пересвет", "Лада", "Любава", "Вилен",
            "Роман", "Игорь", "Олег", "Нинель", "Ярослава"};


    private final Supplier<String> namesSupplier;

    public RusNameFromArraySupplier() {
        this.namesSupplier = new StringFromArraySupplier(nameRus, 3, 11);
    }

    @Override
    public String get() {
        return namesSupplier.get();
    }

}
