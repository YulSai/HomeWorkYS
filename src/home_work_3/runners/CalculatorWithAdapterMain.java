package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorAdapter;
/**
 * Класс с точкой входа для класса CalculatorAdapter
 */
public class CalculatorWithAdapterMain {
    public static void main(String[] args) {
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        String note = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double result;

        result = calculatorAdapter.calcFromAdapter(note);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}