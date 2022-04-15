package home_work_3.calcs.api;

/**
 * интерфейс с методами калькулятора
 * * plus - сложение
 *  * minus - вычитание
 *  * add - умножение
 *  * div - деление
 *  * pow - возведение в степень
 *  * abs - модуль числа
 *  * sqrt - квадратный корень числа
 */
public interface ICalculator {
    public double plus(double a, double b);

    public double minus(double a, double b);

    public double add(double a, double b);

    public double div(double a, double b);

    public double pow(double a, int b);

    public double abs(double a);

    public double sqrt(double a);
}
