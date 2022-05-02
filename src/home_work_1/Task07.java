package home_work_1;

//приоритетность операторов 2.5 (5 * 2 >> 2++) / --8

public class Task07 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = 8;
        b = 2;
        c = 5;

        d = (c * b >> b++);  // сначала c * b (=10) затем сдвигаем b на 10 (=2) и увеличиваем b на единицу (=3); =2
        System.out.println(d);
    }
}
