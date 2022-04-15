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
        double result;

        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy()));

        result = calc.plus(4.1, calc.plus((calc.add(15, 7)), calc.pow(calc.div(28, 5), 2)));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            long resultCountOperation = ((CalculatorWithCounterAutoDecorator) calc).getCountOperation();
            System.out.println("калькулятор использован " + resultCountOperation + " раз.");
        }
        if (((CalculatorWithCounterAutoDecorator) calc).getCalculator() instanceof CalculatorWithMemoryDecorator) {
            ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).setMemory();
            double resultForMemory = ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).getMemory();
            System.out.println("последний сохраненный результат " + resultForMemory);
        }
    }
}
