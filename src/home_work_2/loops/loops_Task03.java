package home_work_2.loops;

import java.util.Scanner;

public class loops_Task03 {
    public static void main(String[] args) {
        // Возведение в степень введенного числа

        double numberOne;
        int numberTwo;
        double degree;

        Scanner number = new Scanner(System.in); // ввод данных с консоли
        System.out.println("Введи число: ");
        while (!number.hasNextDouble()) {       // проверка на корректность ввода
            System.out.println("Введено не число");
            number.nextLine();
        }
        numberOne = number.nextDouble();    // присваивание введенного значения переменной
        degree = numberOne;                 // присваивание начального значения переменной, где будет результат

        System.out.println("Введи второе число: "); // ввод данных с консоли
        while (!number.hasNextInt()) {              // проверка на корректность ввода
            System.out.print("Это не целое число! Попробуй еще раз: ");
            number.nextLine();
        }
        numberTwo = number.nextInt();          // присваивание введенного значения переменной

        if (numberTwo < 0) {                    // проверка на положительность числа, в степень которого будет возводить
            System.out.println("Это отрицательное число.... Давай все заново!");
        } else {                                // цикл возведения в степень
            for (int i = 1; i < numberTwo; i++) {
                degree *= numberOne;
            }
            System.out.println(numberOne + " ^ " + numberTwo + " = " + degree); // вывод результата в консоль
        }
    }
}