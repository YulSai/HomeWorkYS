package home_work_1.test;

import home_work_1.Task5.Task14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task14Test {

    @Test
    public void welcomNameVasya(){
        Task14 answer = new Task14();
        String name = "Вася";
        String correctAnswer = "Привет! \nЯ тебя так долго ждал";

        assertEquals(correctAnswer, answer.welcom(name));
    }

    @Test
    public void welcomNameAnastasiya(){
        Task14 answer = new Task14();
        String name = "Анастасия";
        String correctAnswer = "Я тебя так долго ждал";

        assertEquals(correctAnswer, answer.welcom(name));
    }

    @Test
    public void welcomNameOther(){
        Task14 answer = new Task14();
        String name = "Петя";
        String correctAnswer = "Добрый день, а вы кто?";

        assertEquals(correctAnswer, answer.welcom(name));
    }
}