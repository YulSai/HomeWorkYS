package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecoratorGeneric;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Класс с точкой входа для классов CalculatorWithCounterAutoDecoratorGeneric и CalculatorWithMemoryDecorator
 */

public class CalculatorDecoratorGenericMain {
    public static void main(String[] args) {
        CalculatorWithMemoryDecorator memoryDecorator = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoDecoratorGeneric<CalculatorWithMemoryDecorator> calc =
                new CalculatorWithCounterAutoDecoratorGeneric<>(memoryDecorator);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");

        calc.getCalculator().setMemory();
        System.out.println("последний сохраненный результат " + calc.getCalculator().getMemory());
    }
}