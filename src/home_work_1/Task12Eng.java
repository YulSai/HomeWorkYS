package home_work_1;

import java.util.Scanner;

public class Task12Eng {
    public static void main(String[] args) {
        System.out.println("Hello. Do you still want to sleep? Then answer true or false: ");

        Scanner answ = new Scanner(System.in);
        System.out.print("Today is a working day?: ");
        while (!answ.hasNextBoolean()) {
            answ.nextLine();
            System.out.print("ERROR! Today is a working day?: ");
        }
        boolean weekday = Boolean.parseBoolean(answ.next());

        System.out.print("Are you on vacation?: ");
        while (!answ.hasNextBoolean()) {
            answ.nextLine();
            System.out.print("ERROR! Are you on vacation?: "); // почему при первом ошибочном вводе два раза печатает? а дальше один...
        }
        boolean vacation = Boolean.parseBoolean(answ.next());

        System.out.println(sleepIn(weekday,vacation));
    }

    public static String sleepIn(boolean weekday, boolean vacation) {


        String answer;
        if (weekday && !vacation) {
            answer = "Get up! Time for work!";
        } else {
            answer = "You can sleep sweetly";
        }
        return answer;
    }

}