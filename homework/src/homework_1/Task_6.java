package homework_1;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(array));
    }

    public static String createPhoneNumber(int[] mass) {
        String out = "";

        for (int i = 0; i < mass.length; i++) {
            if (i == 0) {
                out += '(';
            }
            else if (i == 3) {
                out += ") ";
            }
            else if (i == 6) {
                out += '-';
            }

            out += mass[i];
        }
        return out;
    }
}
