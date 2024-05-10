/**
 * CountException represents a custom exception for counting operations.
 * This exception is thrown when certain conditions are not met during counting.
 */
public class CountException extends Exception {
    /**
     * Constructs a new CountException with the specified detail message.
     * @param msg The detail message (which is saved for later retrieval by the getMessage() method).
     */
    public CountException(String msg) {
        super(msg);
    }
}
