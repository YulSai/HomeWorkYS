package home_work_1.Task5;

/**
 * Метод вывода привествия с использованием if
 */
public class Task13 implements ICommunicationPrinter{
    @Override
    public String welcom(String name) {
        String welcom = "";

        if (name.equals("Вася")) {
            welcom = "Привет! \nЯ тебя так долго ждал";
            System.out.println(welcom);
        }
        if (name.equals("Анастасия")) {
            welcom ="Я тебя так долго ждал";
            System.out.println(welcom);
        }
        if (!name.equals("Вася") && !name.equals("Анастасия")) {
            welcom = "Добрый день, а вы кто?";
            System.out.println(welcom);
        }
        return welcom;
    }
}