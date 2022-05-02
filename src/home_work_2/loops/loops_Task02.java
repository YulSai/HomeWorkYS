package home_work_2.loops;

/**
 * Класс выводит решение и результат перемножения между собой всех цифр числа, введенного как аргумент String args[0].
 */
public class loops_Task02 {
    /**
     * Метод проверяет переданный в консоль аргумент на символы, целостность и положительность числа
     *
     * @param strNumber строка, требующая проверки
     * @return числовое представление строки
     */
    public static boolean checkNumber(String strNumber) {
        boolean checkLine = strNumber.matches("[0-9]+[\\.]?[0-9]*");
        if (!checkLine) {
            System.out.println("Введено не число");
            return false;
        } else {
            double checkNumber = Double.parseDouble(strNumber);
            if (checkNumber % 1 != 0) {
                System.out.print("Это не целое число!");
                return false;
            } else if (checkNumber < 0) {
                System.out.println("Это отрицательное число.");
                return false;
            } else {
                return true;
            }

        }
    }

    /**
     * Метод умножает цифры числа, переданного как аргумент исполняемой программы в виде строки
     *
     * @param strNumber строка, цифры из которой нужно умножить друг на друга
     * @return результат умножения
     */
    public static long multiplyNumber(String strNumber) {
        long number = Long.parseLong(strNumber);
        long mult = 1;
        long remainder;

        while (number > 0) {
            remainder = number % 10;
            mult *= remainder;
            number /= 10;
        }
        return mult;
    }


    // метод форматирования строки для вывода в консоль
    public static String forPrintResult(String strNumber) {
        //long number = Long.parseLong(strNumber);

        char[] chars = strNumber.toCharArray();
        StringBuilder forPrint = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            forPrint.append(chars[i]);
            if (i < chars.length - 1) {
                forPrint.append(" * ");
            }
        }
        return forPrint.toString();
    }
}