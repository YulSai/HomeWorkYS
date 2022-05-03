package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * Класс с точкой входа для класса CalculatorWithCounterClassic
 * Подсчет количества раз использования калькулятора реализован через самостоятельный
 * вызов метода incrementCountOperation
 */
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double add = calc.add(15, 7);
        calc.incrementCountOperation();

        double plus = calc.plus(4.1, add);
        calc.incrementCountOperation();

        double div = calc.div(28, 5);
        calc.incrementCountOperation();

        double pow = calc.pow(div, 2);
        calc.incrementCountOperation();

        double result = calc.plus(plus, pow);
        calc.incrementCountOperation();

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + "%.1f", result);
        System.out.println();
        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");
    }
}
