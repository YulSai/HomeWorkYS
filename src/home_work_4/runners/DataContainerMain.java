package home_work_4.runners;

import home_work_4.additional.DataContainer;
import home_work_4.additional.RelativesForTest.RelativesForTest;
import home_work_4.additional.RelativesForTest.comparatorForTest.RelativesForTest_Age;
import home_work_4.additional.RelativesForTest.comparatorForTest.RelativesForTest_Name;
import home_work_4.additional.сomparator.ComparatorComparable;
import home_work_4.additional.сomparator.StringComparator;

import java.util.Arrays;

import static home_work_4.additional.DataContainer.sort;

/**
 * Класс для тестирования с типом передаваемых данных String
 */
public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]);

       // метод add
        int index1 = container.add("Привет...");
        container.add("Привет! Ты как?");
        container.add("Да никак. А ты?");
        container.add("И я ((.");
        container.add("Пока?");
        container.add("Ну... пока.");

        // метод get, методы delete
        String text1 = container.get(index1);
        System.out.println(text1);

        System.out.println();

        System.out.println("Изначальные элементы " + Arrays.toString(container.getItems()));
        // удаляем элемент Привет
        container.delete("Да никак. А ты?");
        System.out.println("Элементы после удаления " + Arrays.toString(container.getItems()));
        System.out.println();
        // удаляем элементы "Привет..." и "Привет! Ты как?" по номеру их индекса
        System.out.println("Изначальные элементы " + Arrays.toString(container.getItems()));
        container.delete(1);
        container.delete(text1);
        System.out.println("Элементы после удаления " + Arrays.toString(container.getItems()));

        System.out.println();

        // метод getItems, sort (comparator) и toString
        System.out.println("Изначальные элементы " + Arrays.toString(container.getItems()));
        container.sort(new StringComparator());
        System.out.println("Элементы после удаления " + container);

        System.out.println("Изначальные элементы " + Arrays.toString(container.getItems()));
        container.sort(new ComparatorComparable<>());
        System.out.println("Элементы после удаления " + container);

        System.out.println();

        //метод sort (DataContainer)
        DataContainer<Integer> container2 = new DataContainer<>(new Integer[]{120, null, 5, null, null, -2, 0, 10});

        System.out.println("Элементы до сортировки: " + Arrays.toString(container2.getItems()));
        sort(container2);
        System.out.println("Элементы после сортировки: " + Arrays.toString(container2.getItems()));
        System.out.println("Элементы после сортировки без null: " + container2);

        System.out.println();

        // метод метод sort(DataContainer, comparator)
        DataContainer<RelativesForTest> container3 = new DataContainer<>(new RelativesForTest[]
                {new RelativesForTest("Андрей", "муж", 36), new RelativesForTest("Юлия", "жена", 34),
                        new RelativesForTest("Влада", "дочь", 4.2),
                        new RelativesForTest("Роман", "сын", 2.5)});

        System.out.println("Элементы до сортировки: " + Arrays.toString(container3.getItems()));
        System.out.println();

        sort(container3, new RelativesForTest_Name());
        System.out.println("Элементы после сортировки по имени: " + container3);
        System.out.println();

        sort(container3, new RelativesForTest_Age());
        System.out.println("Элементы после сортировки по возрасту: " + container3);
    }
}