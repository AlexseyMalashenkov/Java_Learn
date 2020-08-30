package repeats;

public class ReturnMain1 {
    public static void main(String[] args) {
        printFirstFiveElements(5555);
    }

    static void printFirstFiveElements(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
            if (i == 5) return;
        }
    }
}