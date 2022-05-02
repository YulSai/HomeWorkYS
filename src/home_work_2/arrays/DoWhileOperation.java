package home_work_2.arrays;

import home_work_2.utils.IArraysOperation;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class DoWhileOperation implements IArraysOperation {
     /* В классе описаны методы для сортировки массивов при помощи do....while:
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

        System.out.println("Вывод всех элементов с помощью do...while");
        i = 0;
        do {
            result.append(container[i]).append(" ");
            i++;
        } while (i < length);

        return String.valueOf(result);
    }

    @Override
    public String everySecondElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод каждого второго элемента с помощью do...while");

        i = 1;
        do {
            result.append(container[i]).append(" ");
            i += 2;
        } while (i < length);

        return String.valueOf(result);
    }

    @Override
    public String reverseOrderElements(int[] container) {
        length = container.length;
        StringBuilder result = new StringBuilder();

        if(length == 0) {
            return "";
        }

        System.out.println("Вывод в обратном порядке с помощью do...while");

        i = length - 1;
        do {
            result.append(container[i]).append(" ");
            i--;
        } while (i >= 0);

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        int[] container;
        container = arrayRandom(50, 100);

        DoWhileOperation mas = new DoWhileOperation();
        System.out.println(mas.allElements(container));
        System.out.println();

        System.out.println(mas.everySecondElements(container));
        System.out.println();

        System.out.println(mas.reverseOrderElements(container));
    }
}