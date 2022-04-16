package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Класс реализует калькулятор, унаследованный из класса CalculatorWithMathExtends с переопределением
 * для учета количества раз использования калькулятора.
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count;

    /**
     * метод сложения
     * @param a первое слогаемое
     * @param b второе слогаемое
     * @return результат сложения
     */
    public double plus(double a, double b) {
        incrementCountOperation();
        return super.plus(a, b);
    }

    /**
     * метод вычитания
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    /**
     * метод умножения
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    /**
     * метод деления
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a, b);
    }

    /**
     * метод возведения в степень
     * @param a основание степени
     * @param b показатель степени
     * @return степень числа
     */
    public double pow(double a, int b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    /**
     * метод нахождения модуля
     * @param a число
     * @return модуль числа
     */
    public double abs(double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    /**
     * метод нахождения квардратного корня
     * @param a число
     * @return квадратный корень
     */
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
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