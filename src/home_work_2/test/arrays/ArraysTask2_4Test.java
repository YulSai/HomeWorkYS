package home_work_2.test.arrays;


import home_work_2.arrays.ArraysTask2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTask2_4Test {
    @Test
    public void sumPosElements(){
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        int correctAnswer = 110;
        int answer = ArraysTask2_4.sumPosElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void maxElements(){
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        int correctAnswer = 10;
        int answer = ArraysTask2_4.maxElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void averageElements(){
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = " 10 5 1 -10 0";
        String answer = ArraysTask2_4.averageElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void twoMinElements(){
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = "minFirst = -10\n" + "minSecond = 0";
        String answer = ArraysTask2_4.twoMinElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void sumOfDigits(){
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        int correctAnswer = 7;
        int answer = ArraysTask2_4.sumOfDigits(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

}
