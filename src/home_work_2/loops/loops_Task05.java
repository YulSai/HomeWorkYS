package home_work_2.loops;

public class loops_Task05 {
    public static void main(String[] args) {
        // Вывести таблицу умножения в консоль.

        System.out.println("                 ТАБЛИЦА УМНОЖЕНИЯ");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ЭТО \nНУЖНО \nЗНАТЬ");
    }
}