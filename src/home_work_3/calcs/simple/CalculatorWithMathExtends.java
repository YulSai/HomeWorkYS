package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Класс наследует класс CalculatorWithOperator.
 * Переопределяет методы родительского класса pow и abs с вызовом библиотеки Math
 */

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double plus(double a, double b) {
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        return super.minus(a, b);
    }

    @Override
    public double add(double a, double b) {
        return super.add(a, b);
    }

    @Override
    public double div(double a, double b) {
        return super.div(a, b);
    }

    @Override
    public double pow(double a, int b) {
        return super.pow(a, b);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return super.sqrt(a);
    }
}
