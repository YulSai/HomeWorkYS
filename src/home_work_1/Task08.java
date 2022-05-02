package home_work_1;

//приоритетность операторов 2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8

public class Task08 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        boolean x;
        int y;
        int z;

        a = 8;
        b = 2;

        c = (5 + 7 > 20 ? 68 : 22 * b >> b++) / --a; // выражение 5+7=12 > 20 неверно; =false; 22 * b (=44), затем смешаем (=11)
                                                     // и увеличиваем b на единицу (=3) =11; а уменьшаем на еденицу (=7),
                                                    // затем 11/ а (= 7); = 1
        System.out.println(c);
    }
}
