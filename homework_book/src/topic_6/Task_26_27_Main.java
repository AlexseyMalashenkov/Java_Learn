package topic_6;

public class Task_26_27_Main {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(20);
        TimeInterval timeInterval2 = new TimeInterval(19);

        System.out.println(timeInterval1.compare(timeInterval2));

        ATM atm = new ATM(1, 2, 3);
        System.out.println(atm.toString());
        atm.addMoney(1,2,3);
        atm.withdrawMoney(1,0,0);
        System.out.println(atm.toString());
    }
}
