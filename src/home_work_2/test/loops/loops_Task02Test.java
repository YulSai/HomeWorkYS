package home_work_2.test.loops;

import home_work_2.loops.loops_Task02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class loops_Task02Test {
    @Test
    public void checkNumberSymbols(){
        String strNumber = "Привет";
        boolean answer = loops_Task02.checkNumber(strNumber);

        Assertions.assertFalse(answer);
    }

    @Test
    public void checkNumberNotInteger(){
        String strNumber = "99.2";
        boolean answer = loops_Task02.checkNumber(strNumber);

        Assertions.assertFalse(answer);
    }

    @Test
    public void checkNumberNegative(){
        String strNumber = "-5";
        boolean answer = loops_Task02.checkNumber(strNumber);

        Assertions.assertFalse(answer);
    }

    @Test
    public void checkNumberCorrect(){
        String strNumber = "5";
        boolean answer = loops_Task02.checkNumber(strNumber);

        Assertions.assertTrue(answer);
    }

    @Test
    public void checkmultiplyNumberFor5(){
        String strNumber = "5";
        long answer = loops_Task02.multiplyNumber(strNumber);
        long correctAnswer = 5;

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkmultiplyNumberFor181232375(){
        String strNumber = "181232375";
        long answer = loops_Task02.multiplyNumber(strNumber);
        long correctAnswer = 10_080;

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkPrintResultFor181232375(){
        String strNumber = "181232375";
        String answer = loops_Task02.forPrintResult(strNumber);
        String correctAnswer = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5";

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkPrintResultFor25878960(){
        String strNumber = "25878960";
        String answer = loops_Task02.forPrintResult(strNumber);
        String correctAnswer = "2 * 5 * 8 * 7 * 8 * 9 * 6 * 0";

        Assertions.assertEquals(correctAnswer, answer);
    }
}