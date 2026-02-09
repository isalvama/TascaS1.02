package FirstLevel.Ex1;

public class EmptySaleException extends Exception {
    public EmptySaleException (String message){
        super(message);
    }
    public EmptySaleException(String message, Throwable cause){
        super(message, cause);
    }
}
