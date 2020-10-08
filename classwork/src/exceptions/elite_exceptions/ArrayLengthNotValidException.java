package exceptions.elite_exceptions;

public class ArrayLengthNotValidException extends IllegalArgumentException {
    public ArrayLengthNotValidException() {
        super("Длинна массива не валидна");
    }

    public ArrayLengthNotValidException(int length) {
        super("Длинна массива " + length + " не валидна");
    }

    public ArrayLengthNotValidException(int length, int exceptedLength) {
        super("Длинна массива не валидна");
    }

    public ArrayLengthNotValidException(String s) {
        super(s);
    }

    public ArrayLengthNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayLengthNotValidException(Throwable cause) {
        super(cause);
    }
}