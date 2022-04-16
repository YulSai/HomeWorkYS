package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * класс реализует калькулятор (с подсчетов кол раз использования) через интерфейс
 * ICalculator
 */
public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private long count;
    private final ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double plus(double a, double b) {
        incrementCountOperation();
        return this.calculator.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return this.calculator.minus(a, b);
    }

    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return this.calculator.add(a, b);
    }

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return this.calculator.div(a, b);
    }

    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return this.calculator.pow(a, b);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return this.calculator.abs(a);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return this.calculator.sqrt(a);
    }

    /**
     * метод увеличивает значение счетчика на единицу
     */
    private void incrementCountOperation() {
        count++;
    }

    /**
     * метод возвращает количество использований калькулятора
     * @return возвращает количество раз использования калькулятора
     */
    public long getCountOperation() {
        return count;
    }
}
