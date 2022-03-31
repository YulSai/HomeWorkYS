package home_work_2.loops;

import javax.imageio.ImageTranscoder;

public class loops_Task04 {
    public static void main(String[] args) {
        /* Класс выводит результат умножения заданного числа со значением до переполнения и после переполнения..
        @param a - множимое
        @param b - множитель
        @param max - максимальное значение, которое может принять тип long
        @param resultNonoverflow - значение до переполнения
        @param resultOverflow - значение после переполнения
        @param count - счетчик
        При решении использовался класс Math*/

        long a;
        long b;
        long max;
        long resultNonoverflow;
        long resultOverflow;
        long count;

        a = 1;
        max = Long.MAX_VALUE;

        // решение для 1.4.1.
        b = 3;

        count = (long) (Math.log(max) / Math.log(Math.abs(b))); // определяем максимальную степень числа b без переполнения

        resultNonoverflow = a * b;

        for (int i = 0; i < (count - 1); i++) { // цикл перемножения до переполнения
            resultNonoverflow *= b;
        }
        System.out.println("Значение до переполнения при умножении на " + b + ": " + resultNonoverflow);
        System.out.println();

        resultOverflow = resultNonoverflow * b; // результат при переполнении
        System.out.println("Значение после переполнения при умножении на " + b + ": " + resultOverflow);
        System.out.println();

        // решение для 1.4.2.
        b = 188;
        count = (long) (Math.log(max) / Math.log(Math.abs(b)));

        resultNonoverflow = a * b;
        for (int i = 0; i < (count - 1); i++) {
            resultNonoverflow *= b;
        }
        System.out.println("Значение до переполненияпри умножении на " + b + ": " + resultNonoverflow);
        System.out.println();

        resultOverflow = resultNonoverflow * b;
        System.out.println("Значение после переполнения при умножении на " + b + ": " + resultOverflow);
        System.out.println();

        // решение для 1.4.3.
        b = -19;
        count = (long) (Math.log(max) / Math.log(Math.abs(b)));

        resultNonoverflow = a * b;
        for (int i = 0; i < (count - 1); i++) {
            resultNonoverflow *= b;
        }
        System.out.println("Значение до переполненияпри умножении на " + b + ": " + resultNonoverflow);
        System.out.println();

        resultOverflow = resultNonoverflow * b;
        System.out.println("Значение после переполнения при умножении на " + b + ": " + resultOverflow);
        System.out.println();

        // решение для 1.4.4.
        b = -200;
        count = (long) (Math.log(max) / Math.log(Math.abs(b)));

        resultNonoverflow = a * b;
        for (int i = 0; i < (count - 1); i++) {
            resultNonoverflow *= b;
        }
        System.out.println("Значение до переполненияпри умножении на " + b + ": " + resultNonoverflow);
        System.out.println();

        resultOverflow = resultNonoverflow * b;
        System.out.println("Значение после переполнения при умножении на " + b + ": " + resultOverflow);
        System.out.println();
    }
}