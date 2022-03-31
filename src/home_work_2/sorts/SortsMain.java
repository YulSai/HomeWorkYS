package home_work_2.sorts;

import static home_work_2.utils.ArraysUtils.*;
import static home_work_2.utils.SortsUtils.*;

public class SortsMain {
    /* В классе произведены сортировки массивов методами пузырьковой и шейкерной сортировок.
        Методы импортированы из класса SortsUtils.
        Результаты сортировок выведены в консоль*/
    public static void main(String[] args) {
        int[] arr;

        //4.2.2.1
        arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Сортировка массива при помощи пузырьковой сортировки:");
        bubble(arr);

        System.out.println();
        System.out.println();

        arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();

        //4.2.2.2
        arr = new int[]{1, 1, 1, 1};
        System.out.println("Сортировка массива при помощи пузырьковой сортировки:");
        bubble(arr);

        System.out.println();
        System.out.println();

        arr = new int[]{1, 1, 1, 1};
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();

        //4.2.2.3
        arr = new int[]{9, 1, 5, 99, 9, 9};
        System.out.println("Сортировка массива при помощи пузырьковой сортировки:");
        bubble(arr);

        System.out.println();
        System.out.println();

        arr = new int[]{9, 1, 5, 99, 9, 9};
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();

        //4.2.2.4
        arr = new int[]{};
        System.out.println("Сортировка массива при помощи пузырьковой сортировки:");
        bubble(arr);

        System.out.println();
        System.out.println();

        arr = new int[]{};
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();

        //4.2.2.5
        arr = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println("Сортировка массива при помощи пузырьковой сортировки:");
        bubble(arr);

        System.out.println();
        System.out.println();

        arr = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();

        // 4.2.2
        arr = arrayRandom(50, 100);
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();

        arr = arrayRandom(50, 100);
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();


        // 4.2.3
        arr = arrayFromConsole();
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();

        arr = arrayFromConsole();
        System.out.println("Сортировка массива при помощи шейкерной сортировки:");
        shake(arr);

        System.out.println();
        System.out.println();
    }
}
