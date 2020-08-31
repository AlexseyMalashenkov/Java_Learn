package topic_5;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = createArr(1, 99);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" " + "\n");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static int[] createArr(int min, int max) {
        int countElem = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                countElem++;
            }
        }

        int[] arr = new int[countElem];
        int j = 0;

        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}
