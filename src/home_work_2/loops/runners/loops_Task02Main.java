package home_work_2.loops.runners;

import static home_work_2.loops.loops_Task02.*;

/**
 * Класс с точкой входа для класса loops_Task02
 */
public class loops_Task02Main {
    public static void main(String[] args) {

        String strNumber = args[0];

        if (checkNumber(strNumber)) {
            System.out.print(forPrintResult(strNumber));
            System.out.println(" = " + multiplyNumber(strNumber));
        }
    }
}


