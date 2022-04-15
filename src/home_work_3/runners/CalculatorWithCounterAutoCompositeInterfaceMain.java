package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Класс с точкой входа для класса CalculatorWithCounterAutoAgregationInterface с
 * использованием калькулятора CalculatorWithMathExtends.
 */
public class CalculatorWithCounterAutoCompositeInterfaceMain  {
    public static void main(String[] args) {
        double result;

        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        result = calc.plus(4.1, calc.plus((calc.add(15, 7)), calc.pow(calc.div(28, 5), 2)));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");
    }
}
