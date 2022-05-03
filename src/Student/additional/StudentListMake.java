package Student.additional;

import Student.additional.random.RandomForStudent;
import Student.additional.supplier.RusNameFromArraySupplier;
import Student.additional.supplier.StudentWithNameAndIdSupplier;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentListMake {
    RandomForStudent random = new RandomForStudent();

    /**
     * Метод создает список объектов класса Student с порядковым номером и именами из файла,
     * возрастом, оценками и признаком участия в олимпиаде
     *
     * @param amt количество объектов, которые должны быть добавлены в список
     * @return список объектов класса Student
     */
    public List<Student> makeStudentListFromFile(int amt) throws IOException {
        List<Student> listOfStudents = new ArrayList<>();
        String fileName = "C:/Users/yluya/IdeaProjects/JD1/HomeWork/src/Student/additional/resources/Name.txt";
        List<String> nameFromFile = readFile(fileName);
        for (int i = 0; i < amt; i++) {
            int number = i + 1;
            String name = random.RandomNameFromFile(nameFromFile);
            int age = random.ageRandom();
            double mark = random.markRandom();
            boolean isOlympiads = random.isOlympiadsRandom();
            listOfStudents.add(new Student(number, name, age, mark, isOlympiads));
        }
        return listOfStudents;
    }

    /**
     * Метод читает файл и добавляет строки из него в список
     *
     * @param fileName путь к файлу, который необходимо прочитать
     * @return список строк, находящихся в файле
     */
    public List<String> readFile(String fileName) throws IOException {
        List<String> nameFromFile = new ArrayList<>();
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

        while (scanner.hasNextLine()) {
            nameFromFile.add(scanner.nextLine());
        }
        return nameFromFile;
    }

    /**
     * Метод для расчета среднего возраста студентов из списка.
     *
     * @param listOfStudents список для расчета среднего возраста
     * @return значение среднего возраста
     */
    public double getAverageAge(List<Student> listOfStudents) {
        int sum = 0;
        int amt = listOfStudents.size();

        if (amt == 0) {
            System.out.println("В списке нет студентов!");
        } else {
            for (Student student : listOfStudents) {
                sum += student.getAge();
            }
            return (double) sum / amt;
        }
        return 0;
    }


}

