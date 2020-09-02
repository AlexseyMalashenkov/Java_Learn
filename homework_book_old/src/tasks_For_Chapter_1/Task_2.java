package tasks_For_Chapter_1;

public class Task_2 {
    public static void main(String[] args) {
        int numFour = 1221;
        int[] mass = new int[4];
        int i = 0;
        while (numFour != 0) {
            mass[i] = numFour % 10;
            numFour /= 10;
            i++;
        }
        if(mass[0] + mass[1] == mass[2] + mass[3]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int numThree = 122;
        int sum = 0;
        while (numThree != 0) {
            sum += numThree % 10;
            numThree /= 10;
        }
        if(sum % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int numTwo = 34;
        if(numTwo % 2 == 0 && numTwo >= 10 && numTwo < 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int aPif = 5;
        int bPif = 5;
        int cPif = 5;
        if(Math.pow(cPif, 2) == (Math.pow(aPif, 2) + Math.pow(bPif, 2))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(isDistinct(numFour));

    }

    public static boolean isDistinct(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }
}
