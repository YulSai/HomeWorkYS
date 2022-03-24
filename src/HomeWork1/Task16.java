package HomeWork1;

import java.util.Random;

public class Task16 {
    public static void main(String[] args) {
        int[] numbers;
        String phoneNumbers = null;

        numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(9);
        }

        phoneNumbers = createPhoneNumber(numbers);

        System.out.println(phoneNumbers);

    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}