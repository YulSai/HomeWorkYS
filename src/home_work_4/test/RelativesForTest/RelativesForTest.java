package home_work_4.test.RelativesForTest;

/**
 * Дополнительный класс для тестирования
 */
public class RelativesForTest {
    private final String remove;
    private String name;
    private double age;

    public RelativesForTest(String name, String remove, double age) {
        this.remove = remove;
        this.name = name;
        this.age = age;

    }

    public String getRemove() {
        return remove;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String toString() {
        return remove + " " + name + ", age=" + age + ";";
    }
}