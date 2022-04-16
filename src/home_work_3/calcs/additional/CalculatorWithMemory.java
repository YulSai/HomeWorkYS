package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * Класс реализует калькулятор, унаследованный из интерфейса ICalculator с переопределением
 * для учета и вывода количества раз использования калькулятора и записью в память результата вычисления
 */
public class CalculatorWithMemory implements ICalculator {
    private long count;
    private double memory;
    private double result;
    private ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * метод сложения
     * @param a первое слогаемое
     * @param b второе слогаемое
     * @return результат сложения
     */
    public double plus(double a, double b) {
        incrementCountOperation();
        result = this.calculator.plus(a, b);
        return result;
    }

    /**
     * метод вычитания
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public double minus(double a, double b) {
        incrementCountOperation();
        result = this.calculator.minus(a, b);
        return result;
    }

    /**
     * метод умножения
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    public double add(double a, double b) {
        incrementCountOperation();
        result = this.calculator.add(a, b);
        return result;
    }

    /**
     * метод деления
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public double div(double a, double b) {
        incrementCountOperation();
        result = this.calculator.div(a, b);
        return result;
    }

    /**
     * метод возведения в степень
     * @param a основание степени
     * @param b показатель степени
     * @return степень числа
     */
    public double pow(double a, int b) {
        incrementCountOperation();
        result = this.calculator.pow(a, b);
        return result;
    }

    /**
     * метод нахождения модуля
     * @param a число
     * @return модуль числа
     */
    public double abs(double a) {
        incrementCountOperation();
        result = this.calculator.abs(a);
        return result;
    }

    /**
     * метод нахождения квардратного корня
     * @param a число
     * @return квадратный корень
     */
    public double sqrt(double a) {
        incrementCountOperation();
        result = this.calculator.sqrt(a);
        return result;
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

    /**
     * возвращает результат последнего вычисления, записанный в памяти калькулятора
     * после чего память очищается
     *
     * @return результат последнего вычисления
     */
    public double getMemory() {
        double memoryResult = memory;
        memory = 0;
        return memoryResult;
    }

    /**
     * записывает результат выполненного вычисления в память калькулятора
     */
    public void setMemory() {
        this.memory = result;
    }
}