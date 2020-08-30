package topic_3;

public class Task_8 {
    public static void main(String[] args) {
        money(104234);
    }

    public static void money(int m) {
        if(m == 1) {
            System.out.println(m + " рубль.");
        } else if (m == 0 || (m >= 5 && m <= 21)) {
            System.out.println(m + " рублей.");
        } else if ((m >= 2 && m <= 4) || (m - 2) % 10 == 0 || (m - 3) % 10 == 0 || (m - 4) % 10 == 0){
            System.out.println(m + " рубля.");
        } else {
            System.out.println(m + " рублей.");
        }
    }
}
