package home_work_2.loops;

public class loops_Task01 {
    public static void main(String[] args) {
        /* Класс выводит решение и результат факториала числа, введенного как аргумент
        String args[0].
        @param strNumber - введенный аргумент типа String
        @param number - введеный аргумент типа long
        @param check - введенный аргумент типа double
        @param result - результат вычисления типа long
        Выполняется проверка ввода на целочисленность и положительность, а так же на перполнение.*/

        long number;
        long result;
        double check;
        String strNumber;

        result = 1;
        strNumber = args[0];

        check = Double.parseDouble(strNumber);

        if (check % 1 != 0) {
            System.out.print("Это не целое число!");
        } else if (check < 0) {
            System.out.println("Это отрицательное число.");
        } else {
            number = Long.parseLong(strNumber);

            for (long i = 1; i <= number; i++) {
                result *= i;
            }
            if (result < number) {
                System.out.println("Произошло переполнение. Результат некорректен.");
            } else {
                System.out.print(forPrintResult(number));
                System.out.println("=" + result);
            }
        }
    }

    // метод форматирования строки для вывода в консоль
    public static String forPrintResult(long number) {
        String forPrint = null;

        for (long i = 1; i <= number; i++) {
            if (i < number) {
                forPrint = i + "*";
                System.out.print(forPrint);
            } else if (i == number) {
                forPrint = String.valueOf(i);
            }
        }
        return forPrint;
    }
}