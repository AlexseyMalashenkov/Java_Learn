package topic_4;

public class Task_17 {
    public static void main(String[] args) {
        accountingTypeOfNumber(20_023_143);
    }

    public static void accountingTypeOfNumber(long num) {
        if ( num == 0 ) return;
        accountingTypeOfNumber( num / 1000 );
        System.out.print( num % 1000 + " " );
    }
}
