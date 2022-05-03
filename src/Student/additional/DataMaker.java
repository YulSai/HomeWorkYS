package Student.additional;

import Student.additional.random.RandomForStudent;
import Student.additional.supplier.RusNameFromArraySupplier;
import Student.additional.supplier.StudentWithNameAndIdSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Класс с методами для операций с данными
 */

public class DataMaker {
    RandomForStudent random = new RandomForStudent();
    Supplier<Student> students = new StudentWithNameAndIdSupplier(new RusNameFromArraySupplier());

    /**
     * Метод создает список объектов типа T
     *
     * @param supplier реализация интерфейса Supplier с набором характеристик
     * @param amt      количество объектов, которые должны быть добавлены в список
     * @param <T>      обобщенный тип объектов
     * @return список объектов типа T
     */
    public static <T> List<T> makeList(Supplier<T> supplier, int amt) {
        List<T> data = new ArrayList<>();

        for (int i = 0; i < amt; i++) {
            data.add(supplier.get());
        }
        return data;
    }

    /**
     * Метод создает новый список с элементами, соответствующими критериям фильтрации
     *
     * @param listOfStudents исходный список
     * @return новый отфильтрованный список объектов класса Student
     */
    public static <T> List<T> filterAgeAndMark(List<T> listOfStudents, Predicate<T> filter) {
        List<T> filteredData = new ArrayList<>();

        for (T item : listOfStudents) {
            if (filter.test(item)) {
                filteredData.add(item);
            }
        }
        return filteredData;
    }

    /**
     * Метод выводит первые n элементов списка
     *
     * @param data список объектов, для которых нужно вывести
     * @param amt  количество элементов, которые нужно вывести на печать
     */
    public static <T> void printTop(List<T> data, int amt) {
        int count = 0;
        for (T item : data) {
            System.out.println(item);
            if (count++ >= amt - 1)
                break;
        }
    }

    /**
     * Метод выводит первые n элементов T extends Student для каждого возраста
     *
     * @param data список объектов, для которых нужно вывести
     * @param amt  количество элементов, которые нужно вывести на печать
     */
    public static <T extends Student> void printTopAgeWithMark(List<T> data, int amt) {
        int currentAge = 0;
        int counter = 0;

        for (T item : data) {
            if (currentAge != item.getAge()) {
                currentAge = item.getAge();
                System.out.println();
                System.out.println("Топ-10 студентов по оценке в возрасте " + currentAge + ":");
                counter = 0;
            }
            if (counter < amt) {
                System.out.println(item);
                counter++;
            }
        }
    }
}

