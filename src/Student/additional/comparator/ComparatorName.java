package Student.additional.comparator;

import Student.additional.Student;

import java.util.Comparator;

/**
 * Класс имплементирующий интерфейс Comparator для сортировки элементов объекта по имени
 */
public class ComparatorName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
