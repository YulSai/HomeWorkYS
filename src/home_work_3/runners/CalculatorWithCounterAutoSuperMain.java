package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

/**
 * Класс с точкой входа для класса CalculatorWithCounterAutoSuper с автоматическим подсчетом
 * количества раз использования калькулятора
 */
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        double result;

        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        result = calc.plus(calc.plus(4.1, calc.add(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");
    }
}