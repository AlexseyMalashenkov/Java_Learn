package topic_6;

public class Task_1 {
    public static void main(String[] args) {
        int[][] matr = createMatr(8, 5, 10, 99);
        for (int i[] : matr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] createMatr(int str, int stlb, int minNum, int maxNum) {
        int[][] matr = new int[str][stlb];

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = minNum + (int) (Math.random() * maxNum);
            }
        }
        return matr;
    }
}
