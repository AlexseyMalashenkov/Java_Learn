package homework_2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");

        try {
            int arrayLengths = scanner.nextInt();

            if (arrayLengths > 0) {
                int[] array = new int[arrayLengths];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Введите элемент массива с индексом = " + i);
                    array[i] = scanner.nextInt();
                }

                arrayOutDoWhile(array);
                arrayOutWhile(array);
                arrayOutFor(array);
                arrayOutForeach(array);
                arraySecondElementOut(array);
                arrayOutDoWhileRevers(array);
                arrayOutWhileRevers(array);
                arrayOutForRevers(array);
                arrayOutForeachRevers(array);
            } else {
                System.out.println("Вы ввели не правильный размер массива");
            }
        } catch (Exception exception) {
            System.out.println(exception.toString() + " Что-то пошло не так...");
        }
    }

    public static void arrayOutDoWhile(int[] mass) {
        int i = 0;
        do {
            System.out.print(mass[i] + " ");
            i++;
        } while (i < mass.length);
        System.out.println("");
    }

    public static void arrayOutWhile(int[] mass) {
        int i = 0;
        while (i < mass.length) {
            System.out.print(mass[i] + " ");
            i++;
        }
        System.out.println("");
    }

    public static void arrayOutFor(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
    }

    public static void arrayOutForeach(int[] mass) {
        for (int num : mass) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static void arraySecondElementOut(int[] mass) {
        for (int i = 1; i < mass.length; i += 2) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
    }

    public static void arrayOutDoWhileRevers(int[] mass) {
        int i = mass.length - 1;
        do {
            System.out.print(mass[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println("");
    }

    public static void arrayOutWhileRevers(int[] mass) {
        int i = mass.length - 1;
        while (i >= 0) {
            System.out.print(mass[i] + " ");
            i--;
        }
        System.out.println("");
    }

    public static void arrayOutForRevers(int[] mass) {
        for (int i = mass.length - 1; i >= 0 ; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
    }

    public static void arrayOutForeachRevers(int[] mass) {
        int[] tmpRevers = arrayRevers(mass);

        for (int num : tmpRevers) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static int[] arrayRevers(int[] mass) {
        int[] tmp = new int[mass.length];
        int j = mass.length;

        for (int i = 0; i < mass.length; i++) {
            tmp[j - 1] = mass[i];
            j = j - 1;
        }

        return tmp;
    }
}
