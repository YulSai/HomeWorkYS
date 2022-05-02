package home_work_1;

//приоритетность операторов 2.3 (5 + 2++) / 8

public class Task05 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = 8;
        b = 2;
        c = 5;

        d = (c + b++) / a;      // сначала с + b (=7), затем b увеличиваем на 1 (=3), потом (с+b=7) делим на а; = 0
        System.out.println(d);
    }
}

