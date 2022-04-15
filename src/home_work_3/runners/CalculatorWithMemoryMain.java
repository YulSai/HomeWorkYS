package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Класс с точкой входа для класса CalculatorWithMemory
 */
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());

        calc.div(28, 5);
        calc.setMemory();

        calc.pow(calc.getMemory(), 2);
        calc.setMemory();

        calc.plus(calc.add(15, 7), calc.getMemory());
        calc.setMemory();

        calc.plus(4.1, calc.getMemory());
        calc.setMemory();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calc.getMemory());
        System.out.println("калькулятор использован " + calc.getCountOperation() + " раз.");
    }
}