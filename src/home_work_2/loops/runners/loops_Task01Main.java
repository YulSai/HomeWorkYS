package home_work_2.loops.runners;

import home_work_2.loops.loops_Task01;

/**
 * Класс с точкой входа для класса loops_Task01
 */
public class loops_Task01Main {
    public static void main(String[] args) {
        String strNumber = args[0];
        long number;
        long result;

        if (loops_Task01.checkNumber(strNumber)) {
            number = Long.parseLong(strNumber);
            result = loops_Task01.calculateFactorial(number);
            if (loops_Task01.overcrowd(result, number)) {
                System.out.print(loops_Task01.forPrintResult(number));
                System.out.println(" = " + result);
            }
        }
    }
}
