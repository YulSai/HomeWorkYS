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
    String result;

    @Override
    public void allElements(int[] container) {
        length = container.length;

        System.out.println("Вывод всех элементов с помощью do...while");
        result = "";
        i = 0;
        do {
            result += container[i] + " ";
            i++;
        } while (i < length);
        System.out.println(result);
        System.out.println();
    }

    @Override
    public void everySecondElements(int[] container) {
        length = container.length;

        System.out.println("Вывод каждого второго элемента с помощью do...while");
        result = "";
        i = 1;
        do {
            result += container[i] + " ";
            i += 2;
        } while (i < length);
        System.out.println(result);
        System.out.println();
    }

    @Override
    public void reverseOrderElements(int[] container) {
        length = container.length;

        System.out.println("Вывод в обратном порядке с помощью do...while");
        result = "";
        i = length - 1;
        do {
            result += container[i] + " ";
            i--;
        } while (i >= 0);
        System.out.println(result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] container;
        container = arrayRandom(50, 100);

        DoWhileOperation mas = new DoWhileOperation();
        mas.allElements(container);
        mas.everySecondElements(container);
        mas.reverseOrderElements(container);
    }
}