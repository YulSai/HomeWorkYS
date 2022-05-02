package home_work_1.Task5;

import java.util.Scanner;

/**
 * Класс с точкой входа для методов из Task13, Task14, Task15
 */
public class Task5Main {
    public static void main(String[] args) {
        Task13 welcom = new Task13();
        Task14 welcom2 = new Task14();
        Task15 welcom3 = new Task15();

        Scanner n = new Scanner(System.in);
        System.out.println("Как тебя зовут?: ");
        while (n.hasNextInt()) {
            n.nextLine();
            System.out.print("Это не имя! Так как тебя все таки зовут?: ");
        }
        String name = n.nextLine();

        welcom.welcom(name);

        welcom2.welcom(name);

        welcom3.welcom(name);
    }
}
