package homework_2;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        sortSelection(scanner);
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int tmp = 0;


        //for (int k = array.length - 1; k > 0; k--) {
        //    for (int i = 0; i < k; i++) {
        //        if (array[i] > array[i + 1]) {
        //            tmp = array[i];
        //            array[i] = array[i + 1];
        //            array[i + 1] = tmp;
        //        }
        //    }
        //    iteration++;
        //}
        
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    public static void shakerSort(int[] array) {
        int temp;
        int leftSide = 0;
        int rightSide = array.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
    }

    public static void sortSelection(Scanner scanner) {
        System.out.println("Для пузырьковой сортировки - нажмите 1, для шейкерной сортировке - нажмите 2");

        try {
            int sortSelection = scanner.nextInt();

            switch (sortSelection) {
                case 1:
                    System.out.println("Вы выбрали сортировку пузырьком");
                    selectingSortingObject(scanner, sortSelection);
                    break;
                case 2:
                    System.out.println("Вы выбрали шейкерную сортировку");
                    selectingSortingObject(scanner, sortSelection);
                    break;
                default:
                    System.out.println("Вы ввели не правильное число. Попробуйте ещё раз...");
                    sortSelection(scanner);
            }
        } catch (Exception exception) {
            System.out.println(exception.toString() + " Вы ввели не правильное число. Попробуйте ещё раз...");
        }
    }

    public static void selectingSortingObject(Scanner scanner, int typeSort) {
        System.out.println("Для сортировки заданных массивов - нажмите 1, для сортировки массива с рандомной длинной и рандомными значениями - нажмите 2, для сортировки созданного вами массива - нажмите 3");

        try {
            int selectingSortingObject = scanner.nextInt();

            switch (selectingSortingObject) {
                case 1:
                    System.out.println("Вы выбрали сортировку заданных массивов");
                    sortDefArrays(typeSort);
                    break;
                case 2:
                    System.out.println("Вы выбрали сортировку рандомного массива");
                    arrayRandom(typeSort);
                    break;
                case 3:
                    System.out.println("Вы выбрали сортировку массива задоного вручную");
                    arrayEnteredManually(typeSort, scanner);
                    break;
                default:
                    System.out.println("Вы ввели не правильное число. Попробуйте ещё раз...");
                    sortSelection(scanner);
            }
        } catch (Exception exception) {
            System.out.println(exception.toString() + " Вы ввели не правильное число. Попробуйте ещё раз...");
        }
    }

    public static void sortDefArrays(int typeSort) {
        int[][] arrays = {{1,2,3,4,5,6}, {1,1,1,1}, {9,1,5,99,9,9}, {}};

        for (int[] array : arrays) {
            if (typeSort == 1) {
                printArray(array);
                bubbleSort(array);
                System.out.print(" -> ");
                printArray(array);
                System.out.println();
            }
            else if (typeSort == 2) {
                printArray(array);
                shakerSort(array);
                System.out.print(" -> ");
                printArray(array);
                System.out.println();
            } else {
                System.out.println("Что-то пошло не так... Попробуйте ввести другие значения...");
            }
        }
    }

    public static void arrayEnteredManually(int typeSort, Scanner scanner) {
        System.out.println("Введите размер массива");

        try {
            int arrayLengths = scanner.nextInt();

            if (arrayLengths > 0) {
                int[] array = new int[arrayLengths];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Введите элемент массива с индексом = " + i);
                    array[i] = scanner.nextInt();
                }

                if (typeSort == 1) {
                    printArray(array);
                    bubbleSort(array);
                    System.out.print(" -> ");
                    printArray(array);
                    System.out.println();
                }
                else if (typeSort == 2) {
                    printArray(array);
                    shakerSort(array);
                    System.out.print(" -> ");
                    printArray(array);
                    System.out.println();
                } else {
                    System.out.println("Что-то пошло не так... Попробуйте ввести другие значения...");
                }

            } else {
                System.out.println("Вы ввели не правильный размер массива");
            }
        } catch (Exception exception) {
            System.out.println(exception.toString() + " Вы ввели не правильное число. Попробуйте ещё раз...");
        }
    }

    public static void arrayRandom(int typeSort) {
        Random rand = new Random();
        int[] arrayRand = new int[rand.nextInt(100)];

        for (int i = 0; i < arrayRand.length; i++) {
            arrayRand[i] = rand.nextInt(100);
        }

        if (typeSort == 1) {
            printArray(arrayRand);
            bubbleSort(arrayRand);
            System.out.print(" -> ");
            printArray(arrayRand);
            System.out.println();
        }
        else if (typeSort == 2) {
            printArray(arrayRand);
            shakerSort(arrayRand);
            System.out.print(" -> ");
            printArray(arrayRand);
            System.out.println();
        } else {
            System.out.println("Что-то пошло не так... Попробуйте ввести другие значения...");
        }
    }
}