package home_work_2.arrays;

import java.util.Scanner;

public class ArraysIteration {
    public static void main(String[] args) {
        // перебор массива

        int[] container;

        container = home_work_2.arrays.ArraysUtils.arrayFromConsole();  // вызов метода создания массива с запросом данных с консоли

        allElements(container);                      // вызов метода вывода в консоль всех элементов массива
        System.out.println();

        everySecondElements(container);              // вызов метода вывода в консоль каждого второго элемента массива
        System.out.println();

        reverseOrderElements(container);             // вызов метода вывода в консоль всех элементов массива в обратном порядке
        System.out.println();
    }

    // Метод для вывода всех элементов массива
    public static int[] allElements(int[] container) {
        int length;
        int i;

        length = container.length;

        System.out.println("Вывод всех элементов с помощью for");
        for (i = 0; i < length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();

        System.out.println("Вывод всех элементов с помощью while");
        i = 0;
        while (i < length) {
            System.out.print(container[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("Вывод всех элементов с помощью do...while");
        i = 0;
        do {
            System.out.print(container[i] + " ");
            i++;
        } while (i < length);
        System.out.println();

        System.out.println("Вывод всех элементов с помощью foreach");
        for (int j : container) {
            System.out.print(j + " ");
        }
        return container;
    }

    // Метод для вывода каждого второго элемента массива
    public static int[] everySecondElements(int[] container) {
        int length;
        int i = 0;

        length = container.length;

        System.out.println("Вывод каждого второго элемента с помощью for");
        for (i = 1; i < length; i += 2) {
            System.out.print(container[i] + " ");
        }
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью while");
        i = 1;
        while (i < length) {
            System.out.print(container[i] + " ");
            i += 2;
        }
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью do...while");
        i = 1;
        do {
            System.out.print(container[i] + " ");
            i += 2;
        } while (i < length);
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью for");
        i = 0;
        for (int j : container) {
            if (i % 2 != 0) {
                System.out.print(j + " ");
            }
            i++;
        }

        return container;
    }

    // Метод для вывода всех элементов массива в обратном порядке
    public static int[] reverseOrderElements(int[] container) {
        int length;
        int i = 0;

        length = container.length;

        System.out.println("Вывод в обратном порядке с помощью for");
        for (i = length - 1; i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью while");
        i = length - 1;
        while (i >= 0) {
            System.out.print(container[i] + " ");
            i--;
        }
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью do...while");
        i = length - 1;
        do {
            System.out.print(container[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью foreach");
        String result = "";
        for (int j : container) {
            result = j + " " + result;
        }
        System.out.println(result);

        return container;
    }
}
