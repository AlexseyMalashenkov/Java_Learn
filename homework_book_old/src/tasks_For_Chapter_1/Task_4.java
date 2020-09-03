package tasks_For_Chapter_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 10000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
