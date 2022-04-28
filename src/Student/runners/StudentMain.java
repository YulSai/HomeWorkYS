package Student.runners;

import Student.additional.Student;
import Student.additional.StudentListMake;
import Student.additional.comparator.ComparatorMark;
import Student.additional.comparator.ComparatorName;
import Student.additional.comparator.CompareAge;

import java.io.IOException;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        StudentListMake list = new StudentListMake();

        List<Student> listOfStudentsSymbols = list.makeStudentList(1000);
        System.out.println("Список студентов: " + listOfStudentsSymbols);
        System.out.println();

        List<Student> listOfStudents = list.makeStudentListFromFile(1000);
        System.out.println("Список студентов из файла: " + listOfStudents);
        System.out.println();

        List<Student> filteredStudents = list.filterAgeAndMark(listOfStudents, 12, 8);
        System.out.println("Cписок студентов, отфильтрованных по возрасту и оценкам: " + filteredStudents);
        System.out.println();

        System.out.println("Средний возраст отфильтрованных студентов: " + list.getAverageAge(filteredStudents));
        System.out.println();

        filteredStudents.sort(new ComparatorName());
        System.out.println("Cписок отфильтрованных студентов по имени: " + filteredStudents);
        System.out.println();

        filteredStudents.sort(new ComparatorMark());
        System.out.println("Cписок отфильтрованных студентов по оценке: " + filteredStudents);
        System.out.println();

        filteredStudents.sort(new CompareAge().thenComparing(new ComparatorMark()));
        System.out.println("Топ-10 студентов по оценке в каждой возрастной категории:");
        list.printTopAgeWithMark(filteredStudents, 10);
    }
}
