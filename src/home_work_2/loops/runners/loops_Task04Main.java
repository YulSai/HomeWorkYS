package home_work_2.loops.runners;

import static home_work_2.loops.loops_Task04.*;

/**
 * Класс выводит результат умножения заданного числа со значением до переполнения и после переполнения.
 */
public class loops_Task04Main {
    public static void main(String[] args) {
        long a = 1;
        long b;
        long expNonOverflow;
        long expOverflow;

        // решение для 1.4.1.
        b = 3;

        expNonOverflow = expNonOverflow(a, b);
        expOverflow = expOverflow(expNonOverflow, b);
        print(b, expNonOverflow, expOverflow);

        // решение для 1.4.2.
        b = 188;
        expNonOverflow = expNonOverflow(a, b);
        expOverflow = expOverflow(expNonOverflow, b);
        print(b, expNonOverflow, expOverflow);

        // решение для 1.4.3.
        b = -19;
        expNonOverflow = expNonOverflow(a, b);
        expOverflow = expOverflow(expNonOverflow, b);
        print(b, expNonOverflow, expOverflow);

        // решение для 1.4.4.
        b = -200;
        expNonOverflow = expNonOverflow(a, b);
        expOverflow = expOverflow(expNonOverflow, b);
        print(b, expNonOverflow, expOverflow);
    }
}