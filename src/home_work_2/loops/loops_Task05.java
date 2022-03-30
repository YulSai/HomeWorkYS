package home_work_2.loops;

public class loops_Task05 {
    public static void main(String[] args) {
        // Вывести таблицу умножения в консоль.

        System.out.println("                 ТАБЛИЦА УМНОЖЕНИЯ");  // вывод заголовка
        System.out.println();

        for (int i = 1; i <= 10; i++) {                        // цикл для чисел, на которые будем умножать
            for (int j = 2; j <= 5; j++) {                     // цикл для чисел, которые будем умножать
                System.out.print(j + " x " + i + " = " + (i * j) + "\t\t"); // вывод в консоль
            }
            System.out.println(); // пустая строка
        }
        System.out.println(); // пустая строка

        for (int i = 1; i <= 10; i++) {                     // цикл для чисел, на которые будем умножать
            for (int j = 6; j <= 9; j++) {                  // цикл для чисел, которые будем умножать
                System.out.print(j + " x " + i + " = " + (i * j) + "\t\t"); // вывод в консоль
            }
            System.out.println(); // пустая строка
        }
        System.out.println(); // пустая строка
        System.out.println("ЭТО \nНУЖНО \nЗНАТЬ"); // полезная информация )))
    }
}