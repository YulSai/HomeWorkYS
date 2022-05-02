package home_work_1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task17.toBinaryString;

public class Task17Test {
    @Test
    public void toBinaryFirstNumberPositive() {
        byte number = 15;

       String answer = toBinaryString(number);
       String correctAnswer = "00001111";

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void toBinarySecondNumberPositive() {
        byte number = 42;

        String answer = toBinaryString(number);
        String correctAnswer = "00101010";

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void toBinaryFirstNumberNegative() {
        byte number = -15;

        String answer = toBinaryString(number);
        String correctAnswer = "11110001";

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void toBinarySecondNumberNegative() {
        byte number = -42;

        String answer = toBinaryString(number);
        String correctAnswer = "11010110";

        Assertions.assertEquals(correctAnswer, answer);
    }
}