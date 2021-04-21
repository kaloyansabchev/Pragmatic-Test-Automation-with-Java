package homework;

public class NotPositiveAgeException extends Exception{
    public NotPositiveAgeException() {
    }

    public NotPositiveAgeException(String message) {
        super(message);
    }

    public NotPositiveAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPositiveAgeException(Throwable cause) {
        super(cause);
    }

    public NotPositiveAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
