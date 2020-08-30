package topic_5;

public class Task_20 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int maxNumber = 0;
        int maxIndex = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random()*(600+1)) - 200;
        }

        for (int i = 0; i < mass.length; i++) {
            if(maxNumber <= mass[i]){
                maxNumber = mass[i];
                maxIndex = i;
            }
        }

        for (int y : mass) {
            System.out.print(y + " ");
        }
        System.out.println("\n" + maxIndex);

    }
}
