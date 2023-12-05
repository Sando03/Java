public class UnrecognisedRowException extends Exception {
    public String message;
    public UnrecognisedRowException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
