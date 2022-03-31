package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    /* В классе описаны методы для создания и инициализации массивов:
        arrayFromConsole - метод для запроса и ввода информации пользователем через консоль
        arrayRandom - метод создания массива рандомными числами в заданых значениях*/

    public static int[] arrayFromConsole() {
        int size;
        int[] mas;

        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько элементов будет введено?: ");


        while (sc.hasNext("-\\d+") || sc.hasNext("0") || sc.hasNext("\\D+") || !sc.hasNextInt()) {
            System.out.println("Введено не целое положительное число. Еще попытка:");
            sc.nextLine();
        }

        size = sc.nextInt();
        mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите элементы: ");
            while (!sc.hasNextInt()) {
                System.out.println("Введено не целое число. Еще попытка:");
                sc.nextLine();
            }
            mas[i] = sc.nextInt();
        }
        return mas;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container;

        Random rand = new Random();

        container = new int[size];

        for (int i = 0; i < container.length; i++) {
            container[i] = rand.nextInt(maxValueExclusion);
        }
        return container;
    }
}