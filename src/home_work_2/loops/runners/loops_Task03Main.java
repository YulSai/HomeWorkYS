package home_work_2.loops.runners;

import home_work_2.loops.loops_Task03;


/**
 * Класс с точкой входа для класса loops_Task02
 */
public class loops_Task03Main {
    public static void main(String[] args) {

        double numberOne = loops_Task03.getNumberOne();
        int numberTwo = loops_Task03.getNumberTwo();
        double degree = loops_Task03.getExponentiationNumber(numberOne, numberTwo);

        loops_Task03.print(numberOne, numberTwo, degree);

    }
}