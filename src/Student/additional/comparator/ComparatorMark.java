package Student.additional.comparator;

import Student.additional.Student;

import java.util.Comparator;

/**
 * Класс имплементирующий интерфейс Comparator для сортировки элементов объекта по оценкам
 */

public class ComparatorMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getMark(), o1.getMark());
    }
}