package home_work_4.additional;

import home_work_4.additional.сomparator.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Класс хранит методы над данными обобщенного типа
 *
 * @param <T> обощенный тип
 */
public class DataContainer<T> implements Iterable<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод добавляет данные во внутреннее поле data
     *
     * @param item данные типа Т, которые надо добавить
     * @return номер позиции в которую были вставлены данные, начиная с 0
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }

        if (this.data.length == 0 || this.data[this.data.length - 1] != null) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);

            this.data[this.data.length - 1] = item;
            return this.data.length - 1;
        }
        return -1;
    }

    /**
     * Метод по индексу получает объект из поля data
     *
     * @param index индекс, по которому нужно получить объект
     * @return объект типа Т
     */
    public T get(int index) {
        if (index < 0 || index > this.data.length - 1) {
            return null;
        }
        return this.data[index];
    }

    /**
     * Метод возвращает значение поля data
     *
     * @return поле data
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Метод удаляет элемент из поля data по индексу
     *
     * @param index элемента, который нужно удалить
     * @return true при удалении элемента или false если этого не произошло
     */
    public boolean delete(int index) {
        if (index < 0 || index >= this.data.length) {
            return false;
        } else {
            for (int i = index; i < this.data.length - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
            return true;
        }
    }

    /**
     * Метод удаляет элемент из поля data
     *
     * @param item элемент, который удаляем
     * @return true при удалении элемента или false если этого не произошло
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].equals(item)) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Метод сравнивает объект DataContainer <?> с другим объектом
     *
     * @param obj объект, c которым необходимо сравнить текущий объект
     * @return если объекты равны - true, если объекты не равны - false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        DataContainer<?> other = (DataContainer<?>) obj;
        return Arrays.equals(data, other.data);
    }

    /**
     * Метод получает hash-сode объекта по полю data
     *
     * @return hash-сode объекта
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }

    /**
     * Метод сортирует данные в поле data с использованием реализации сравнения из переданного объекта comparator
     *
     * @param comparator сравнитель для сравнения данных в поле data
     */
    public void sort(Comparator<T> comparator) {
        sort(this, comparator);
    }

    /**
     * Метод выводит содержимое data без ячеек, в которых хранится null
     *
     * @return поле data без ячеек с null в виде строки
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        boolean needComma = false;
        for (T item : this.data) {
            if (item != null) {
                if (needComma) {
                    builder.append(", ");
                } else {
                    needComma = true;
                }
                builder.append(item);
            }
        }
        builder.append("]");

        return builder.toString();
    }

    /**
     * Метод сортирует элементы в передеданном объекте DataContainer, используя реализацию сравнения вызываемую у хранимых объектов
     *
     * @param container объект DataContainer, элементы в котором необходимо отсортировать
     * @param <T>       обобщенный тип параметра container, который связан с интерфейсом Comparable
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        sort(container, new ComparatorComparable<>());
    }

    /**
     * Метод сортирует элементы в переданном объекте DataContainer с использованием реализации сравнения
     * из переданного объекта интерфейса Comparator.
     *
     * @param container  объект DataContainer, элементы в котором необходимо отсортировать
     * @param comparator сравнитель для сравнения данных в поле data
     * @param <T>        обобщенный тип параметров container и comparator
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        boolean needRepeat;
        do {
            needRepeat = false;
            for (int i = 0; i < container.data.length; i++) {
                for (int j = i + 1; j < container.data.length; j++) {
                    if (comparator.compare(container.data[i], container.data[j]) > 0) {
                        needRepeat = true;
                        T temp = container.data[i];
                        container.data[i] = container.data[j];
                        container.data[j] = temp;
                        break;
                    }
                }
            }
        } while (needRepeat);
    }

    //реализация интерфейса Iterable
    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator();
    }

    // класс с реализацией интерфейса Iterator
    class DataContainerIterator implements Iterator<T> {
        private int index;

        public DataContainerIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public T next() {
            return data[index++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}