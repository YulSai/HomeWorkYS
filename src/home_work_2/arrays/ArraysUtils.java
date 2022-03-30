package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container;

        container = arrayFromConsole();                     // вызов метода создания массива с запросом данных с консоли
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }

        System.out.println();

        container = arrayRandom(50,100); // вызов метода создания массива с рандомными числами
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
    }

    // метод для запроса и ввода информации пользователем через консоль
    public static int[] arrayFromConsole() {
        int size;
        int[] mas;

        Scanner sc = new Scanner(System.in);        // запрос данных с консоли и их ввод
        System.out.print("Сколько элементов будет введено?: ");
        size = sc.nextInt();                        // присванивание переменной введенного значения

        mas = new int[size];                        // инициализация массива

        for (int i = 0; i < mas.length; i++) {      // цикл запроса и ввода элементов массива, заданной ранее длины
            System.out.print("Введите элементы: ");
            mas[i] = sc.nextInt();
        }
        return mas;
    }

    // метод создания массива рандомными числами в заданых значениях
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container;

        Random rand = new Random();         // объект генерации случаных чисел

        container = new int[size];          // инициализация массива

        for (int i = 0; i < container.length; i++) {  // цикл наполнения массива рандомными данными
            container[i] = rand.nextInt(maxValueExclusion);
        }
        return container;
    }
}