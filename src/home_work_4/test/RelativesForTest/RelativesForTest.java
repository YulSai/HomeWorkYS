package home_work_4.test.RelativesForTest;

import java.util.Objects;

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

    /**
     * Метод сравнивает объект RelativesForTest с другим объектом
     *
     * @param obj объект, c которым необходимо сравнить текущий объект
     * @return если объекты равны - true, если объекты не равны - false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        RelativesForTest other = (RelativesForTest) obj;
        return Objects.equals(age, other.age) && Objects.equals(name, other.name) && Objects.equals(remove, other.remove);
    }

    /**
     * Метод получает hash-сode объекта по полям name, age, remove
     *
     * @return hash-сode объекта
     */

    @Override
    public int hashCode() {
        return Objects.hash(name, age, remove);
    }
}