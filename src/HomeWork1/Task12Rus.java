package HomeWork1;

import java.util.Scanner;

public class Task12Rus {
    public static void main(String[] args) {
        boolean weekday;
        boolean vacation;

        String answ1;
        String answ2;

        System.out.println("Привет. Хочешь еще поспать? Тогда ответь да или нет:");

        Scanner answ = new Scanner(System.in);
        System.out.print("Сегодня рабочий день?: ");
        while (!answ.hasNext("да|нет")) {
            System.out.print("Не понял! Сегодня рабочий день?: ");
            answ.nextLine();
        }
        answ1 = answ.next();

        System.out.print("У тебя отпуск?: ");
        while (!answ.hasNext("да|нет")) {
            System.out.print("Еще раз! Ты в отпуске?: ");   // почему два раза печатает текс при ошибке?
            answ.nextLine();
        }
        answ2 = answ.next();

        weekday = answ1.equals("да");
        vacation = answ2.equals("да");

        if (!sleepIn(weekday, vacation)) {    //упрощенная версия (sleepIn(weekday, vacation) == false)
            System.out.println("Вставай! Пора на работу");
        } else {
            System.out.println("Можешь дальше сладко спать");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {         //упрощенная версия (weekday == true && vacation == false)
            return false;
        } else {
            return true;
        }
    }
}
