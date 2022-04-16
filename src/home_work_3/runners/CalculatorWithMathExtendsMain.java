package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Класс с точкой входа для класса CalculatorWithMathExtends
 */
public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus (4.1, plus);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
