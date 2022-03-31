package home_work_2.arrays;

import home_work_2.utils.IArraysOperation;

import static home_work_2.utils.ArraysUtils.arrayRandom;

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
    String result;

    @Override
    public void allElements(int[] container) {
        length = container.length;

        System.out.println("Вывод всех элементов с помощью foreach");
        result = "";
        for (int j : container) {
            result += j + " ";
        }

        System.out.println(result);
    }

    @Override
    public void everySecondElements(int[] container) {
        length = container.length;

        System.out.println("Вывод каждого второго элемента с помощью foreach");
        result = "";
        i = 0;
        for (int j : container) {
            if (i % 2 != 0) {
                result += j + " ";
            }
            i++;
        }
        System.out.println(result);
        System.out.println();
    }

    @Override
    public void reverseOrderElements(int[] container) {
        length = container.length;

        System.out.println("Вывод в обратном порядке с помощью foreach");
        result = "";
        for (int j : container) {
            result = j + " " + result;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] container;
        container = arrayRandom(50, 100);

        ForEachOperation mas = new ForEachOperation();
        mas.allElements(container);
        mas.everySecondElements(container);
        mas.reverseOrderElements(container);
    }
}