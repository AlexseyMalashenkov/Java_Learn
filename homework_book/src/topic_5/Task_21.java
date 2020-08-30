package topic_5;

public class Task_21 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int maxNumber = 0;
        int minNumber = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random()*(600+1)) - 200;
        }

        for (int i = 0; i < mass.length; i++) {
            if(maxNumber <= mass[i]){
                maxNumber = mass[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            if(minNumber >= mass[i]){
                minNumber = mass[i];
                minIndex = i;
            }
        }

        for (int i : mass){
            System.out.print(i + " ");
        }
        System.out.println("\nMax - " + maxNumber + " index - " + maxIndex);
        System.out.println("Min - " + minNumber + " index - " + minIndex);

        int min = Math.min(maxIndex, minIndex);
        int max = Math.max(maxIndex, minIndex);
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += mass[i];
        }
        System.out.println(sum);
    }
}
