public class NoMoreTicketsException extends Exception{
    public String message;

    public NoMoreTicketsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
