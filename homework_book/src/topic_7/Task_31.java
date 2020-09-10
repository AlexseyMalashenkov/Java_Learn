package topic_7;

import java.util.Date;

public class Task_31 {
    public static void main(String[] args) {
        //concatString();
        concatStringBuilder();
    }

    public static void concatString() {
        String str = "aaabbbccc";
        Date date1 = new Date();
        System.out.print(date1);
        for (int i = 0; i < 1_00;i++) {
            str += str;
        }
        Date date2 = new Date();
        System.out.println(" -> " + date2);
    }

    public static void concatStringBuilder() {
        StringBuffer strBuffer = new StringBuffer("aaabbbccc");
        Date date1 = new Date();
        System.out.print(date1);
        for (int i = 0; i < 1_00;i++) {
            strBuffer.append(strBuffer);
        }
        Date date2 = new Date();
        System.out.println(" -> " + date2);
    }
}
