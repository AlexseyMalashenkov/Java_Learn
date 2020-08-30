package topic_5;

public class Task_23 {
    public static void main(String[] args) {
        int mass[][]=new int[5][5];
        int i,j;

        for (i = 0; i < mass.length / 2 + 1; i++){
            for (j = 0; j < mass[i].length; j++){
                if ((j < i) || (j >= (mass[i].length - i)))
                    mass[i][j]=0;
                else
                    mass[i][j]=1;
            }
        }

        for (i = mass.length - 1; i >= mass.length / 2; i--){
            for (j = 0; j < mass[i].length; j++){
                if ((j < (mass[i].length - 1 - i)) || (j > i))
                    mass[i][j]=0;
                else
                    mass[i][j]=1;}
        }

        for (i = 0; i < mass.length; i++){
            for(j = 0; j < mass[i].length; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}