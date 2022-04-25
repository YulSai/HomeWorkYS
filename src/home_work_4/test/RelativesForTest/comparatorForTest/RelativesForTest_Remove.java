package home_work_4.test.RelativesForTest.comparatorForTest;

import home_work_4.test.RelativesForTest.RelativesForTest;

import java.util.Comparator;

/**
 * Класс с компаратором для сравнения объектов RelativesForTest по степени родства
 */
public class RelativesForTest_Remove implements Comparator<RelativesForTest> {

    @Override
    public int compare(RelativesForTest o1, RelativesForTest o2) {
        return o1.getRemove().compareTo(o2.getRemove());
    }
}