package ik.ijse.gdse63.finalproject.exeption;

public class CreateFailException extends Exception{
    public CreateFailException(String message , Throwable cause){
        super(message+ " : ("+ cause.getMessage(),cause);
    }
}
