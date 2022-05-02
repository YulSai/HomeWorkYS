package home_work_1.Task5;
/**
 * Метод вывода приветствия с использованием if else
 */
public class Task14 implements ICommunicationPrinter{
    @Override
    public String welcom(String name) {
        String welcom = "";

        if (name.equals("Вася")) {
            welcom = "Привет! \nЯ тебя так долго ждал";
            System.out.println(welcom);
        } else if (name.equals("Анастасия")) {
            welcom = "Я тебя так долго ждал";
            System.out.println(welcom);
        } else {
            welcom = "Добрый день, а вы кто?";
            System.out.println(welcom);
        }
        return welcom;
    }
}