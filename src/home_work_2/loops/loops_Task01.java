package home_work_2.loops;

public class loops_Task01 {
    public static void main(String[] args) {
        // Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе

        long number;
        long result;
        double check;
        String strNumber;

        result = 1;
        strNumber = args[0];

        check = Double.parseDouble(strNumber); // преобразование в вещественное число

        if (check % 1 != 0) {                   // проверка на целочисленность числа
            System.out.print("Это не целое число!");
        } else if (check < 0) {                 // проверка на положительность числа
            System.out.println("Это отрицательное число.");
        } else {
            number = Long.parseLong(strNumber); // преобразование в целое число

            for (long i = 1; i <= number; i++) {  // цикл перемножения чисел от 1 до введенного значения
                result *= i;
            }
            if (result < number) {                  // проверка на переполнение
                System.out.println("Произошло переполнение. Результат некорректен.");
            } else {                                // вывод результата в консоль
                System.out.print(forPrintResult(number)); // вызов метода
                System.out.println("=" + result);
            }
        }
    }

    // метод форматирования строки для вывода в консоль
    public static String forPrintResult(long number) {
        String forPrint = null;

        for (long i = 1; i <= number; i++) {        // цикл для формата симоволов
            if (i < number) {
                forPrint = i + "*";
                System.out.print(forPrint);
            } else if (i == number) {               // цикл для формата последнего символа
                forPrint = String.valueOf(i);
            }
        }
        return forPrint;
    }
}