package exceptions;

import exceptions.elite_exceptions.ArrayLengthNotValidException;
import exceptions.elite_exceptions.IntLessNullException;

public class ExceptionsMain4 {
    public static void main(String[] args) {
        try {
            validateArgument(args);
        } catch (ArrayLengthNotValidException | IntLessNullException e) {
            System.exit(12);
        } catch (IllegalArgumentException exception) {
            String message = exception.getMessage();
            if (message != null) {
                System.out.println(message);
            } else {
                System.out.println("Внутренняя ошибка сервера");
            }
        }
    }

    public static void validateArgument(String[] args){
        if (args.length != 1) {
            throw new ArrayLengthNotValidException(args[0]);
        }

        String str = args[0];

        Long num = null;
        try {
            num = Long.parseLong(str);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Вы передали не число", exception);
        }

        if (num == 0) {
            throw new IllegalArgumentException("Передана пустота");
        }

        if (num < 0) {
            throw new IntLessNullException();
        }

        int length = String.valueOf(args[0]).length();
        if (length > 21) {
            throw new IllegalArgumentException("Число содержит более 21 цифры");
        }
    }
}