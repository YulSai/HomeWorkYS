package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container;

        container = arrayFromConsole();               // вызов метода создания массива с запросом данных с консоли
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }

        System.out.println();

        container = arrayRandom(50, 100);               // вызов метода создания массива с рандомными числами
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
    }

    // метод для запроса и ввода информации пользователем через консоль
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

    // метод создания массива рандомными числами в заданых значениях
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