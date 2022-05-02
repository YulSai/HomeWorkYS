package home_work_2.loops;

/**
 * Класс выводит решение и результат факториала числа с использованием рекурсии, введенного как аргумент String args[0].
 */
public class loops_Task01_star {
    /**
     * Метод проверяет переданный в консоль аргумент на целостность и положительность числа
     *
     * @param strNumber строка, требующая проверки
     * @return числовое представление строки
     */
    public static boolean checkNumber(String strNumber) {
        double check = Double.parseDouble(strNumber);

        if (check % 1 != 0) {
            System.out.print("Это не целое число!");
            return false;
        } else if (check < 0) {
            System.out.println("Это отрицательное число.");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Метод рекурсии перемножения чисел от 1 до введенного значения
     */
    public static long factorial(long number) {
        long result;

        if (number < 2) {
            return 1;
        }
        result = factorial(number - 1) * number;
        return result;
    }

    /**
     * Метод проверяет произошло ли переполнение
     *
     * @param result результат вычисления факториала
     * @param number число для которого вычисляли факториал
     * @return false, если произошло переполнение, если нет - true
     */
    public static boolean overcrowd(long result, long number) {
        if (result < number) {
            System.out.println("Произошло переполнение. Результат некорректен.");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Метод форматирует строку для вывода в консоль
     *
     * @param number число, факториал которого вычисляли
     * @return ход вычисления в виде отформатированной строки и результат
     */
    public static String forPrintResult(long number) {
        StringBuilder forPrint = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            forPrint.append(i);
            if (i < number) {
                forPrint.append(" * ");
            }
        }
        return forPrint.toString();
    }
}


