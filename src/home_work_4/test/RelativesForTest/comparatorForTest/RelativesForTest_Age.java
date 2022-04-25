package home_work_4.test.RelativesForTest.comparatorForTest;

import home_work_4.test.RelativesForTest.RelativesForTest;

import java.util.Comparator;

/**
 * класс с компаратором для сравнения объектов RelativesForTest по возрасту
 */
public class RelativesForTest_Age implements Comparator<RelativesForTest> {


    @Override
    public int compare(RelativesForTest o1, RelativesForTest o2) {
        return Double.compare(o2.getAge(), o1.getAge());
    }
}