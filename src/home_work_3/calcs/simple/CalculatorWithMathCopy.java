package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Класс реализует математические методы для калькулятора с использованием класса Math.
 * plus - сложение
 *  * minus - вычитание
 *  * add - умножение
 *  * div - деление
 *  * pow - возведение в степень
 *  * abs - модуль числа
 *  * sqrt - квадратный корень числа
 */
public class CalculatorWithMathCopy implements ICalculator {

    /**
     * метод сложения
     * @param a первое слогаемое
     * @param b второе слогаемое
     * @return результат сложения
     */
    public double plus(double a, double b) {
        return a + b;
    }

    /**
     * метод вычитания
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public double minus(double a, double b) {
        return a - b;
    }

    /**
     * метод умножения
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    public double add(double a, double b) {
        return a * b;
    }

    /**
     * метод деления
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public double div(double a, double b) {
        return a / b;
    }

    /**
     * метод возведения в степень
     * @param a основание степени
     * @param b показатель степени
     * @return степень числа
     */
    public double pow(double a, int b) {
        return Math.pow(a, b);
    }

    /**
     * метод нахождения модуля
     * @param a число
     * @return модуль числа
     */
    public double abs(double a) {
        return Math.abs(a);
    }

    /**
     * метод нахождения квардратного корня
     * @param a число
     * @return квадратный корень
     */
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
