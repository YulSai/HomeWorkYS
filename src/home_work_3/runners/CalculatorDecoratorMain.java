package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Класс с точкой входа для классов CalculatorWithCounterAutoDecorator и CalculatorWithMemoryDecorator
 */

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy()));

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calcTemp = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println("калькулятор использован " + calcTemp.getCountOperation() + " раз.");

            ICalculator calcOther = calcTemp.getCalculator();

            if (calcOther instanceof CalculatorWithMemoryDecorator) {
                CalculatorWithMemoryDecorator resultForMemory = ((CalculatorWithMemoryDecorator) ((CalculatorWithMemoryDecorator) calcOther));
                resultForMemory.setMemory();
                System.out.println("последний сохраненный результат " + resultForMemory.getMemory());
            }
        }
    }
}