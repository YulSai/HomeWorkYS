package home_work_1;

//приоритетность операторов 2.4 (5 + 2++) / --8

public class Task06 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = 8;
        b = 2;
        c = 5;

        d = (c + b++) / --a;    // сначала с + b (=7), затем b увеличиваем на 1 (=3), потом а уменьшаем на единицу
        System.out.println(d);  // (= 7) и потом делим (с+b=7) на а (=7); = 1
    }
}
