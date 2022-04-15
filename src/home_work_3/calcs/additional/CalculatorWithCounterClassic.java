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