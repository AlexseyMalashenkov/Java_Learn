package topic_3;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println(checkLastNumber(17));
    }

    public static boolean checkLastNumber(int num) {
        boolean isSeven = false;

        if(num == 0) {
            isSeven = false;
        } else if((Math.abs(num) - 7) % 10 != 0) {
            isSeven = false;
        } else {
            isSeven = true;
        }

        return isSeven;
    }
}
