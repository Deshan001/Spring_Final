package lk.ijse.gdse63.finalproject.exception;

public class DeleteFailException extends Exception{
    public DeleteFailException(String message){
        super(message);
    }

    public DeleteFailException(String message, Throwable cause){
        super(message,cause);
    }
}
