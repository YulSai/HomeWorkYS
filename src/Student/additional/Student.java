package Student.additional;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int number;
    private String name;
    private int age;
    private double mark;
    private boolean isOlympiads;

    public Student() {
    }

    public Student(int number, String name, int age, double mark, boolean isOlympiads) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.isOlympiads = isOlympiads;
    }

    @Override
    public String toString() {
        String printInfo =
                "{ №" + number +
                        " имя " + name +
                        ", возраст " + age +
                        ", оценка " + mark +
                        ", участник олимпиад ";
        printInfo += (isOlympiads ? "да" : "нет") + "}";

        return printInfo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isOlympiads() {
        return isOlympiads;
    }

    public void setOlympiads(boolean olympiads) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
