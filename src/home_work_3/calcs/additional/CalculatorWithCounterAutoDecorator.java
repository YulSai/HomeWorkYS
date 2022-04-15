package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * класс реализует калькулятор (с подсчетов кол раз использования) с
 * использованием паттерна "Декоратор"
 */
public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private long count;
    private ICalculator calc;

    public CalculatorWithCounterAutoDecorator(ICalculator calc) {
        this.calc = calc;
    }

    @Override
    public double plus(double a, double b) {
        count++;
        return this.calc.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        count++;
        return this.calc.minus(a, b);
    }

    @Override
    public double add(double a, double b) {
        count++;
        return this.calc.add(a, b);
    }

    @Override
    public double div(double a, double b) {
        count++;
        return this.calc.div(a, b);
    }

    @Override
    public double pow(double a, int b) {
        count++;
        return this.calc.pow(a, b);
    }

    @Override
    public double abs(double a) {
        count++;
        return this.calc.abs(a);
    }

    @Override
    public double sqrt(double a) {
        count++;
        return this.calc.sqrt(a);
    }

    /**
     * метод возвращает количество использований калькулятора
     * @return возвращает количество раз использования калькулятора
     */
    public long getCountOperation() {
        return count;
    }

    /**
     * @return возвращает вложенный калькулятор
     */
    public ICalculator getCalculator() {
        return calc;
    }
}