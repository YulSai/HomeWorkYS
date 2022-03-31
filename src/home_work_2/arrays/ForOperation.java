package home_work_2.arrays;

import home_work_2.utils.IArraysOperation;

import static home_work_2.utils.ArraysUtils.arrayRandom;

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
    String result;

    // Метод для вывода всех элементов массива
    @Override
    public void allElements(int[] container) {
        length = container.length;

        System.out.println("Вывод всех элементов с помощью for");
        result = "";
        for (i = 0; i < length; i++) {
            result += container[i] + " ";
        }
        System.out.println(result);
        System.out.println();
    }

    // Метод для вывода каждого второго элемента массива
    @Override
    public void everySecondElements(int[] container) {
        length = container.length;

        System.out.println("Вывод каждого второго элемента с помощью for");
        result = "";
        for (i = 1; i < length; i += 2) {
            result += container[i] + " ";
        }
        System.out.println(result);
        System.out.println();
    }

    // Метод для вывода всех элементов массива в обратном порядке
    @Override
    public void reverseOrderElements(int[] container) {
        length = container.length;

        System.out.println("Вывод в обратном порядке с помощью for");
        result = "";
        for (i = length - 1; i >= 0; i--) {
            result += container[i] + " ";
        }
        System.out.println(result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] container;
        container = arrayRandom(50, 100);

        ForOperation mas = new ForOperation();
        mas.allElements(container);
        mas.everySecondElements(container);
        mas.reverseOrderElements(container);
    }
}