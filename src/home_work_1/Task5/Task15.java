package home_work_1.Task5;
/**
 * Метод вывода приветствия с использованием switch
 */
public class Task15 implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        String welcom = "";

        switch (name) {
            case "Вася":
                welcom = "Привет! \nЯ тебя так долго ждал";
                System.out.println(welcom);
                break;
            case "Анастасия":
                welcom = "Я тебя так долго ждал";
                System.out.println(welcom);
                break;
            default:
                welcom = "Добрый день, а вы кто?";
                System.out.println(welcom);
        }
        return welcom;
    }
}