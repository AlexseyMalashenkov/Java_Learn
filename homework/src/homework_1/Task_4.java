package homework_1;

public class Task_4 {
    public static void main(String[] args) {
        boolean isSleep = sleepIn(false, false);
        if(isSleep) {
            System.out.println("Можно спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == true || vacation == true) {
            return true;
        } else {
            return false;
        }
    }
}
