package homework_2;

public class Task_1_1 {
    public static void main(String[] args) {
        int result = 1;

        try {
            if (args.length > 1) {
                System.out.println("В программу можно передать только один аргумент");
            }
            int tmp = Integer.parseInt(args[0]);
            for (int i = 1; i <= tmp; i++) {
                result *= i;
                if (i == tmp) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " * ");
                }
            }
            System.out.println(" = " + result);
        }
        catch (Exception exception) {
            System.out.println("Вы не ввели аргумент к исполняемой программе или он не корректный");
        }
    }
}
