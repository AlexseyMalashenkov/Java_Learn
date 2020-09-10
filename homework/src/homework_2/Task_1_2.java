package homework_2;

public class Task_1_2 {
    public static void main(String[] args) {
        int result = 1;

        if (args.length != 0) {
            try {
                int num = Integer.parseInt(args[0]);
                while (num != 0) {
                    result *= num % 10;

                    if (num < 10) {
                        System.out.print(num % 10);
                    } else {
                        System.out.print(num % 10 + " * ");
                    }

                    num /= 10;
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
