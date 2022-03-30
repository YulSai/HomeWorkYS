package home_work_2.arrays;

import java.util.Scanner;

public class ArraysIteration {
    public static void main(String[] args) {
        // перебор массива

        int[] container;

        container = ArraysUtils.arrayFromConsole();  // вызов метода создания массива с запросом данных с консоли

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

        length = container.length;                      // присваиваем значение переменной длины массива

        System.out.println("Вывод всех элементов с помощью for");
        for (i = 0; i < length; i++) {                  // цикл для перебора каждого элемента массива
            System.out.print(container[i] + " ");       // вывод результата в консоль
        }
        System.out.println();

        System.out.println("Вывод всех элементов с помощью while");
        i = 0;
        while (i < length) {                            // цикл для перебора каждого элемента массива
            System.out.print(container[i] + " ");       // вывод результата в консоль
            i++;
        }
        System.out.println();

        System.out.println("Вывод всех элементов с помощью do...while");
        i = 0;
        do {                                            // цикл для перебора каждого элемента массива
            System.out.print(container[i] + " ");       // вывод результата в консоль
            i++;
        } while (i < length);                           // условие цикла
        System.out.println();

        System.out.println("Вывод всех элементов с помощью foreach");
        for (int j : container) {                       // цикл для перебора каждого элемента массива
            System.out.print(j + " ");                  // вывод результата в консоль
        }
        return container;
    }

    // Метод для вывода каждого второго элемента массива
    public static int[] everySecondElements(int[] container) {
        int length;
        int i = 0;

        length = container.length;                              // присваиваем значение переменной длины массива

        System.out.println("Вывод каждого второго элемента с помощью for");
        for (i = 1; i < length; i += 2) {                       // цикл для перебора каждого второго элемента массива
            System.out.print(container[i] + " ");               // вывод результата в консоль
        }
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью while");
        i = 1;
        while (i < length) {                                    // цикл для перебора каждого второго элемента массива
            System.out.print(container[i] + " ");               // вывод результата в консоль
            i += 2;                                             // шаг цикла
        }
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью do...while");
        i = 1;
        do {                                                        // цикл для перебора каждого второго элемента массива
            System.out.print(container[i] + " ");                   // вывод результата в консоль
            i += 2;                                                 // шаг цикла
        } while (i < length);                                       // условие выполнения цикла
        System.out.println();

        System.out.println("Вывод каждого второго элемента с помощью for");
        i = 0;
        for (int j : container) {                                   // цикл для перебора каждого элемента массива
            if (i % 2 != 0) {                                       // условие перебора только каждого второго элемента
                System.out.print(j + " ");                          // вывод результата в консоль
            }
            i++;                                                    // шаг
        }

        return container;
    }

    // Метод для вывода всех элементов массива в обратном порядке
    public static int[] reverseOrderElements(int[] container) {
        int length;
        int i = 0;

        length = container.length;                                  // присваиваем значение переменной длины массива

        System.out.println("Вывод в обратном порядке с помощью for");
        for (i = length - 1; i >= 0; i--) {                         // цикл перебора каждого элемента массива в обратном порядке
            System.out.print(container[i] + " ");                   // вывод результата в консоль
        }
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью while");
        i = length - 1;
        while (i >= 0) {                                            // цикл перебора каждого элемента массива в обратном порядке
            System.out.print(container[i] + " ");                   // вывод результата в консоль
            i--;                                                    // шаг
        }
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью do...while");
        i = length - 1;
        do {                                                        // цикл перебора каждого элемента массива в обратном порядке
            System.out.print(container[i] + " ");                   // вывод результата в консоль
            i--;                                                    // шаг
        } while (i >= 0);                                           // условие цикла
        System.out.println();

        System.out.println("Вывод в обратном порядке с помощью foreach");
        String result = "";
        for (int j : container) {                                    // цикл перебора каждого элемента массива
            result = j + " " + result;                               // запись элементов массива в обратном порядке в строку
        }
        System.out.println(result);                                 // вывод результата в консоль

        return container;
    }
}
