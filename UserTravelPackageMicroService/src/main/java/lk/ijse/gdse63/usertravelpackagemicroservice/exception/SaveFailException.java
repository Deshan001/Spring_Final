package lk.ijse.gdse63.usertravelpackagemicroservice.exception;

public class SaveFailException extends Exception{
    public SaveFailException(String message){
        super(message);
    }

    public SaveFailException(String message, Throwable cause){
        super(message,cause);
    }
}
