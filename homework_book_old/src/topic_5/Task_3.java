package topic_5;

public class Task_3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 9;

        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + (int) (Math.random() * b);
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + findEvenNumInArr(arr));
    }

    public static int findEvenNumInArr(int[] args) {
        int countEven = 0;
        for (int i = 0; i < args.length; i++) {
            if(args[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }
}
