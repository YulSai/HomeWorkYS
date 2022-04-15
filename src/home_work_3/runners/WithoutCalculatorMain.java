package home_work_3.runners;

/**
 * Считаем выражение 4.1 + 15 * 7 + (28 / 5) ^ 2
 */
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result;

        result = 4.1 + 15 * 7 + Math.pow((28d / 5d), 2); // 140,46

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}