package Student.runners;

import Student.additional.Student;
import Student.additional.StudentListMake;
import Student.additional.comparator.ComparatorMark;
import Student.additional.comparator.CompareAge;
import Student.additional.predicate.StudentAgeGreaterAndEqual;
import Student.additional.predicate.StudentMarkGreater;
import Student.additional.supplier.RusNameFromArraySupplier;
import Student.additional.supplier.StudentWithNameAndIdSupplier;
import home_work_4.additional.сomparator.ComparatorComparable;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static Student.additional.DataMaker.*;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        StudentListMake listFromFile = new StudentListMake();

        Supplier<Student> students = new StudentWithNameAndIdSupplier(new RusNameFromArraySupplier());
        Predicate<Student> filter = new StudentAgeGreaterAndEqual(12).and(new StudentMarkGreater(8));

        // создаем список объектов класса Student с реализацией интерфейса Supplier
        List<Student> listOfStudents2 = makeList(students, 1000);
        System.out.println("Список студентов: " + listOfStudents2);
        System.out.println();

        //// создаем список объектов класса Student из файла
        List<Student> listOfStudents = listFromFile.makeStudentListFromFile(1000);
        System.out.println("Список студентов из файла: " + listOfStudents);
        System.out.println();

        List<Student> filteredStudents = filterAgeAndMark(listOfStudents, filter);
        System.out.println("Cписок студентов, отфильтрованных по возрасту и оценкам: " + filteredStudents);
        System.out.println();

        System.out.printf("Средний возраст отфильтрованных студентов: " + "%2.1f", listFromFile.getAverageAge(filteredStudents));
        System.out.println("\n");

        filteredStudents.sort(new ComparatorComparable<>());
        System.out.println("Топ-10 отфильтрованных студентов по имени: ");
        printTop(filteredStudents, 10);
        System.out.println();

        filteredStudents.sort(new ComparatorMark());
        System.out.println("Топ-10 отфильтрованных студентов по оценке: ");
        printTop(filteredStudents, 10);
        System.out.println();

        filteredStudents.sort(new CompareAge().thenComparing(new ComparatorMark()));
        System.out.println("Топ-10 студентов по оценке в каждой возрастной категории:");
        printTopAgeWithMark(filteredStudents, 10);
    }
}
