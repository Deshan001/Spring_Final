package lk.ijse.gdse63.usertravelpackagemicroservice.exception;

public class UpdateFailException extends Exception{
    public UpdateFailException(String message){
        super(message);
    }

    public UpdateFailException(String message, Throwable cause){
        super(message,cause);
    }
}
