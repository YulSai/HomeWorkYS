package home_work_2.test.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.loops.loops_Task01_star.*;

public class loops_Task01_starTest {
    @Test
    public void checkNumberNegative(){
        String strNumber = "-5";
        boolean answer = checkNumber(strNumber);

        Assertions.assertFalse(answer);
    }

    @Test
    public void checkNumberNotInteger(){
        String strNumber = "5.8";
        boolean answer = checkNumber(strNumber);

        Assertions.assertFalse(answer);
    }

    @Test
    public void checkNumberCorrect(){
        String strNumber = "5";
        boolean answer = checkNumber(strNumber);

        Assertions.assertTrue(answer);
    }


    @Test
    public void isNotOverlow(){
        long number = 5;
        long result = factorial(number);
        boolean answer = overcrowd(result, number);

        Assertions.assertTrue(answer);
    }

    @Test
    public void isOverlow(){
        long number = 500;
        long result = factorial(number);
        boolean answer = overcrowd(result, number);

        Assertions.assertFalse(answer);
    }

    @Test
    public void checkCalculateFactorialFor5(){
        long number = 5;
        long answer = factorial(number);
        long correctAnswer = 120;

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkCalculateFactorialFor12() {
        long number = 12;
        long answer = factorial(number);
        long correctAnswer = 479001600;

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkPrintResultFor5(){
        long number = 5;
        String answer = forPrintResult(number);
        String correctAnswer = "1 * 2 * 3 * 4 * 5";

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkPrintResultFor12(){
        long number = 12;
        String answer = forPrintResult(number);
        String correctAnswer = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12";

        Assertions.assertEquals(correctAnswer, answer);
    }
}

