package home_work_2.test.loops;

import home_work_2.loops.loops_Task04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class loops_Task04Test {
    @Test
    public void checkExpNonOverflowFor3(){
        long correctAnswer = 4_052_555_153_018_976_267L;
        long answer = loops_Task04.expNonOverflow(1,3);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkExpNonOverflowFor188(){
        long correctAnswer = 1_560_496_482_665_168_896L;
        long answer = loops_Task04.expNonOverflow(1,188);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkExpNonOverflowForMinus19(){
        long correctAnswer = 799_006_685_782_884_121L;
        long answer = loops_Task04.expNonOverflow(1,-19);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkExpNonOverflowForMinus200(){
        long correctAnswer = 2_560_000_000_000_000_000L;
        long answer = loops_Task04.expNonOverflow(1,-200);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkExpOverflow3(){
        long correctAnswer = -6_289_078_614_652_622_815L;
        long answer = loops_Task04.expOverflow(loops_Task04.expNonOverflow(1,3), 3);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkExpOverflowMinus19(){
        long correctAnswer = 3_265_617_043_834_753_317L;
        long answer = loops_Task04.expOverflow(loops_Task04.expNonOverflow(1,-19), -19);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void checkExpOverflowMinus200(){
        long correctAnswer = 4_508_834_063_867_445_248L;
        long answer = loops_Task04.expOverflow(loops_Task04.expNonOverflow(1,-200), -200);

        Assertions.assertEquals(correctAnswer, answer);
    }
}