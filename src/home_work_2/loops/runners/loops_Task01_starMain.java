package home_work_2.loops.runners;

import home_work_2.loops.loops_Task01_star;

/**
 * Класс с точкой входа для класса loops_Task01_star
 */
public class loops_Task01_starMain {
    public static void main(String[] args) {

        String strNumber = args[0];
        long number;
        long result;

        if (loops_Task01_star.checkNumber(strNumber)) {
            number = Long.parseLong(strNumber);
            result = loops_Task01_star.factorial(number);
            if (loops_Task01_star.overcrowd(result, number)) {
                System.out.print(loops_Task01_star.forPrintResult(number));
                System.out.println(" = " + result);
            }
        }
    }
}


