package homework_1;

public class Task_1 {
    public static void main(String[] args) {
        int x = 0b0010_1010;
        int y = 0b0000_1111;

        System.out.println("42 | 15 = " + (x | y));
        // 42 - 0010 1010
        // 15 - 0000 1111
        //      0010 1111 -> 47
        System.out.println("42 |= 15 = " + (x |= y));
        // 42 - 0010 1010
        // 15 - 0000 1111
        //      0010 1111 -> 47
        System.out.println("42 & 15 = " + (x & y));
        // 42 - 0010 1010
        // 15 - 0000 1111
        //      0000 1010 -> 10
        System.out.println("42 &= 15 = " + (x &= y));
        // 42 - 0010 1010
        // 15 - 0000 1111
        //      0000 1010 -> 10
        System.out.println("42 ^ 15 = " + (x ^ y));
        // 42 - 0010 1010
        // 15 - 0000 1111
        //      0010 0101 -> 37
        System.out.println("42 ^= 15 = " + (x ^= y));
        // 42 - 0010 1010
        // 15 - 0000 1111
        //      0010 0101 -> 37
        System.out.println("~42 = " + (~x));
        // 42 - 0010 1010
        //      1101 0101 -> -43
        System.out.println("~15 = " + (~y));
        // 15 - 0001 0101
        //      1110 1010 -> -16
        System.out.println("42 << 1 = " + (x << 1));
        // 42 - 0010 1010
        //      0101 0100  -> 84
        System.out.println("42 <<= 1 = " + (x <<= 1));
        // 42 - 0010 1010
        //      0101 0100  -> 84
        System.out.println("15 >> 1 = " + (y >> 1));
        // 15 - 0001 0101
        //      0000 0111 -> 7
        System.out.println("15 >>= 1 = " + (y >>= 1));
        // 15 - 0001 0101
        //      0000 0111 -> 7
        System.out.println("15 >>> 1 = " + (x >>> 1));
        // 42 - 0010 1010
        //      0001 0101 -> 21
        System.out.println("15 >>>= 1 = " + (x >>>= 1));
        // 42 - 0010 1010
        //      0001 0101 -> 21

        x = -42;
        y = -15;

        System.out.println("-42 | -15 = " + (x | y));
        // -42 - 1101 0110
        // -15 - 1111 0001
        //       1111 0111 -> -9
        System.out.println("-42 |= -15 = " + (x |= y));
        // -42 - 1101 0110
        // -15 - 1111 0001
        //       1111 0111 -> -9
        System.out.println("-42 & -15 = " + (x & y));
        // -42 - 1101 0110
        // -15 - 1111 0001
        //       1101 0000 -> -48
        System.out.println("-42 &= -15 = " + (x &= y));
        // -42 - 1101 0110
        // -15 - 1111 0001
        //       1101 0000 -> -48
        System.out.println("-42 ^ -15 = " + (x ^ y));
        // -42 - 1101 0110
        // -15 - 1111 0001
        //       0010 0111 -> 39
        System.out.println("-42 ^= -15 = " + (x ^= y));
        // -42 - 1101 0110
        // -15 - 1111 0001
        //       0010 0111 -> 39
        System.out.println("~-42 = " + (~x));
        // -42 - 1101 0110
        //       0010 1001 -> 41
        System.out.println("~-15 = " + (~y));
        // -15 - 1111 0001
        //       0000 1110 -> 14
        System.out.println("-42 << 1 = " + (x << 1));
        // -42 - 1101 0110
        //       1010 1100 -> -84
        System.out.println("-42 <<= 1 = " + (x <<= 1));
        // -42 - 1101 0110
        //       1010 1100 -> -84
        System.out.println("-15 >> 1 = " + (y >> 1));
        // -15 - 1111 0001
        //       1111 1000 -> -8
        System.out.println("-15 >>= 1 = " + (y >>= 1));
        // -15 - 1111 0001
        //       1111 1000 -> -8
        System.out.println("-42 >>> 1 = " + (x >>> 1));
        // -42 - 1101 0110
        //       0111 1111 1111 1111 1111 1111 1110 1011 -> 2147483627
        System.out.println("-42 >>>= 1 = " + (x >>>= 1));
        // -42 - 1101 0110
        //       0111 1111 1111 1111 1111 1111 1110 1011 -> 2147483627
    }
}
