package home_work_1.test;

import home_work_1.Task5.Task13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task13Test {

    @Test
    public void welcomNameVasya(){
        Task13 answer = new Task13();
        String name = "Вася";
        String correctAnswer = "Привет! \nЯ тебя так долго ждал";

        assertEquals(correctAnswer, answer.welcom(name));
    }

    @Test
    public void welcomNameAnastasiya(){
        Task13 answer = new Task13();
        String name = "Анастасия";
        String correctAnswer = "Я тебя так долго ждал";

        assertEquals(correctAnswer, answer.welcom(name));
    }

    @Test
    public void welcomNameOther(){
        Task13 answer = new Task13();
        String name = "Петя";
        String correctAnswer = "Добрый день, а вы кто?";

        assertEquals(correctAnswer, answer.welcom(name));
    }
}