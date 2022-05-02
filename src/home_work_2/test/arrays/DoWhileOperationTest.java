package home_work_2.test.arrays;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {
    @Test
    public void printAllElements6(){
        DoWhileOperation operation = new DoWhileOperation();
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = "10 100 5 1 -10 0 ";
        String answer = operation.allElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void printAllElements0(){
        DoWhileOperation operation = new DoWhileOperation();
        int[] container = new int[] {};
        String correctAnswer = "";
        String answer = operation.allElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void printEverySecondElements6(){
        DoWhileOperation operation = new DoWhileOperation();
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = "100 1 0 ";
        String answer = operation.everySecondElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void printEverySecondElements0(){
        DoWhileOperation operation = new DoWhileOperation();
        int[] container = new int[] {};
        String correctAnswer = "";
        String answer = operation.everySecondElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void printReverseOrderElements6(){
        DoWhileOperation operation = new DoWhileOperation();
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = "0 -10 1 5 100 10 ";
        String answer = operation.reverseOrderElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void printReverseOrderElements0(){
        DoWhileOperation operation = new DoWhileOperation();
        int[] container = new int[] {};
        String correctAnswer = "";
        String answer = operation.reverseOrderElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }
}