package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.*;

public class ArraysIteration {
        /* В классе описаны методы для сортировки массивов при помощи do....while, while, for, foreach:
        allElements - для вывода всех элементов массива
        everySecondElements - для вывода каждого второго элемента массива
        reverseOrderElements - для вывода всех элементов массива в обратном порядке
        @param length - длина массива
        @param result - результат сортировки
        Результаты сортировок выведены в консоль*/

    public static int[] allElements(int[] container) {
        int length;
        int i;
        String result;

        length = container.length;

        System.out.println("Вывод всех элементов с помощью for");
        result = "";
        for (i = 0; i < length; i++) {
            result += container[i] + " ";
        }
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод всех элементов с помощью while");
        result = "";
        i = 0;
        while (i < length) {
            result += container[i] + " ";
            i++;
        }
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод всех элементов с помощью do...while");
        result = "";
        i = 0;
        do {
            result += container[i] + " ";
            i++;
        } while (i < length);
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод всех элементов с помощью foreach");
        result = "";
        for (int j : container) {
            result += j + " ";
        }

        System.out.println(result);

        return container;
    }

    public static int[] everySecondElements(int[] container) {
        int length;
        int i = 0;
        String result;

        length = container.length;

        System.out.println("Вывод каждого второго элемента с помощью for");
        result = "";
        for (i = 1; i < length; i += 2) {
            result += container[i] + " ";
        }
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью while");
        result = "";
        i = 1;
        while (i < length) {
            result += container[i] + " ";
            i += 2;
        }
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью do...while");
        result = "";
        i = 1;
        do {
            result += container[i] + " ";
            i += 2;
        } while (i < length);
        System.out.println(result);
        System.out.println();

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

        return container;
    }

    public static int[] reverseOrderElements(int[] container) {
        int length;
        int i = 0;
        String result;

        length = container.length;

        System.out.println("Вывод в обратном порядке с помощью for");
        result = "";
        for (i = length - 1; i >= 0; i--) {
            result += container[i] + " ";
        }
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью while");
        result = "";
        i = length - 1;
        while (i >= 0) {
            result += container[i] + " ";
            i--;
        }
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью do...while");
        result = "";
        i = length - 1;
        do {
            result += container[i] + " ";
            i--;
        } while (i >= 0);
        System.out.println(result);
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью foreach");
        result = "";
        for (int j : container) {
            result = j + " " + result;
        }
        System.out.println(result);

        return container;
    }

    public static void main(String[] args) {
        int[] container;

        container = arrayFromConsole();

        allElements(container);
        System.out.println();

        everySecondElements(container);
        System.out.println();

        reverseOrderElements(container);
        System.out.println();
    }
}
