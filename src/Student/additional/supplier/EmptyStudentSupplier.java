package Student.additional.supplier;

import Student.additional.Student;

import java.util.function.Supplier;

public class EmptyStudentSupplier implements Supplier<Student> {

    @Override
    public Student get() {
        return new Student();
    }
}