package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Класс с точкой входа для класса CalculatorWithOperator
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        double result;

        CalculatorWithOperator calc = new CalculatorWithOperator();

        result = calc.plus(calc.plus(4.1, calc.add(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}