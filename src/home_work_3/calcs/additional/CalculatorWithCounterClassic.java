package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Класс наследует класс CalculatorWithMathExtends.
 * Класс описывает методы:
 * incrementCountOperation - увеличивает внутренего счетчика в калькуляторе
 * getCountOperation - возвращает количество использований данного калькулятора
 */

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count;

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
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return super.sqrt(a);
    }

    /**
     * метод увеличивает значение счетчика на единицу
     */
    public void incrementCountOperation() {
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