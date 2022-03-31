package home_work_2.loops;

import javax.imageio.ImageTranscoder;

public class loops_Task04 {
    public static void main(String[] args) {
        //Умножать число long a = 1; пока не произойдёт переполнение.
        // В конце в консоль вывести сообщение со значением до переполнения и после переполнения.

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
        count = (long) (Math.log(max) / Math.log(Math.abs(b)));


        resultNonoverflow = a * b;

        for (int i = 0; i < (count - 1); i++) {
            resultNonoverflow *= b;
        }
        System.out.println("Значение до переполнения при умножении на " + b + ": " + resultNonoverflow);

        resultOverflow = a * b;
        for (int i = 0; i <= count; i++) {
            resultOverflow *= b;
        }
        System.out.println("Значение после переполнения при при умножении на " + b + ": " + resultOverflow);
        System.out.println();


        // решение для 1.4.2.
        b = 188;
        count = (long) (Math.log(max) / Math.log(Math.abs(b)));

        resultNonoverflow = a * b;
        for (int i = 0; i < (count - 1); i++) {
            resultNonoverflow *= b;
        }
        System.out.println("Значение до переполненияпри умножении на " + b + ": " + resultNonoverflow);

        resultOverflow = a * b;
        for (int i = 0; i <= count; i++) {
            resultOverflow *= b;
        }
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

        resultOverflow = a * b;
        for (int i = 0; i <= count; i++) {
            resultOverflow *= b;
        }
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

        resultOverflow = a * b;
        for (int i = 0; i <= count; i++) {
            resultOverflow *= b;
        }
        System.out.println("Значение после переполнения при умножении на " + b + ": " + resultOverflow);
    }
}