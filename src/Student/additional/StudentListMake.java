package Student.additional;

import Student.additional.random.RandomForStudent;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentListMake {
    RandomForStudent random = new RandomForStudent();

    /**
     * Метод создает список объектов класса Student с порядковым номером и рандомными именами,
     * возрастом, оценками и признаком участия в олимпиаде
     *
     * @param amt количество объектов, которые должны быть добавлены в список
     * @return список объектов класса Student
     */
    public List<Student> makeStudentList(int amt) {
        List<Student> listOfStudents = new ArrayList<>();
        for (int i = 1; i <= amt; i++) {
            int number = i;
            String name = random.RandomUnderstandable();
            int age = random.ageRandom();
            double mark = random.markRandom();
            boolean isOlympiads = random.isOlympiadsRandom();
            listOfStudents.add(new Student(number, name, age, mark, isOlympiads));
        }
        return listOfStudents;
    }

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
        for (int i = 1; i <= amt; i++) {
            int number = i;
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
     * Метод создает новый список с элементами, соответствующими критериям фильтрации
     *
     * @param listOfStudents исходный список
     * @param minAge         критерий минимального возраста
     * @param minMark        критерий минимальной оценки
     * @return новый отфильтрованный список объектов класса Student
     */
    public List<Student> filterAgeAndMark(List<Student> listOfStudents, int minAge, double minMark) {
        List<Student> listOfStudentsAfterFilter = new ArrayList<>();

        for (Student student : listOfStudents) {
            if (student.getAge() >= minAge && student.getMark() >= minMark) {
                listOfStudentsAfterFilter.add(student);
            }
        }
        return listOfStudentsAfterFilter;
    }

    /**
     * Метод для расчета среднего возраста студентов из списка.
     *
     * @param listOfStudents список для расчета среднего возраста
     * @return значение среднего возраста
     */
    public int getAverageAge(List<Student> listOfStudents) {
        int sum = 0;
        int amt = listOfStudents.size();

        for (Student student : listOfStudents) {
            sum += student.getAge();
        }

        return sum / amt;
    }

    /**
     * Метод выводит первые n элементов списка
     *
     * @param listOfStudents список объектов, для которых нужно вывести
     * @param amt            количество элементов, которые нужно вывести на печать
     */
    public void printTop(List<Student> listOfStudents, int amt) {
        int count = 0;
        for (Student student : listOfStudents) {
            System.out.println(student);
            if (count == amt - 1)
                break;
            count++;
        }
    }

    /**
     * Метод выводит первые n элементов объекта класса Student для каждого возраста
     *
     * @param listOfStudents список объектов, для которых нужно вывести
     * @param amt            количество элементов, которые нужно вывести на печать
     */
    public void printTopAgeWithMark(List<Student> listOfStudents, int amt) {
        int currentAge = 0;
        int counter = 0;

        for (Student student : listOfStudents) {
            int tmp = student.getAge();

            if (currentAge != tmp) {
                currentAge = tmp;
                System.out.println();
                System.out.println("Топ-10 студентов по оценке в возрасте " + currentAge + ":");
                counter = 0;
            }
            if (counter < amt) {
                System.out.println(student);
                counter++;
            }
        }
    }
}

