package HomeWork1;

public class Task12 {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = false;

        if (sleepIn(weekday, vacation) == false) {
            System.out.println("Вставай! Пора на работу");
        } else {
            System.out.println("Можешь дальше сладко спать");
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