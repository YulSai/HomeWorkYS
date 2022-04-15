package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Класс с точкой входа для класса CalculatorWithMathExtends
 */
public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        double result;

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        result = calc.plus(calc.plus(4.1, calc.add(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
