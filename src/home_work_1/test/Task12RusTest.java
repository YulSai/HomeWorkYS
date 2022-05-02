package home_work_1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task12Rus.sleepIn;

public class Task12RusTest {
    /**
     * Методы проверяют метод String sleepIn из класса Task12Rus
     */
    @Test
    public void sleepInWorkDay() {
        // проверяем если рабочий день и не в отпуске = false
        boolean weekday = true;
        boolean vacation = false;
        boolean answer = sleepIn(weekday, vacation);

        Assertions.assertFalse(answer);
    }

    @Test
    public void sleepInVacation() {
        // проверяем если рабочий день и в отпуске = true
        boolean weekday = true;
        boolean vacation = true;
        boolean answer = sleepIn(weekday, vacation);

        Assertions.assertTrue(answer);
    }

    @Test
    public void sleepInVacation2() {
        // проверяем если нерабочий день и в отпуске = true
        boolean weekday = false;
        boolean vacation = true;
        boolean answer = sleepIn(weekday, vacation);

        Assertions.assertTrue(answer);
    }

    @Test
    public void sleepInWeekend() {
        // проверяем если нерабочий день и не в отпуске = true
        boolean weekday = false;
        boolean vacation = false;
        boolean answer = sleepIn(weekday, vacation);

        Assertions.assertTrue(answer);
    }
}
