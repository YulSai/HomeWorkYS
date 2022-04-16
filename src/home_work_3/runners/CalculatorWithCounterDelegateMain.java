package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Класс с точкой входа для классов CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation
 */
public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        // 1.1. расчет выражения через CalculatorWithCounterAutoComposite
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");

        // 1.2. расчет выражения через CalculatorWithCounterAutoAgregation c калькулятором CalculatorWithOperator
        CalculatorWithOperator calcWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregation calc2 = new CalculatorWithCounterAutoAgregation(calcWithOperator);

        div = calc2.div(28, 5);
        pow = calc2.pow(div, 2);
        add = calc2.add(15, 7);
        plus = calc2.plus(pow, add);
        result = calc2.plus(4.1, plus);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc2.getCountOperation() + " раз.");

        // 1.3. расчет выражения через CalculatorWithCounterAutoAgregation c калькулятором CalculatorWithMathCopy
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calc3 = new CalculatorWithCounterAutoAgregation(calculatorWithMathCopy);

        div = calc3.div(28, 5);
        pow = calc3.pow(div, 2);
        add = calc3.add(15, 7);
        plus = calc3.plus(pow, add);
        result = calc3.plus(4.1, plus);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc3.getCountOperation() + " раз.");

        // 1.4. расчет выражения через CalculatorWithCounterAutoAgregation c калькулятором CalculatorWithMathExtends
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregation calc4 = new CalculatorWithCounterAutoAgregation(calculatorWithMathExtends);

        div = calc4.div(28, 5);
        pow = calc4.pow(div, 2);
        add = calc4.add(15, 7);
        plus = calc4.plus(pow, add);
        result = calc4.plus(4.1, plus);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("калькулятор использован " + calc3.getCountOperation() + " раз.");
    }
}