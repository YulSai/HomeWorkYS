package home_work_2.loops;

/**
 * Класс выводит результат умножения заданного числа со значением до переполнения и после переполнения.
 */
public class loops_Task04 {
    static long max = Long.MAX_VALUE;
    long count;

    /**
     * Метод выводит результат умножения заданного числа со значением до переполнения
     * @param a - множимое
     * @param b - множитель
     * @return значение до переполнения
     */
    public static long expNonOverflow(long a, long b) {
        long count = (long) (Math.log(max) / Math.log(Math.abs(b))); // определяем максимальную степень числа b без переполнения
        long resultNonOverflow = a * b;
        for (int i = 0; i < (count - 1); i++) { // цикл перемножения до переполнения
            resultNonOverflow *= b;
        }
        return resultNonOverflow;
    }

    /**
     * Метод выводит результат умножения заданного числа со значением после переполнения
     * @param resultNonOverflow значение до переполнения
     * @param b - множитель
     * @return значение после переполнения
     */
    public static long expOverflow(long resultNonOverflow, long b) {
        long resultOverflow = resultNonOverflow * b; // результат при переполнении

        return resultOverflow;
    }

    /**
     * Метод выводит результат умножения заданного числа со значением до переполнения и после переполнения.
     * @param b множитель
     * @param resultNonOverflow значение до переполнения
     * @param resultOverflow значение после переполнения
     */
    public static void print(long b,long resultNonOverflow, long resultOverflow) {
        System.out.println("Значение до переполнения при умножении на " + b + ": " + resultNonOverflow);
        System.out.println();

        System.out.println("Значение после переполнения при умножении на " + b + ": " + resultOverflow);
        System.out.println();
    }
}