package home_work_1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task16.createPhoneNumber;

public class Task16Test {
    @Test
    public void getCreatedNumber(){
        int[] numbers = new int[]{8,8,8,3,8,4,3,2,8,8};
        String answer = createPhoneNumber(numbers);
        String correctAnswer = "(888) 384-3288";

        Assertions.assertEquals(correctAnswer, answer);
    }
}