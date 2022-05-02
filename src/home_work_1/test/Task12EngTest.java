package home_work_1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task12Eng.sleepIn;

public class Task12EngTest {
    /**
     * Методы проверяют метод String sleepIn из класса Task12Eng
     */
    @Test
    public void sleepInWorkDay() {
        // проверяем если рабочий день и не в отпуске = рабочий день
        boolean weekday = true;
        boolean vacation = false;
        String correctAnswer = "Get up! Time for work!";
        String answer = sleepIn(weekday, vacation);


        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void sleepInVacation() {
        // проверяем если рабочий день и в отпуске = отпуск
        boolean weekday = true;
        boolean vacation = true;
        String correctAnswer = "You can sleep sweetly";
        String answer = sleepIn(weekday, vacation);

        Assertions.assertEquals(correctAnswer, answer);
    }
    @Test
    public void sleepInVacation2() {
        // проверяем если нерабочий день и в отпуске = отпуск
        boolean weekday = false;
        boolean vacation = true;
        String correctAnswer = "You can sleep sweetly";
        String answer = sleepIn(weekday, vacation);

        Assertions.assertEquals(correctAnswer, answer);
    }

    @Test
    public void sleepInWeekend() {
        // проверяем если нерабочий день и не в отпуске = выходной
        boolean weekday = false;
        boolean vacation = false;
        String correctAnswer = "You can sleep sweetly";
        String answer = sleepIn(weekday, vacation);

        Assertions.assertEquals(correctAnswer, answer);
    }
}
