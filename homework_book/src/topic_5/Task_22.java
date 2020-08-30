package topic_5;

public class Task_22 {
    public static void main(String[] args) {
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random()*(600+1)) - 200;
        }

        for (int i : mass) {
            System.out.print(i + " ");
        }

        int lengthDef = mass.length;
        int temp;

        for (int i = 0; i < lengthDef/2; i++) {
            temp = mass[lengthDef - i - 1];
            mass[lengthDef - i - 1] = mass[i];
            mass[i] = temp;
        }

        System.out.println("");

        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
    }
}
