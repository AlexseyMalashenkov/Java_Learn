package exceptions;

public class ExceptionsMain3 {
    public static void main(String[] args) {
        System.out.println("Начинаем работать");

        try {
            method1();
        } catch (RuntimeException runtimeException) {
            System.out.println("Я словить!");
        }

        System.out.println("Всё ок, завершаем");
    }

    public static void method1() {
        System.out.println("Начинает работать method1");

        if (1 == 1) {
            throw new RuntimeException("У нас все очень плохо");
        }

        System.out.println("Заканчивает работать method1");
    }
}