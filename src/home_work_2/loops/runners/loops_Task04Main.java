package home_work_2.loops.runners;

import home_work_2.loops.loops_Task04;

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

        expNonOverflow = loops_Task04.expNonOverflow(a, b);
        expOverflow = loops_Task04.expOverflow(expNonOverflow, b);
        loops_Task04.print(b, expNonOverflow, expOverflow);

        // решение для 1.4.2.
        b = 188;
        expNonOverflow = loops_Task04.expNonOverflow(a, b);
        expOverflow = loops_Task04.expOverflow(expNonOverflow, b);
        loops_Task04.print(b, expNonOverflow, expOverflow);

        // решение для 1.4.3.
        b = -19;
        expNonOverflow = loops_Task04.expNonOverflow(a, b);
        expOverflow = loops_Task04.expOverflow(expNonOverflow, b);
        loops_Task04.print(b, expNonOverflow, expOverflow);

        // решение для 1.4.4.
        b = -200;
        expNonOverflow = loops_Task04.expNonOverflow(a, b);
        expOverflow = loops_Task04.expOverflow(expNonOverflow, b);
        loops_Task04.print(b, expNonOverflow, expOverflow);
    }
}