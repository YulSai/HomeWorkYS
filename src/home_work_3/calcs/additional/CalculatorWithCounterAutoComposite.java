package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * класс реализует калькулятор (с подсчетов кол раз использования) через композицию
 * из класса CalculatorWithMathCopy
 */

public class CalculatorWithCounterAutoComposite {
    private long count;
    private CalculatorWithMathCopy calc;

    public CalculatorWithCounterAutoComposite(){
        this.calc = new CalculatorWithMathCopy();
    }

    /**
     * метод сложения
     * @param a первое слогаемое
     * @param b второе слогаемое
     * @return результат сложения
     */
    public double plus(double a, double b) {
        count++;
        return this.calc.plus(a, b);
    }

    /**
     * метод вычитания
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public double minus(double a, double b) {
        count++;
        return this.calc.minus(a, b);
    }

    /**
     * метод умножения
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    public double add(double a, double b) {
        count++;
        return this.calc.add(a, b);
    }

    /**
     * метод деления
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public double div(double a, double b) {
        count++;
        return this.calc.div(a, b);
    }

    /**
     * метод возведения в степень
     * @param a основание степени
     * @param b показатель степени
     * @return степень числа
     */
    public double pow(double a, int b) {
        count++;
        return this.calc.pow(a, b);
    }

    /**
     * метод нахождения модуля
     * @param a число
     * @return модуль числа
     */
    public double abs(double a) {
        count++;
        return this.calc.abs(a);
    }

    /**
     * метод нахождения квардратного корня
     * @param a число
     * @return квадратный корень
     */
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
}
