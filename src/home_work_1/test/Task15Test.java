package home_work_1.test;

import home_work_1.Task5.Task15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task15Test {

    @Test
    public void welcomNameVasya(){
        Task15 answer = new Task15();
        String name = "Вася";
        String correctAnswer = "Привет! \nЯ тебя так долго ждал";

        assertEquals(correctAnswer, answer.welcom(name));
    }

    @Test
    public void welcomNameAnastasiya(){
        Task15 answer = new Task15();
        String name = "Анастасия";
        String correctAnswer = "Я тебя так долго ждал";

        assertEquals(correctAnswer, answer.welcom(name));
    }

    @Test
    public void welcomNameOther(){
        Task15 answer = new Task15();
        String name = "Петя";
        String correctAnswer = "Добрый день, а вы кто?";

        assertEquals(correctAnswer, answer.welcom(name));
    }
}