package Strings;

import java.util.Scanner;

public class StringsWithDateAndNumbers {

    static String[][] number0To900 = {{"", "од", "дв", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "ноль"},
            {"", "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "},
            {"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "}};
    static String[] numberFrom11To19 = {"десять ", "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ",
            "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать ", ""};
    static String[][] textMillion = {{"", "", "", ""},
            {"миллиардов ", "миллионов ", "тысяч ", ""},
            {"миллиард ", "миллион ", "тысяча ", ""},
            {"миллиарда ", "миллиона ", "тысячи ", ""},
            {"миллиардов ", "миллионов ", "тысяч ", ""}};
    static int numberMax = 999_999_999;
    static String numberText = "";

    public static String getNumberText(int number) {
        if ((number < -numberMax) || (number > numberMax)) {
            return numberText = "Число выходит за рамки указанного диапазона";
        }
        if (number == 0) {
            return numberText = "ноль ";
        }
        if (number < 0) {
            numberText = "минус ";
            number = -number;
        }

        // числа от 1_000 999_999_999
        int million = number / 1_000_000;     //  999
        int thousand = (number - (million * 1_000_000)) / 1_000; // 999
        int toThousand = number % 1_000;

        numberText = numberText + getWordsToThousand(million, 1)
                + getWordsToThousand(thousand, 2) + getWordsToThousand(toThousand, 3);

        return numberText;
    }

    private static String getWordsToThousand(int number, int index) {

        // числа от 0 до 999
        int hundreds = number / 100;
        int dozens = (number - (hundreds * 100)) / 10;
        int units = number % 10;

        // числа от 0 до 100
        if (dozens == 1) {
            numberText = number0To900[2][hundreds] + numberFrom11To19[units];
        } else {
            numberText = number0To900[2][hundreds] + number0To900[1][dozens] + number0To900[0][units];
        }

        if (index == 2) {
            if (units == 1 && dozens != 1) {
                numberText = numberText + "на ";
            } else if (units == 2 & dozens != 1) {
                numberText = numberText + "е ";
            }

            if (units > 1 && dozens != 1) {
                numberText = numberText + " ";
            } else {
                if (units == 1 && dozens != 1) {
                    numberText = numberText + "ин ";
                }
            }

            if (units == 2 & dozens != 1) {
                numberText = numberText + "а ";
            } else if (units != 0 & dozens != 1) {
                numberText = numberText + " ";
            }
        }

        int indexText = 0;
        if (number != 0) {
            if (units == 0 || dozens == 1) {
                indexText = 1;
            } else if (units == 1) {
                indexText = 2;
            } else if (units > 1 & units < 5) {
                indexText = 3;
            } else {
                indexText = 4;
            }
        }
        numberText = numberText + textMillion[indexText][index];

        return numberText;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите число: > ");
            int number = scanner.nextInt();
            System.out.println(getNumberText(number));
        } while (true);

    }

}