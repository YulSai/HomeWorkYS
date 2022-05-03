package home_work_4.test;

import home_work_4.DataContainer;
import home_work_4.runners.RelativesForTest.RelativesForTest;
import home_work_4.runners.RelativesForTest.comparatorForTest.RelativesForTest_Name;
import home_work_4.сomparator.ComparatorComparable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_4.DataContainer.sort;

public class DataContainerTest {
    @Test
    public void addOneElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        Integer data = 777;
        int i = container.add(data);
        Integer[] correctAnswer = new Integer[]{1, 2, 3, 777, null, null};

        Assertions.assertEquals(data, container.get(i));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void addNull() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        Integer data = null;
        int i = container.add(data);
        Integer[] correctAnswer = new Integer[]{1, 2, 3, null, null, null};

        Assertions.assertEquals(-1, i);
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void addOneElementToEmptyPlace() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        Integer data = 777;
        int i = container.add(data);
        Integer[] correctAnswer = new Integer[]{1, 777, 3, null, null, null};

        Assertions.assertEquals(data, container.get(i));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void addTwoElementsToTheEnd() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3});
        Integer data = 777;
        Integer data2 = 0;
        int i = container.add(data);
        int i2 = container.add(data2);
        Integer[] correctAnswer = new Integer[]{1, 2, 3, 777, 0};

        Assertions.assertEquals(data, container.get(i));
        Assertions.assertEquals(data2, container.get(i2));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void addOneNegativeElementToEmpty() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        Integer data = -7;
        int i = container.add(data);
        Integer[] correctAnswer = new Integer[]{-7};

        Assertions.assertEquals(data, container.get(i));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void getIndexOfSingleElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        container.add(9999);
        Integer correctAnswer = 9999;

        Assertions.assertEquals(correctAnswer, container.get(0));
    }

    @Test
    public void getIndexOfNonElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{9999});

        Assertions.assertNull(container.get(1));
    }

    @Test
    public void getIndexNegative() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{9999});

        Assertions.assertNull(container.get(-10));
    }

    @Test
    public void deleteOneElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        Integer[] correctAnswer = new Integer[]{1, 2, 3};

        Assertions.assertTrue(container.delete(3));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void deleteOneNotLastElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        Integer[] correctAnswer = new Integer[]{1, 2, 777};

        Assertions.assertTrue(container.delete(2));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void deleteOneNonExistingElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        Integer[] correctAnswer = new Integer[]{1, 2, 3, 777};

        Assertions.assertFalse(container.delete(9));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }


    @Test
    public void deleteOneElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        Integer[] correctAnswer = new Integer[]{1, 2, 3};

        Assertions.assertTrue(container.delete((Integer) 777));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void deleteOneNonExistingElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        Integer[] correctAnswer = new Integer[]{1, 2, 3, 777};

        Assertions.assertFalse(container.delete((Integer) 9));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void deleteOneNotLastElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777, 8});
        Integer[] correctAnswer = new Integer[]{1, 2, 3, 8};


        Assertions.assertTrue(container.delete(3));
        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }


    @Test
    public void sortIntegerWithComparator() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{0, -15, 110, -77, 11});
        container.sort(new ComparatorComparable<>());
        Integer[] correctAnswer = new Integer[]{-77, -15, 0, 11, 110};

        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void sortIntegerWithComparatorReversed() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{0, -15, 110, -77, 11});
        container.sort(new ComparatorComparable<Integer>().reversed());
        Integer[] correctAnswer = new Integer[]{110, 11, 0, -15, -77};

        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }


    @Test
    public void sortStringWithDataContainer() {
        DataContainer<String> container = new DataContainer<>(new String[]{"Привет", "Как дела?", " ", "Работаю", null, "Давай потом"});
        DataContainer.sort(container);
        String[] correctAnswer = new String[]{null, " ", "Давай потом", "Как дела?", "Привет", "Работаю"};

        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void sortStringWithDataContainerEmpty() {
        DataContainer<String> container = new DataContainer<>(new String[]{});
        container.sort(new ComparatorComparable<>());
        String[] correctAnswer = new String[]{};

        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void sortRelativesWithDataContainerAndComp() {
        RelativesForTest[] family = new RelativesForTest[]{new RelativesForTest("Андрей", "муж", 36),
                new RelativesForTest("Юлия", "жена", 34),
                new RelativesForTest("Влада", "дочь", 4.2),
                new RelativesForTest("Роман", "сын", 2.5)};

        DataContainer<RelativesForTest> container = new DataContainer<>(family);
        sort(container, new RelativesForTest_Name());
        RelativesForTest[] correctAnswer = {new RelativesForTest("Андрей", "муж", 36),
                new RelativesForTest("Влада", "дочь", 4.2),
                new RelativesForTest("Роман", "сын", 2.5),
                new RelativesForTest("Юлия", "жена", 34)};

        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }

    @Test
    public void sortRelativesWithDataContainerAndCompReversed() {
        RelativesForTest[] family = new RelativesForTest[]{new RelativesForTest("Андрей", "муж", 36),
                new RelativesForTest("Юлия", "жена", 34),
                new RelativesForTest("Влада", "дочь", 4.2),
                new RelativesForTest("Роман", "сын", 2.5)};

        DataContainer<RelativesForTest> container = new DataContainer<>(family);
        sort(container, new RelativesForTest_Name().reversed());
        RelativesForTest[] correctAnswer = {new RelativesForTest("Юлия", "жена", 34),
                new RelativesForTest("Роман", "сын", 2.5),
                new RelativesForTest("Влада", "дочь", 4.2),
                new RelativesForTest("Андрей", "муж", 36)};

        Assertions.assertArrayEquals(correctAnswer, container.getItems());
    }


    @Test
    public void toStringWithNulls() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 2, 3, null});
        String correctAnswer = "[1, 2, 3]";

        Assertions.assertEquals(correctAnswer, container.toString());
    }

    @Test
    public void toStringNull() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{null});
        String correctAnswer = "[]";

        Assertions.assertEquals(correctAnswer, container.toString());
    }
}
