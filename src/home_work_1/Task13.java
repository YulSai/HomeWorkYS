package HomeWork1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        String name;

        Scanner n = new Scanner(System.in);
        System.out.println("Как тебя зовут?: ");
        while (n.hasNextInt()) {
            n.nextLine();
            System.out.print("Ты уверен, что в твоем имени есть цифра?! \nТак как тебя все таки зовут?: ");
        }
        name = n.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }
        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!name.equals("Вася") && !name.equals("Анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
