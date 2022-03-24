package HomeWork1;

/*приоритетность операторов 2.8 6 - 2 > 3 && 12 * 12 <= 119
                            2.9 true && false */

public class Task10 {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        boolean c;
        boolean d;

        // 2.8 6 - 2 > 3 && 12 * 12 <= 119

        c = 6 - 2 > 3 && 12 * 12 <= 119; /* 6 - 2 (=4), потом сравниваем с 3; =true
                                            12 * 12 (=144), потом сравниваем с 119; =false
                                            т.к. оба операнда не равняются true, то результат выражения =false */
        System.out.println(c);


        // 2.9 true && false
        d = true && false;  //т.к. оба операнда не равняются true, то результат выражения =false
        System.out.println(d);
    }
}

