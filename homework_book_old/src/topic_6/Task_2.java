package topic_6;

public class Task_2 {
    public static void main(String[] args) {
        int[][] matr = createMatr(8, 5, -99, 99);
        int max = 0;
        for (int i[] : matr) {
            for (int j : i) {
                System.out.print(j + " ");
                if(max < j) {
                    max = j;
                }
            }
            System.out.println("");
        }
        System.out.println(max);
    }

    public static int[][] createMatr(int str, int stlb, int minNum, int maxNum) {
        int[][] matr = new int[str][stlb];

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) (Math.random()*(200+1)) - 100;
            }
        }
        return matr;
    }
}
