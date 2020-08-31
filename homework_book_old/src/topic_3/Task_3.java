package topic_3;

public class Task_3 {
    public static void main(String[] args) {
        signum(-13);
    }

    public static void signum(double num) {
        if(num < 0) {
            System.out.println(-1);
        }
        else if (num == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(+1);
        }
    }
}
