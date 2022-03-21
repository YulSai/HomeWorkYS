package HomeWork1;

/*приоритетность операторов
2.1 5 + 2 / 8
2.2 (5 + 2) / 8
 */

public class Task04 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = 8;
        b = 2;
        c = 5;

        d = c + b / a;          // сначала b / а (=0), потом прибавляем с; = 5
        System.out.println(d);

        d = (c + b) / a;        // сначала с + b (=7), потом делим на а; = 0
        System.out.println(d);
    }
}
