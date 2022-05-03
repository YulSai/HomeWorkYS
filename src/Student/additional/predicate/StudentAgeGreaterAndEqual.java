package Student.additional.predicate;

import Student.additional.Student;

import java.util.function.Predicate;

public class StudentAgeGreaterAndEqual implements Predicate<Student> {

    private final int minAge;

    public StudentAgeGreaterAndEqual(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public boolean test(Student item) {
        return item.getAge() >= minAge;
    }
}
