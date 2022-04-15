package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Класс с точкой входа для классов CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation
 */
public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        double result;

        // 1.1. расчет выражения через CalculatorWithCounterAutoComposite
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        result = calc.plus(calc.plus(4.1, calc.add(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");

        System.out.println();

        // 1.2. расчет выражения через CalculatorWithCounterAutoAgregation
        CalculatorWithOperator calcWithOperator = new CalculatorWithOperator();

        CalculatorWithCounterAutoAgregation calc2 = new CalculatorWithCounterAutoAgregation(calcWithOperator);

        result = calc2.plus(calc2.plus(4.1, calc2.add(15, 7)), calc2.pow(calc2.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc2.getCountOperation() + " раз.");
    }
}
