package homework_2;

public class Task_1_1 {
    public static void main(String[] args) {
        int result = 1;

        if (args.length != 0) {
            try {
                for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
                    result *= i;
                    if (i == Integer.parseInt(args[0])) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + " * ");
                    }
                }
                System.out.println(" = " + result);
            }
            catch (Exception exception) {
                System.out.println(exception.toString());
            }
        } else {
            System.out.println("Вы не ввели аргумент к исполняемой программе");
        }
    }
}
