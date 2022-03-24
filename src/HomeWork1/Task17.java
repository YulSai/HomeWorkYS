package HomeWork1;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int number;

        Scanner num = new Scanner(System.in);
        System.out.print("Введи целое число: ");
        while (!num.hasNextInt()) {
            System.out.print("Это не целое число! Попробуй еще раз: ");
            num.nextLine();
        }
        number = num.nextInt();

        System.out.println(toBinaryString((byte) number));
    }

    public static String toBinaryString(byte number) {
        String record = "";
        int b = 1;

        for (int i = 0; i < 8; i++) {
            record = (((number & b) != 0) ? "1" : "0") + record;
            System.out.println(record);
            b = b << 1;
        }
        return record;
    }
}