package home_work_2.arrays;

import home_work_2.utils.IArraysOperation;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class WhileOperation implements IArraysOperation {
    /* В классе описаны методы для сортировки массивов при помощи while:
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

        System.out.println("Вывод всех элементов с помощью while");
        result = "";
        i = 0;
        while (i < length) {
            result += container[i] + " ";
            i++;
        }
        System.out.println(result);
        System.out.println();
    }

    @Override
    public void everySecondElements(int[] container) {
        length = container.length;

        System.out.println("Вывод каждого второго элемента с помощью while");
        result = "";
        i = 1;
        while (i < length) {
            result += container[i] + " ";
            i += 2;
        }
        System.out.println(result);
        System.out.println();
    }

    @Override
    public void reverseOrderElements(int[] container) {
        length = container.length;

        System.out.println("Вывод в обратном порядке с помощью while");
        result = "";
        i = length - 1;
        while (i >= 0) {
            result += container[i] + " ";
            i--;
        }
        System.out.println(result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] container;
        container = arrayRandom(50, 100);

        WhileOperation mas = new WhileOperation ();
        mas.allElements(container);
        mas.everySecondElements(container);
        mas.reverseOrderElements(container);
    }
}
