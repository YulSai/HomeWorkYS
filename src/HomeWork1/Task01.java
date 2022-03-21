package HomeWork1;

//1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15

public class Task01 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 42;     // 00101010
        b = 15;     // 00001111

        c = ~a;           // ~00101010 = 1101 0100
        System.out.println("~ " + a + " = " + c);

        c = ~b;           // ~00001111 = 11110000
        System.out.println("~ " + b + " = " + c);

        c = a & b;        // 00101010 & 00001111 = 00010000

        System.out.println(a + " & " + b + " = " + c);

        c = a | b;      // 00101010 | 00001111 = 00101111
        System.out.println(a + " | " + b + " = " + c);

        c = a ^ b;      // 00101010 ^ 00001111 = 00110111
        System.out.println(a + " ^ " + b + " = " + c);

        c = a >> b;      // 00101010 >> 00001111 = 00000000
        System.out.println(a + " >> " + b + " = " + c);

        c = b >> a;      // 00001111 >> 00101010 = 00000000
        System.out.println(a + " >> " + b + " = " + c);

        c = a >> 3;      // 00101010 >> 00000011 = 00000101
        System.out.println(a + " >> 3" + " = " + c);

        c = b >> 1;      // 00001111 >> 00000001 = 00000111
        System.out.println(b + " >> 1" + " = " + c);

        c = a << b;      // 00101010 << 00001111 = 0001 0011 0111 0110 0010 0101 0110
        System.out.println(a + " << " + b + " = " + c);

        c = b << a;      // 00001111 << 00101010 = 0001 0101 0011 0110 0000
        System.out.println(b + " << " + a + " = " + c);

        c = a >>> b;      // 00101010 >>> 00001111 = 00000000
        System.out.println(a + " >>> " + b + " = " + c);

        c = b >>> a;      // 00001111 >> 00101010 = 00000000
        System.out.println(b + " >>> " + a + " = " + c);

        c = a >>> 2;      // 00101010 >>> 00000010 = 00010000
        System.out.println(a + " >>> 2" + " = " + c);

        c = b >>> 1;      // 00001111 >>> 00000001 = 00000111
        System.out.println(b + " >>> 1" + " = " + c);

        a >>= 3;          // 00101010 >>= 00000011 = 00000101
        System.out.println("42 >>= 3" + " = " + a);

        b >>= 1;          // 00001111 >> 00000001 = 00000111
        System.out.println("15 >>= 1" + " = " + b);
    }
}
