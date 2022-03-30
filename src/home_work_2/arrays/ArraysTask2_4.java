package home_work_2.arrays;

import java.util.Scanner;

public class ArraysTask2_4 {
    public static void main(String[] args) {
        // задачи с массивами

        int[] mas;

        mas = ArraysUtils.arrayRandom(50, 100); // создание массива заданного размера с рандомными элементами


        // вызов методов решения задач и вывод результатов в консоль
        System.out.println("Cумма четных положительных элементов массива: " + sumPosElements(mas));
        System.out.println();

        System.out.println("Максимальный из элементов массива с четными индексами: " + maxElements(mas));
        System.out.println();

        System.out.println("Элементы массива, которые меньше среднего арифметического:" + averageElements(mas));
        System.out.println();

        System.out.println("Два наименьших элемента массива:");
        System.out.println(twoMinElements(mas));
        System.out.println();

        System.out.println("Массив после удаления элементов:" + compressionArray(mas));
        System.out.println();

        System.out.println("Сумма цифр элементов массива:" + sumOfDigits(mas));
        System.out.println();
    }

    // Метод для нахождения суммы четных положительных элементов массива
    public static int sumPosElements(int[] mas) {
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {          // цикл для перебора каждого элемента массива
            if (mas[i] > 0 & mas[i] % 2 == 0) {         // условие нахождения четных положительных элементов
                sum = sum + mas[i];                     // суммирование найденных элементов
            }
        }
        return sum;
    }

    // Метод для нахождения максимального из элементов массива с четными индексами
    public static int maxElements(int[] mas) {
        int max;
        int length;

        length = mas.length;                                // присвоение переменной значения длины массива

        max = 0;
        for (int i = 0; i < mas.length; i += 2) {           // цикл для перебора каждого элемента массива с четным индексом
            if (mas[i] > max) {                             // условие проверки максимального значения
                max = mas[i];                               // запись максимального значения в переменную
            }
        }
        return max;
    }

    // Метод для нахождения элементов массива, которые меньше среднего арифметического
    public static String averageElements(int[] mas) {
        int min;
        int sum;
        int average;
        String result = "";

        sum = 0;
        min = 0;

        for (int i = 0; i < mas.length; i++) {              // цикл для перебора каждого элемента массива
            sum = sum + mas[i];                             // сумма элементов массива
        }

        average = sum / mas.length;                         // расчет среднеарифитического значения элементов массива

        for (int i = 0; i < mas.length; i++) {              // цикл для перебора каждого элемента массива
            if (mas[i] < average) {                         // условие нахождения значения меньше среднеарифмитического
                min = mas[i];                               // запись мин значения
                result = result + " " + mas[i];             // запись найденнх элементов
            }
        }
        return result;
    }

    // Метод для нахождения двух наименьших элементов массива
    public static String twoMinElements(int[] mas) {
        int minFirst;
        int minSecond;
        int count;
        String result = "";

        minFirst = mas[0];                                  // присвоение значения первого элемента переменной
        count = 0;                                          // присвоение нулевого значения счетчику

        for (int i = 1; i < mas.length; i++) {              // цикл для перебора каждого элемента массива
            if (mas[i] < minFirst) {                        // сравнение элементов массива
                minFirst = mas[i];                          // запись в перменную значения мин элемента
                count = i;                                  // счетчик для определения индекса мин элемента
            }
        }

        if (minFirst == mas[0]) {                           // условие для присвоения значения переменной, где будет
            minSecond = mas[1];                             // храниться мин значение еще одного элемента массива
        } else {
            minSecond = mas[0];
        }

        for (int i = 1; i < mas.length; i++) {              // цикл для перебора каждого элемента массива
            if (i < count | i > count) {                    // условие исключения из перебора элемента массива minFirst
                if (mas[i] < minSecond) {                   // сравнение элементов массива
                    minSecond = mas[i];                     // запись в перменную значения мин элемента
                }
            }
        }
        result = ("minFirst = " + minFirst + "\nminSecond = " + minSecond); // запись в строку найденных значений

        return result;
    }

    // Метод для cжатия массива, удалив элементы, принадлежащие интервалу
    public static String compressionArray(int[] mas) {
        int[] masSecond;
        int a;                  // переменная для индекса массива
        int b;                  // переменная для индекса массива
        int j;                  // переменная для индекса второго массива
        String result;


        // запрос данных с консоли и присвоение их значения переменным, которые будут хранить индексы элементов
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите интервал, в котором удалить эелементы: >");
        a = sc.nextInt();
        System.out.println("> ");
        b = sc.nextInt();

        masSecond = new int[mas.length];            // присвоение второму массиву длины первого массива
        j = a;                                      // присвоение переменной номера индекса
        result = "";

        for (int i = 0; i < a; i++) {               // цикл для перебора массива до заданного индекса а
            masSecond[i] = mas[i];                  // присвоение элементам второга массива значения элементов первого массива
        }

        for (int i = b + 1; i > b & i < mas.length; i++) {  // цикл для перебора элементов массива от индекса после b
            masSecond[j] = mas[i];                          // присвоение элементам второга массива значения элементов первого массива
            j++;                                            // шаг
        }

        for (int i = 0; i < masSecond.length; i++) {        // цикл перебора элементов второго массива
            result = result + " " + masSecond[i];           // запись в строку значений элементов второго массива
        }
        return result;
    }

    // Метод для нахождения суммы цифр массива
    public static int sumOfDigits(int[] mas) {
        int num;
        int numberOne;
        int sum;

        sum = 0;

        for (int i = 0; i < mas.length; i++) {          // цикл перебора каждого элемента массива
            num = mas[i];                               // присвоение переменной значения элемента массива
            while (num != 0) {
                numberOne = num % 10;                   // нахождение последней цифры числа элемента массива
                sum = sum + numberOne;                  // суммирование цифр массива
                num = num / 10;                         // сокращение цифры на обработанную цифру
            }

        }
        return sum;
    }
}
