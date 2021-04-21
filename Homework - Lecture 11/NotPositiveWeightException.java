package homework;

public class NotPositiveWeightException extends Exception{
    public NotPositiveWeightException() {
    }

    public NotPositiveWeightException(String message) {
        super(message);
    }

    public NotPositiveWeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPositiveWeightException(Throwable cause) {
        super(cause);
    }

    public NotPositiveWeightException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
