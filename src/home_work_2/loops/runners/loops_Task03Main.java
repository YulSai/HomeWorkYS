package home_work_2.loops.runners;

import java.util.Scanner;

import static home_work_2.loops.loops_Task03.*;


/**
 * Класс с точкой входа для класса loops_Task02
 */
public class loops_Task03Main {
    public static void main(String[] args) {

        double numberOne = getNumberOne();
        int numberTwo = getNumberTwo();
        double degree = getExponentiationNumber(numberOne, numberTwo);

        print(numberOne, numberTwo, degree);

    }
}