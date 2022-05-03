package home_work_2.loops.runners;

import home_work_2.loops.loops_Task02;

/**
 * Класс с точкой входа для класса loops_Task02
 */
public class loops_Task02Main {
    public static void main(String[] args) {

        String strNumber = args[0];

        if (loops_Task02.checkNumber(strNumber)) {
            System.out.print(loops_Task02.forPrintResult(strNumber));
            System.out.println(" = " + loops_Task02.multiplyNumber(strNumber));
        }
    }
}


