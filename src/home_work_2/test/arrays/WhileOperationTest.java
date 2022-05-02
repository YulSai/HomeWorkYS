package home_work_2.test.arrays;


import home_work_2.arrays.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileOperationTest {
    @Test
    public void printAllElements6(){
        WhileOperation operation = new WhileOperation();
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = "10 100 5 1 -10 0 ";
        String answer = operation.allElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void printAllElements0(){
        WhileOperation operation = new WhileOperation();
        int[] container = new int[] {};
        String correctAnswer = "";
        String answer = operation.allElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void everySecondElements6(){
        WhileOperation operation = new WhileOperation();
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = "100 1 0 ";
        String answer = operation.everySecondElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void everySecondElements0(){
        WhileOperation operation = new WhileOperation();
        int[] container = new int[] {};
        String correctAnswer = "";
        String answer = operation.everySecondElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void reverseOrderElements6(){
        WhileOperation operation = new WhileOperation();
        int[] container = new int[] {10, 100, 5, 1, -10, 0};
        String correctAnswer = "0 -10 1 5 100 10 ";
        String answer = operation.reverseOrderElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void reverseOrderElements0(){
        WhileOperation operation = new WhileOperation();
        int[] container = new int[] {};
        String correctAnswer = "";
        String answer = operation.reverseOrderElements(container);

        Assertions.assertEquals(correctAnswer, answer);
    }
}
