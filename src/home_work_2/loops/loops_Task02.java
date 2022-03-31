package home_work_2.loops;

public class loops_Task02 {
    public static void main(String[] args) {
        /* Класс выводит решение и результат перемножения между собой всех цифр числа, введенного как аргумент
        String args[0].
        @param strNumber - введенный аргумент типа String
        @param number - введеный аргумент типа long
        @param checkNumber - введенный аргумент типа double
        @param checkLine - введенный аргумент типа boolean
        @param mult - результат перемножения
        Выполняется проверка ввода на целочисленность и положительность, а так же на ввод только чисел и перполнение.*/

        String strNumber;
        double checkNumber;
        boolean checkLine;
        long number;

        long mult;
        long remainder;

        strNumber = args[0];
        mult = 1;

        checkLine = strNumber.matches("[0-9]+[\\.]?[0-9]*");
        if (!checkLine) {
            System.out.println("Введено не число");
        } else {
            checkNumber = Double.parseDouble(strNumber);
            if (checkNumber % 1 != 0) {
                System.out.print("Это не целое число!");
            } else if (checkNumber < 0) {
                System.out.println("Это отрицательное число.");
            } else {
                number = Long.parseLong(strNumber);
                while (number > 0) {
                    remainder = number % 10;
                    mult *= remainder;
                    number /= 10;
                }
                System.out.print(forPrintResult(strNumber));
                System.out.println("=" + mult);
            }
        }
    }

    // метод форматирования строки для вывода в консоль
    public static String forPrintResult(String strNumber) {
        String toPrint = null;
        char[] forPrint;
        int length;
        int lastSymbol;

        forPrint = strNumber.toCharArray();
        length = forPrint.length;
        lastSymbol = length - 1;

        for (int i = 0; i < (length - 1); i++) {
            if (i < length) {
                toPrint = forPrint[i] + "*";
                System.out.print(toPrint);
            }
        }
        toPrint = String.valueOf(forPrint[lastSymbol]);

        return toPrint;
    }
}

