package exceptions;

import exceptions.elite_exceptions.AggregatedException;
import exceptions.elite_exceptions.ArrayLengthNotValidException;
import exceptions.elite_exceptions.IntLessNullException;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsMain5 {
    public static void main(String[] args) {
        try {
            validateArgument(args);
        } catch (ArrayLengthNotValidException | IntLessNullException e) {
            System.exit(12);
        } catch (IllegalArgumentException  | AggregatedException exception) {
            String message = exception.getMessage();
            if (message != null) {
                System.out.println(message);
            } else {
                System.out.println("Внутренняя ошибка сервера");
            }
        }
    }

    public static void validateArgument(String[] args){
        List<String> messages = new ArrayList<>();
        if (args.length != 1) {
            messages.add("Длина не 1");
        }

        String str = args[0];

        Long num = null;
        try {
            num = Long.parseLong(str);
        } catch (NumberFormatException exception) {
            messages.add("Первый аргумент не число");
        }

        if (num == null) {
            messages.add("Первый аргумент пустой");
        }

        if (num != null && num < 0) {
            messages.add("Первый аргумент отрицательный");
        }

        int length = String.valueOf(args[0]).length();
        if (length > 21) {
            messages.add("Первый аргумент более 21");
        }

        if (messages.size() > 0) {
            AggregatedException aggException = new AggregatedException(messages);
            throw aggException;
        }
    }
}