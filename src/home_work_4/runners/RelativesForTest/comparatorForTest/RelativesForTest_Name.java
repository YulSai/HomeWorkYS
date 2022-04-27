package home_work_4.runners.RelativesForTest.comparatorForTest;

import home_work_4.runners.RelativesForTest.RelativesForTest;

import java.util.Comparator;

/**
 * Класс с компаратором для сравнения объектов RelativesForTest по имени
 */
public class RelativesForTest_Name implements Comparator<RelativesForTest> {

    @Override
    public int compare(RelativesForTest o1, RelativesForTest o2) {
        return o1.getName().compareTo(o2.getName());
    }
}