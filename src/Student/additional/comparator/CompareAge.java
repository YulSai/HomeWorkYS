package Student.additional.comparator;

import Student.additional.Student;

import java.util.Comparator;

/**
 * Класс имплементирующий интерфейс Comparator для сортировки элементов объекта по возрасту
 */
public class CompareAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getAge() - o2.getAge());
    }
}