package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Класс с точкой входа для класса CalculatorWithOperator
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + "%.1f", result);
    }
}