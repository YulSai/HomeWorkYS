package HomeWork1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        String name;


        Scanner n = new Scanner(System.in);
        System.out.println("Как тебя зовут?: ");
        while (n.hasNextInt()) {
            n.nextLine();
            System.out.print("Это не имя! Так как тебя все таки зовут?: ");
        }
        name = n.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет! \nЯ тебя так долго ждал");
        } else if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}