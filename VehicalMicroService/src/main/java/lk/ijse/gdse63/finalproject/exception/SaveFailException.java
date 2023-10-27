package lk.ijse.gdse63.finalproject.exception;

public class SaveFailException extends Exception{
    public SaveFailException(String message, Throwable cause) {
    super(message + " : "+cause.getMessage(), cause);
    }
}
