package HomeWork1;

import java.util.Scanner;

public class Task12Eng {
    public static void main(String[] args) {
        boolean weekday;
        boolean vacation;

        System.out.println("Hello. Do you still want to sleep? Then answer true or false: ");

        Scanner answ = new Scanner(System.in);
        System.out.print("Today is a working day?: ");
        while (!answ.hasNextBoolean()) {
            answ.nextLine();
            System.out.print("ERROR! Today is a working day?: ");
        }
        weekday = Boolean.parseBoolean(answ.next());

        System.out.print("Are you on vacation?: ");
        while (!answ.hasNextBoolean()) {
            answ.nextLine();
            System.out.print("ERROR! Are you on vacation?: "); // почему при первом ошибочном вводе два раза печатает? а дальше один...
        }
        vacation = Boolean.parseBoolean(answ.next());

        if (sleepIn(weekday, vacation) == false) {
            System.out.println("Get up! Time for work!");
        } else {
            System.out.println("You can sleep sweetly");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }
}