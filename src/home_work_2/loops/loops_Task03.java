package home_work_2.loops;

import java.util.Scanner;

public class loops_Task03 {
    public static void main(String[] args) {
        // Возведение в степень введенного числа

        double numberOne;
        int numberTwo;
        double degree;

        Scanner number = new Scanner(System.in);
        System.out.println("Введи число: ");
        while (!number.hasNextDouble()) {
            System.out.println("Введено не число");
            number.nextLine();
        }
        numberOne = number.nextDouble();
        degree = numberOne;

        System.out.println("Введи второе число: ");
        while (!number.hasNextInt()) {
            System.out.print("Это не целое число! Попробуй еще раз: ");
            number.nextLine();
        }
        numberTwo = number.nextInt();

        if (numberTwo < 0) {
            System.out.println("Это отрицательное число.... Давай все заново!");
        } else {
            for (int i = 1; i < numberTwo; i++) {
                degree *= numberOne;
            }
            System.out.println(numberOne + " ^ " + numberTwo + " = " + degree);
        }
    }
}