package exceptions.elite_exceptions;

public class IntLessNullException extends IllegalArgumentException{
    public IntLessNullException() {
        super("Вы передали отрицательное число");
    }

    public IntLessNullException(String s) {
        super(s);
    }

    public IntLessNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntLessNullException(Throwable cause) {
        super(cause);
    }
}
