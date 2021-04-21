package homework;

public class NotPositiveHeightException extends Exception{
    public NotPositiveHeightException() {
    }

    public NotPositiveHeightException(String message) {
        super(message);
    }

    public NotPositiveHeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPositiveHeightException(Throwable cause) {
        super(cause);
    }

    public NotPositiveHeightException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
