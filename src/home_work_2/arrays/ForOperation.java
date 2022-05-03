package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.IArraysOperation;

public class ForOperation implements IArraysOperation {
    /* В классе описаны методы для сортировки массивов при помощи for:
        allElements - для вывода всех элементов массива
        everySecondElements - для вывода каждого второго элемента массива
        reverseOrderElements - для вывода всех элементов массива в обратном порядке
        @param length - длина массива
        @param result - результат сортировки
        Результаты сортировок выведены в консоль*/
    int length;
    int i;

    // Метод для вывода всех элементов массива
    @Override
    public String allElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод всех элементов с помощью for");

        for (i = 0; i < length; i++) {
            result.append(container[i]).append(" ");
        }

        return String.valueOf(result);
    }

    // Метод для вывода каждого второго элемента массива
    @Override
    public String everySecondElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод каждого второго элемента с помощью for");

        for (i = 1; i < length; i += 2) {
            result.append(container[i]).append(" ");
        }

        return String.valueOf(result);
    }

    // Метод для вывода всех элементов массива в обратном порядке
    @Override
    public String reverseOrderElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод в обратном порядке с помощью for");

        for (i = length - 1; i >= 0; i--) {
            result.append(container[i]).append(" ");
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        int[] container;
        container = ArraysUtils.arrayRandom(50, 100);

        ForOperation mas = new ForOperation();
        System.out.println(mas.allElements(container));
        System.out.println();

        System.out.println(mas.everySecondElements(container));
        System.out.println();

        System.out.println(mas.reverseOrderElements(container));
    }
}