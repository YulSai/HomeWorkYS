package Student.additional.supplier;

import Student.additional.Student;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StudentWithNameSupplier implements Supplier<Student> {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private final Supplier<String> names;

    public StudentWithNameSupplier(Supplier<String> names) {
        this.names = names;
    }


    @Override
    public Student get() {
        Student student = new Student();

        student.setName(names.get());
        student.setAge(random.nextInt(7, 18));
        student.setMark(random.nextInt(0, 11));
        student.setOlympiads(random.nextBoolean());


        return student;
    }
}