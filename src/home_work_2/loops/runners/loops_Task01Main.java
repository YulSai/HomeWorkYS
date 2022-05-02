package home_work_2.loops.runners;

import static home_work_2.loops.loops_Task01.*;

/**
 * Класс с точкой входа для класса loops_Task01
 */
public class loops_Task01Main {
    public static void main(String[] args) {
        String strNumber = args[0];
        long number;
        long result;

        if (checkNumber(strNumber)) {
            number = Long.parseLong(strNumber);
            result = calculateFactorial(number);
            if (overcrowd(result, number)) {
                System.out.print(forPrintResult(number));
                System.out.println(" = " + result);
            }
        }
    }
}
