package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Класс с точкой входа для класса CalculatorWithMathCopy
 */
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        double result;

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        result = calc.plus(calc.plus(4.1, calc.add(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
