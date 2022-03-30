package home_work_2.loops;

public class loops_Task02 {
    public static void main(String[] args) {
        // Все цифры из числа введенного через аргумент к исполняемой программе перемножить
        // между собой и вывести ход вычислений в консоль.

        String strNumber;
        double checkNumber;
        boolean checkLine;
        long number;

        long mult;
        long remainder;
        String result;

        strNumber = args[0];
        mult = 1;

        checkLine = strNumber.matches("[0-9]+[\\.]?[0-9]*");    // проверка на строку
        if (!checkLine) {
            System.out.println("Введено не число");
        } else {
            checkNumber = Double.parseDouble(strNumber);                // проверка на вещественное число
            if (checkNumber % 1 != 0) {
                System.out.print("Это не целое число!");                // проверка на целочисленность
            } else if (checkNumber < 0) {
                System.out.println("Это отрицательное число.");         // проверка на положительность
            } else {
                number = Long.parseLong(strNumber);                     // преобразование в целое число
                while (number > 0) {                                    // цикл нахождения цифр числа и их перемножения
                    remainder = number % 10;
                    mult *= remainder;
                    number /= 10;
                }
                // печать результата в консоль
                System.out.print(forPrintResult(strNumber));            // вызов метода печати
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

        forPrint = strNumber.toCharArray();   // преобразование строки в массив символов
        length = forPrint.length;             // присваивание переменной значения длины массива
        lastSymbol = length - 1;               // присваивание значения последнего символа массива

        for (int i = 0; i < (length - 1); i++) { // цикл для перебора символов и записи их в строку
            if (i < length) {
                toPrint = forPrint[i] + "*";
                System.out.print(toPrint);
            }
        }
        toPrint = String.valueOf(forPrint[lastSymbol]); // вывод в консоль

        return toPrint;
    }
}

