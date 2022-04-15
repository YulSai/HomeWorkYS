package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * класс реализует калькуляторы (с подсчетов кол раз использования) через агрегацию из классов:
 * 1.1. CalculatorWithOperator
 * 1.2. CalculatorWithMathCopy
 * 1.3. CalculatorWithMathExtends
 */
public class CalculatorWithCounterAutoAgregation {
    private long count;

    //1.1. CalculatorWithOperator
    private CalculatorWithOperator calcWithOperator;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calcWithOperator) {
        this.calcWithOperator = calcWithOperator;
    }

    //1.2. CalculatorWithMathCopy
    private CalculatorWithMathCopy calcWithMathCopy;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calcWithMathCopy) {
        this.calcWithMathCopy = calcWithMathCopy;
    }

    //1.3. CalculatorWithMathExtends
    private CalculatorWithMathExtends calcWithMathExtends;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calcWithMathExtends) {
        this.calcWithMathExtends = calcWithMathExtends;
    }

    /**
     * метод сложения
     * @param a первое слогаемое
     * @param b второе слогаемое
     * @return результат сложения в зависимости от выбарнного класса калькулятора
     */
    public double plus(double a, double b) {
        count++;
        if (calcWithOperator != null) {
            return calcWithOperator.plus(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.plus(a, b);
        } else {
            return calcWithMathExtends.plus(a, b);
        }
    }

    /**
     * метод вычитания
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность в зависимости от выбарнного класса калькулятора
     */
    public double minus(double a, double b) {
        count++;
        if (calcWithOperator != null) {
            return calcWithOperator.minus(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.minus(a, b);
        } else {
            return calcWithMathExtends.minus(a, b);
        }
    }

    /**
     * метод умножения
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение в зависимости от выбарнного класса калькулятора
     */
    public double add(double a, double b) {
        count++;
        if (calcWithOperator != null) {
            return calcWithOperator.add(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.add(a, b);
        } else {
            return calcWithMathExtends.add(a, b);
        }
    }

    /**
     * метод деления
     * @param a делимое
     * @param b делитель
     * @return частное в зависимости от выбарнного класса калькулятора
     */
    public double div(double a, double b) {
        count++;
        if (calcWithOperator != null) {
            return calcWithOperator.div(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.div(a, b);
        } else {
            return calcWithMathExtends.div(a, b);
        }
    }

    /**
     * метод возведения в степень
     * @param a основание степени
     * @param b показатель степени
     * @return степень числа в зависимости от выбарнного класса калькулятора
     */
    public double pow(double a, int b) {
        count++;
        if (calcWithOperator != null) {
            return calcWithOperator.pow(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.pow(a, b);
        } else {
            return calcWithMathExtends.pow(a, b);
        }
    }

    /**
     * метод нахождения модуля
     * @param a число
     * @return модуль числа в зависимости от выбарнного класса калькулятора
     */
    public double abs(double a) {
        count++;
        if (calcWithOperator != null) {
            return calcWithOperator.abs(a);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.abs(a);
        } else {
            return calcWithMathExtends.abs(a);
        }
    }

    /**
     * метод нахождения квардратного корня
     * @param a число
     * @return квадратный корень в зависимости от выбарнного класса калькулятора
     */
    public double sqrt(double a) {
        count++;
        if (calcWithOperator != null) {
            return calcWithOperator.sqrt(a);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.sqrt(a);
        } else {
            return calcWithMathExtends.sqrt(a);
        }
    }

    /**
     * метод возвращает количество использований калькулятора
     * @return возвращает количество раз использования калькулятора
     */
    public long getCountOperation() {
        return count;
    }
}