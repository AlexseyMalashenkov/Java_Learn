package topic_5;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = createArr(2, 20);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" " + "\n");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] createArr(int min, int max) {
        int countElem = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                countElem++;
            }
        }

        int[] arr = new int[countElem];
        int j = 0;

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}
