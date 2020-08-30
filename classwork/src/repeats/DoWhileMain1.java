package repeats;

public class DoWhileMain1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i < 20) {
            if(i % 2 == 0) { // 2+4+6+8+10+12+14+16+18
                sum += i;
            }
            i++;
        }
        System.out.println("sum = " + sum);




        int n = 5;

        do {
            System.out.println("Sample : " + n);
            n--;
        } while (n > 0);
    }
}
