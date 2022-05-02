package home_work_2.loops;

import java.util.Scanner;

/**
 * Класс выводит результат возведение в степень введенных пользователем чисел.
 */
public class loops_Task03 {

    /**
     * Метод получает число, которое будет основанием степени
     *
     * @return основание степени
     * Выполняется проверка ввода на ввод только чисел
     */
    public static double getNumberOne() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введи число: ");
        while (!number.hasNextDouble()) {
            System.out.println("Введено не число");
            number.nextLine();
        }
        return number.nextDouble();
    }

    /**
     * Метод получает число, которое будет показателем степени
     *
     * @return показатель степени
     * Выполняется проверка ввода на целочисленность и положительность
     */
    public static int getNumberTwo() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введи второе число: ");
        while (!number.hasNextInt()) {
            System.out.print("Это не целое число! Попробуй еще раз: ");
            number.nextLine();
        }
        int numberTwo = number.nextInt();

        if (numberTwo < 0) {
            System.out.println("Это отрицательное число.... Давай все заново!");
        }
        return numberTwo;
    }

    /**
     * Метод выводит результат возведение в степень введенных пользователем чисел
     *
     * @param numberOne основание степени
     * @param numberTwo показатель степени
     * @return degree - степень числа
     */
    public static double getExponentiationNumber(double numberOne, int numberTwo) {
        double degree = numberOne;
        for (int i = 1; i < numberTwo; i++) {
            degree *= numberOne;
        }
        return degree;
    }

    /**
     * Метод выводит в консоль ход вычисления
     *
     * @param numberOne основание степени
     * @param numberTwo показатель степени
     * @param degree    степень числа
     */
    public static void print(double numberOne, int numberTwo, double degree) {
        System.out.println(numberOne + " ^ " + numberTwo + " = " + degree);
    }
}