package home_work_2.test.loops;

import home_work_2.loops.loops_Task03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class loops_Task03Test {
    @Test
    public void checkGetExponentiationNumber5and3(){
        double correctAnswer = 125;
        double answer = loops_Task03.getExponentiationNumber(5,3);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkGetExponentiationNumber18and5(){
        double correctAnswer = 1_889_568;
        double answer = loops_Task03.getExponentiationNumber(18,5);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkGetExponentiationNumber75and2(){
        double correctAnswer = 56.25;
        double answer = loops_Task03.getExponentiationNumber(7.5,2);

        Assertions.assertEquals(correctAnswer, answer);
    }
}