package Student.additional.predicate;

import Student.additional.Student;

import java.util.function.Predicate;

public class StudentMarkGreater implements Predicate<Student> {
    private final double minMark;

    public StudentMarkGreater(double minMark) {
        this.minMark = minMark;
    }

    @Override
    public boolean test(Student item) {
        return item.getMark() >= minMark;
    }
}