package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    /* В классе описаны методы для сортировки массивов при помощи foreach:
        allElements - для вывода всех элементов массива
        everySecondElements - для вывода каждого второго элемента массива
        reverseOrderElements - для вывода всех элементов массива в обратном порядке
        @param length - длина массива
        @param result - результат сортировки
        Результаты сортировок выведены в консоль*/
    int length;
    int i;


    @Override
    public String allElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод всех элементов с помощью foreach");

        for (int j : container) {
            result.append(j).append(" ");
        }
        return String.valueOf(result);
    }

    @Override
    public String everySecondElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод каждого второго элемента с помощью foreach");

        i = 0;
        for (int j : container) {
            if (i % 2 != 0) {
                result.append(j).append(" ");
            }
            i++;
        }
        return String.valueOf(result);
    }

    @Override
    public String reverseOrderElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод в обратном порядке с помощью foreach");

        for (int j : container) {
            result = new StringBuilder(j + " " + result);

        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        int[] container;
        container = ArraysUtils.arrayRandom(50, 100);

        ForEachOperation mas = new ForEachOperation();
        System.out.println(mas.allElements(container));
        System.out.println();

        System.out.println(mas.everySecondElements(container));
        System.out.println();

        System.out.println(mas.reverseOrderElements(container));
    }
}