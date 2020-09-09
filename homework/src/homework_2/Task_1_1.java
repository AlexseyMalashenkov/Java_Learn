package homework_2;

public class Task_1 {
    public static void main(String[] args) {
        int result = 1;

        for (String arg : args) {
            try {
                result *= Integer.parseInt(arg);
                System.out.print(Integer.parseInt(arg) + " * ");
            } catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }
    }
}
