package home_work_2.test.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {
    @Test
    public void sortBubbleEx1(){
        SortsUtils operation = new SortsUtils(new int[] {1, 2, 3, 4, 5, 6});
        int[] correctAnswer = {1, 2, 3, 4, 5, 6};
        SortsUtils.bubble(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortBubbleEx2(){
        SortsUtils operation = new SortsUtils(new int[] {1, 1, 1, 1});
        int[] correctAnswer = {1, 1, 1, 1};
        SortsUtils.bubble(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortBubbleEx3(){
        SortsUtils operation = new SortsUtils(new int[] {9, 1 ,5 ,99 ,9 ,9});
        int[] correctAnswer = {1, 5, 9, 9, 9, 99};
        SortsUtils.bubble(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortBubbleEx4(){
        SortsUtils operation = new SortsUtils(new int[] {});
        int[] correctAnswer = {};
        SortsUtils.bubble(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortBubbleEx5(){
        SortsUtils operation = new SortsUtils(new int[] {6, 5, 4, 3, 2, 1});
        int[] correctAnswer = {1, 2, 3, 4, 5, 6};
        SortsUtils.bubble(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortBubble6(){
        SortsUtils operation = new SortsUtils(new int[]{10, 100, 5, 1, -10, 0});
        int[] correctAnswer = {-10, 0, 1, 5, 10, 100};
        SortsUtils.bubble(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortShakeEx1(){
        SortsUtils operation = new SortsUtils(new int[] {1, 2, 3, 4, 5, 6});
        int[] correctAnswer = {1, 2, 3, 4, 5, 6};
        SortsUtils.shake(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortShakeEx2(){
        SortsUtils operation = new SortsUtils(new int[] {1, 1, 1, 1});
        int[] correctAnswer = {1, 1, 1, 1};
        SortsUtils.shake(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortShakeEx3(){
        SortsUtils operation = new SortsUtils(new int[] {9, 1, 5, 99, 9, 9});
        int[] correctAnswer = {1, 5, 9, 9, 9, 99};
        SortsUtils.shake(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortShakeEx4(){
        SortsUtils operation = new SortsUtils(new int[] {});
        int[] correctAnswer = {};
        SortsUtils.shake(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortShakeEx5(){
        SortsUtils operation = new SortsUtils(new int[] {6, 5, 4, 3, 2, 1});
        int[] correctAnswer = {1, 2, 3, 4, 5, 6};
        SortsUtils.shake(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }

    @Test
    public void sortShake6(){
        SortsUtils operation = new SortsUtils(new int[]{10, 100, 5, 1, -10, 0});
        int[] correctAnswer = {-10, 0, 1, 5, 10, 100};
        SortsUtils.shake(operation.getArr());

        Assertions.assertArrayEquals(correctAnswer, operation.getArr());
    }
}
