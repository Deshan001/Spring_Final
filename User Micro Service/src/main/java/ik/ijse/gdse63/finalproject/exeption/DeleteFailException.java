package ik.ijse.gdse63.finalproject.exeption;

public class DeleteFailException extends Exception {
    public DeleteFailException(String message){
        super(message);
    }

    public DeleteFailException(String message, Throwable cause){

        super(message+ " : ("+ cause.getMessage(),cause);
    }
}
