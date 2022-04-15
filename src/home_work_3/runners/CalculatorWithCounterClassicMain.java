package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * Класс с точкой входа для класса CalculatorWithCounterClassic
 * Подсчет количества раз использования калькулятора реализован через самостоятельный
 * вызов метода incrementCountOperation
 */
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        double result;
        double result1;
        double result2;
        double result3;
        double result4;

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        result1 = calc.add(15, 7);
        calc.incrementCountOperation();

        result2 = calc.plus(4.1, result1);
        calc.incrementCountOperation();

        result3 = calc.div(28, 5);
        calc.incrementCountOperation();

        result4 = calc.pow(result3, 2);
        calc.incrementCountOperation();

        result = calc.plus(result2, result4);
        calc.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");
    }
}
